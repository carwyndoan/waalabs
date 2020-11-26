package mum.controller;

import mum.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.validator.CalculatorValidator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletParm
 */
@Controller
public class CalculatorController {
	private static final long serialVersionUID = 1L;

	@AutoWired
	CalculatorValidator calculatorValidator;

	@RequestMapping(value = { "/", "/calculator_input" })
	 public String inputCalculator(HttpServletRequest request, HttpServletResponse response) {
		return "/WEB-INF/jsp/CalculatorForm.jsp";
	}

	@RequestMapping(value = "/calculator_save")
	public String saveCalculator(Calculator calculator, HttpServletRequest request, HttpServletResponse response) {
		List<String> errors = calculatorValidator.validate(calculator);
		if (errors.isEmpty()) {
			// store product in a scope variable for the view
			calculator.calcSum();
			calculator.calcProduct();
		} else {
			// store errors and product in a scope variable for the view
			request.setAttribute("errors", errors);
//			request.setAttribute("form", calculator);
//			return "/WEB-INF/jsp/CalculatorForm.jsp";
		}
		request.setAttribute("form", calculator);
		return "/WEB-INF/jsp/CalculatorForm.jsp";
	}

}
