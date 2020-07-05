package com.gestionPharmacie.view;

import com.gestionPharmacie.dao.ClientDao;
import com.gestionPharmacie.entites.Client;
import com.gestionPharmacie.metier.IClient;

public class Prog {

	public static void main(String[] args) {
		Client c1 = new Client("saad",12);
		IClient ic = new ClientDao();
		ic.add(c1);

	}

}
