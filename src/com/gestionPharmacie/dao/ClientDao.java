package com.gestionPharmacie.dao;

import com.gestionPharmacie.metier.IClient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.gestionPharmacie.dao.ConfigDB;
import com.gestionPharmacie.entites.Client;

public class ClientDao implements IClient {

	public Client find(int clientid) {
		Connection connection = (Connection) ConfigDB.getInstance().getConnection();
		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection.prepareStatement("SELECT * FROM client WHERE clientid = ?");
			stmt.setLong(1, clientid);
			ResultSet result = stmt.executeQuery();
			result.next();
			String nom = result.getString("nom");
			double credit = result.getDouble("credit");
			Client client = new Client(clientid, nom, credit);
			return client;
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;
	}

	@Override
	public void add(Client client) {
		Connection connection = (Connection) ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection.prepareStatement("INSERT INTO client VALUES (NULL, ?,?)");
			stmt.setString(1, client.getNom());
			stmt.setDouble(2, client.getCredit());
			stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

	}

	@Override
	public boolean update(Client client) {
		Connection connection = (Connection) ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection
					.prepareStatement("UPDATE client SET nom = ?,credit = ? WHERE clientid = ?");
			stmt.setString(1, client.getNom());
			stmt.setDouble(2, client.getCredit());
			return stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
		return false;
	}

	@Override
	public boolean delete(int clientid) {
		Connection connection = (Connection) ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM client WHERE clientid = ?");
			stmt.setInt(1, clientid);
			return stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
		return false;
	}

	@Override
	public Collection<Client> findAll() {
		Connection connection = (Connection) ConfigDB.getInstance().getConnection();
		Collection<Client> clients = new ArrayList<Client>();

		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection.prepareStatement("SELECT * FROM client");
			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				int clientid = result.getInt("clientid");
				String nom = result.getString("nom");
				double credit = result.getDouble("credit");
				Client client = new Client(clientid, nom, credit);
				clients.add(client);
			}
			return clients;
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;
	}

}
