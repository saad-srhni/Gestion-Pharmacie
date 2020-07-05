package com.gestionPharmacie.controllers;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestionPharmacie.entites.Medicament;
import com.gestionPharmacie.metier.IMedicament;

/**
 * Servlet implementation class ListMedicament
 */
@WebServlet("/ListMedicament")
public class ListMedicament extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListMedicament() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 IMedicament imedicament = null ;
		 Collection<Medicament> medicaments= imedicament.findAll();
		 System.out.println(medicaments);
		//request.setAttribute("", );
		request.getRequestDispatcher("./WEB-INF/listmedicaments.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
