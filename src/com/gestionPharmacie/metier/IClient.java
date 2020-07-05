package com.gestionPharmacie.metier;

import java.util.Collection;

import com.gestionPharmacie.entites.Client;

public interface IClient {
	public Client find(int clientid);
	public void add(Client client);
	public boolean update(Client client);
	public boolean delete(int  clientid);
	public Collection<Client> findAll();
}
