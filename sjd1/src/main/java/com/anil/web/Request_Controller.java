package com.anil.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anil.web.dao.Request_Dao;
import com.anil.web.model.Request;






public class Request_Controller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello");
		int id = Integer.parseInt(request.getParameter("id1"));
		Request_Dao dao = new Request_Dao();
		Request a1= dao.getrequest(id);
		request.setAttribute("a1", a1);
		RequestDispatcher rd = request.getRequestDispatcher("Show_request.jsp");
		rd.forward(request, response);
	}


}
