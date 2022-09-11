package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Signupcontroller")
public class Signupcontroller extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hellow from SignupController.............");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		
		//		request.setAttribute("firstName", firstName);
//		request.setAttribute("lastName",  lastName);
//		request.setAttribute("email",  email);
		request.setAttribute("password",  password);
//		request.setAttribute("gender",gender);
//		
		
		boolean isError = false;
		if(firstName == null || firstName.trim().length()==0 ) {
			isError = true;
			request.setAttribute("firstNameError", "<font color='red'>please Enter firstname</font>");
		}
		else {
				request.setAttribute("firstNamevalue",firstName);
			}
		
		if(lastName == null || lastName.trim().length()==0 ) {
			isError = true;
			request.setAttribute("lastNameError", "<font color='red'>please Enter lastname</font>");
		}
		else {
				request.setAttribute("lastNamevalue",firstName);
			}
		
		
		
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		} else {
			request.setAttribute("emailValue", email);
		}
		
		if (gender == null) {
			isError = true;
			request.setAttribute("genderError", "Please Select Gender");
		} else {
			request.setAttribute("genderValue", gender);
		}
		
		RequestDispatcher rd = null;
		
		if (isError == true) {
			// goback
			rd = request.getRequestDispatcher("signup.jsp");
			
		} else {
			// goahead
			// goto home.jsp
			rd = request.getRequestDispatcher("Home.jsp");

		}
		
		rd.forward(request, response);
		
//        RequestDispatcher rd  = request.getRequestDispatcher("Home.jsp");
//		rd.forward(request, response);
//		
		System.out.println("hellow from SignupController.............");
		 
	}
}