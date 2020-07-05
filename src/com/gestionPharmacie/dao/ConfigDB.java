package com.gestionPharmacie.dao;
import java.sql.Connection;
import java.sql.DriverManager;



public class ConfigDB {
	private static ConfigDB instance;
	private ConfigDB() {
		
	}
	
	public static ConfigDB getInstance() {
		if(instance == null) {
			instance = new ConfigDB();
		}
		return instance;
	}
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/gestionpharmacie?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
		} catch (Exception e) {
			System.out.println("Erreur " + e.getMessage());
		}
		return connection;
	}
}

