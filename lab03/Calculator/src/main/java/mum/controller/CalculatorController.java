package mum.controller;

import mum.domain.Calculator;
import mum.validator.CalculatorValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Servlet implementation class MyServletParm
 */
@Controller
public class CalculatorController {
	private static final long serialVersionUID = 1L;

	@Autowired
	CalculatorValidator calculatorValidator;

	@RequestMapping(value = { "/", "/calculator_input" })
	 public String inputCalculator(HttpServletRequest request, HttpServletResponse response) {
		return "CalculatorForm";///WEB-INF/jsp/CalculatorForm
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
		return "CalculatorForm";
	}

}
