package com.gestionPharmacie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.gestionPharmacie.entites.Medicament;
import com.gestionPharmacie.metier.IMedicament;

public class MedicamentDao implements IMedicament{

	public Medicament find(int medicamentid) {
		Connection connection = (Connection) ConfigDB.getInstance().getConnection();
		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection.prepareStatement("SELECT * FROM medicament WHERE medicamentid = ?");
			stmt.setInt(1, medicamentid);
			ResultSet result = stmt.executeQuery();
			result.next();
			String libelle = result.getString("liblle");
			double prix = result.getDouble("prix");
			int qtestock = result.getInt("qtestock");
			Medicament medicament = new Medicament(medicamentid, libelle, prix, qtestock);
			return medicament;
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;
	}

	public void add(Medicament medicament) {
		Connection connection = (Connection) ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection.prepareStatement("INSERT INTO medicament VALUES (NULL,?,?,?)");
			stmt.setString(1, medicament.getLibelle());
			stmt.setDouble(2, medicament.getPrix());
			stmt.setInt(3, medicament.getQtestock());
			stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
	}

	public boolean update(Medicament medicament) {
		Connection connection = (Connection) ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection
					.prepareStatement("UPDATE medicament SET libelle = ?,prix = ?,qtestock=? WHERE medicamentid= ?");
			stmt.setInt(1, medicament.getMedicamentid());
			stmt.setString(2, medicament.getLibelle());
			stmt.setDouble(3, medicament.getPrix());
			stmt.setInt(4, medicament.getQtestock());
			return stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
		return false;
	}

	public boolean delete(int medicamentid) {
		Connection connection = (Connection) ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM medicament WHERE medicamentid = ?");
			stmt.setInt(1, medicamentid);
			return stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
		return false;
	}

	public Collection<Medicament> findAll() {
		Connection connection = (Connection) ConfigDB.getInstance().getConnection();
		Collection<Medicament> clients = new ArrayList<Medicament>();

		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection.prepareStatement("SELECT * FROM medicament");
			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				int medicamentid = result.getInt("medicamentid");
				String libelle = result.getString("libelle");
				double prix = result.getDouble("prix");
				int qtestock = result.getInt("qtestock");
				Medicament medicament = new Medicament(medicamentid, libelle, prix, qtestock);
				clients.add(medicament);
			}
			return clients;
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;
	}
}
