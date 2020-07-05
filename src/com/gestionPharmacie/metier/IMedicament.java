package com.gestionPharmacie.metier;

import java.util.Collection;

import com.gestionPharmacie.entites.Medicament;

public interface IMedicament {

	public Medicament find(int medicamentid);
	public void add(Medicament medicament);
	public boolean update(Medicament medicament);
	public boolean delete(int medicamentid);
	public Collection<Medicament> findAll();
}
