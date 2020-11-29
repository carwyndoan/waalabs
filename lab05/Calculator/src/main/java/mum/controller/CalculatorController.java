package mum.controller;

import mum.domain.Calculator;
import mum.validator.CalculatorValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;

/**
 * Servlet implementation class MyServletParm
 */
@Controller
public class CalculatorController {
	private static final long serialVersionUID = 1L;

	@Autowired
	CalculatorValidator calculatorValidator;

	@RequestMapping(value = { "/", "/calculator" }, method = RequestMethod.GET)
	 public String inputCalculator(@ModelAttribute("form") Calculator model) {
		return "CalculatorForm";
	}

	@RequestMapping(value = "/calculator", method = RequestMethod.POST)
	public String saveCalculator(Calculator calculator, RedirectAttributes redirectAttributes) {
		List<String> errors = calculatorValidator.validate(calculator);
		if (errors.isEmpty()) {
			// store product in a scope variable for the view
			calculator.calcSum();
			calculator.calcProduct();
			redirectAttributes.addFlashAttribute("Hello, love from post");
		} else {
			// store errors and product in a scope variable for the view
			redirectAttributes.addFlashAttribute("errors", errors);
		}
		redirectAttributes.addFlashAttribute("form", calculator);
		return "redirect:/calculator";
	}

}
