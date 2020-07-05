package com.gestionPharmacie.entites;

public class Client {

	private int clientid;
	private String nom;
	private double credit;
	private String[] medicamentAcheter;

	public String[] getMedicamentAcheter() {
		return medicamentAcheter;
	}

	public void setMedicamentAcheter(String[] medicamentAcheter) {
		this.medicamentAcheter = medicamentAcheter;
	}

	public Client(int clientid, String nom, double credit) {
		super();
		this.clientid = clientid;
		this.nom = nom;
		this.credit = credit;

	}

	public Client(String nom, double credit) {
		this.nom = nom;
		this.credit = credit;

	}

	public int getClientid() {
		return clientid;
	}

	public void setClientid(int clientid) {
		this.clientid = clientid;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "Client [clientid=" + clientid + ", nom=" + nom + ", credit=" + credit + "]";
	}

}
