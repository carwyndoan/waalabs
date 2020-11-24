package mum.edu.cs.controller;

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

import mum.edu.data.*;
 
/**
 * Servlet implementation class AdviceServlet
 */
@WebServlet("/AdviceServlet")
public class AdviceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdviceServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String roast = request.getParameter("roast");
//
//  		DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
//		List<String> advice = data.getAdvice(roast);
//		request.setAttribute("roast", advice);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("../advice.jsp");
//		dispatcher.forward(request, response);
//		String adviceOutput = prepareAdviceOutput(roast, advice);
		
//		response.setContentType("text/html");
//		response.setHeader("Cache-Control", "no-cache");
//		PrintWriter writer = response.getWriter();
//		writer.println(adviceOutput);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roast = request.getParameter("roast");

		DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
		List<String> advice = data.getAdvice(roast);
		request.setAttribute("roast", advice);
		RequestDispatcher dispatcher = request.getRequestDispatcher("../advice.jsp");
		dispatcher.forward(request, response);
	}

}
