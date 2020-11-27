package edu.miu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.miu.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticationController {
	private static final long serialVersionUID = 1L;

	@Autowired
	DataFacade data;

	@RequestMapping(value = { "/", "/login" })
	protected String inputLogin(HttpServletRequest request, HttpServletResponse response) {
		return "index";
	}

	@RequestMapping(value = "/authenticate")
	protected String saveLogin(HttpServletRequest request, HttpServletResponse response) {
 
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		String expectedPassword = data.findPassword(name );
		
		if(expectedPassword == null || !expectedPassword.equals(password)) {
			request.setAttribute("errors", "Invalid username or password");
			request.setAttribute("name", name);
			return "index";
		} else {
			return  "advice";
		}
	}

}
