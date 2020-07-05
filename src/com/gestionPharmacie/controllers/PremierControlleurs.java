
package com.gestionPharmacie.controllers;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestionPharmacie.dao.ClientDao;
import com.gestionPharmacie.entites.Client;
import com.gestionPharmacie.metier.IClient;



@WebServlet("/PremierControlleurs")
public class PremierControlleurs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		System.out.println("Appel du Premier Controller");
		System.out.println(request.getContextPath());
		IClient clientMetier = new ClientDao();
		Client client = clientMetier.find(1);
		request.setAttribute("client", client);
		request.getRequestDispatcher("./WEB-INF/clients.jsp").forward(request, reponse);
	}

  
	
}
