package com.gestionPharmacie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gestionPharmacie.entites.Medicament;
import com.gestionPharmacie.entites.Pharmacie;
import com.gestionPharmacie.metier.IPharmacie;

public class PharmacieDao implements IPharmacie{
	public void add(Pharmacie pharmacie) {
		Connection connection = (Connection) ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection.prepareStatement("INSERT INTO pharmacie VALUES (NULL,?,?,?,?,?,?)");
			stmt.setString(1, pharmacie.getNom());
			stmt.setDouble(2, pharmacie.getNombreClient());
			stmt.setInt(3, pharmacie.getNombreMedicament());
			stmt.setDouble(4, pharmacie.getSolde());
			stmt.setInt(5, pharmacie.getNombreMaxclient());
			stmt.setInt(6, pharmacie.getNombreMaxmedicament());
			stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
	}

}
