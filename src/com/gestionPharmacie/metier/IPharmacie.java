package com.gestionPharmacie.metier;

import java.util.Collection;

import com.gestionPharmacie.entites.Medicament;
import com.gestionPharmacie.entites.Pharmacie;

public interface IPharmacie {

	//public Pharmacie find(int pharmacieid);
	public void add(Pharmacie pharmacie);
	/*
	 * public boolean update(Pharmacie pharmacie); public boolean delete(int
	 * pharmacieid); public Collection<Medicament> findAll();
	 */
}
