package com.gestionPharmacie.entites;

public class Medicament {

	private int medicamentid;
	private String libelle;
	private double prix;
	private int qtestock;

	public String getLibelle() {
		return libelle;
	}

	public Medicament(int medicamentid, String libelle, double prix, int qtestock) {
		super();
		this.libelle = libelle;
		this.prix = prix;
		this.qtestock = qtestock;

	}

	public int getMedicamentid() {
		return medicamentid;
	}

	public void setMedicamentid(int medicamentid) {
		this.medicamentid = medicamentid;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQtestock() {
		return qtestock;
	}

	public void setQtestock(int qtestock) {
		this.qtestock = qtestock;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Medicament [medicamentid=" + medicamentid + ", libelle=" + libelle + ", prix=" + prix + ", qtestock="
				+ qtestock + "]";
	}

}
