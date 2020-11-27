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
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdviceController {
	private static final long serialVersionUID = 1L;

	@Autowired
	DataFacade data;

	@RequestMapping(value = "/get_advice")
	public String saveAdvice(HttpServletRequest request, HttpServletResponse response) {
		String roast = request.getParameter("roast");
		List<String> advice = data.getAdvice(roast);
		request.setAttribute("roast", advice);
		return "advice";
	}
}
