package com.gestionPharmacie.entites;

public class Pharmacie {

	private int pharmacieid;
	private String nom;
	private int nombreClient;
	private int nombreMedicament;
	private double solde;
	private int nombreMaxclient;
	private int nombreMaxmedicament;

	public Pharmacie(int pharmacieid, String nom, int nombreClient, int nombreMedicament, double solde,
			int nombreMaxclient, int nombreMaxmedicament) {
		super();
		this.pharmacieid = pharmacieid;
		this.nom = nom;
		this.nombreClient = nombreClient;
		this.nombreMedicament = nombreMedicament;
		this.solde = solde;
		this.nombreMaxclient = nombreMaxclient;
		this.nombreMaxmedicament = nombreMaxmedicament;

	}

	public int getPharmacieid() {
		return pharmacieid;
	}

	public void setPharmacieid(int pharmacieid) {
		this.pharmacieid = pharmacieid;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreClient() {
		return nombreClient;
	}

	public void setNombreClient(int nombreClient) {
		this.nombreClient = nombreClient;
	}

	public int getNombreMedicament() {
		return nombreMedicament;
	}

	public void setNombreMedicament(int nombreMedicament) {
		this.nombreMedicament = nombreMedicament;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public int getNombreMaxclient() {
		return nombreMaxclient;
	}

	public void setNombreMaxclient(int nombreMaxclient) {
		this.nombreMaxclient = nombreMaxclient;
	}

	public int getNombreMaxmedicament() {
		return nombreMaxmedicament;
	}

	public void setNombreMaxmedicament(int nombreMaxmedicament) {
		this.nombreMaxmedicament = nombreMaxmedicament;
	}

	@Override
	public String toString() {
		return "Pharmacie [pharmacieid=" + pharmacieid + ", nom=" + nom + ", nombreClient=" + nombreClient
				+ ", nombreMedicament=" + nombreMedicament + ", solde=" + solde + ", nombreMaxclient=" + nombreMaxclient
				+ ", nombreMaxmedicament=" + nombreMaxmedicament + "]";
	}

}
