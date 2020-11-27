package edu.miu.controller;

import java.util.List;

import edu.miu.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"userinfo"})
public class AdviceController {
	private static final long serialVersionUID = 1L;

	@Autowired
	DataFacade data;

	@RequestMapping(value = "/advice", method = RequestMethod.GET)
	public String formAdvice(Model model) {
		System.out.println("session: " + model.asMap().get("userinfo"));
		if(!model.asMap().containsKey("userinfo")){
			return "redirect:/login";
		}
		return "advice";
	}

	@RequestMapping(value = "/advice", method = RequestMethod.POST)
	public String getAdvice(Model model, @RequestParam("roast") String roast) {
		List<String> advice = data.getAdvice(roast);
		model.addAttribute("roast", advice);
		return "advice";
	}

	@RequestMapping(value = "/logout")
	public String logout(Model model, SessionStatus status) {
		status.setComplete();
		return "redirect:/login";
	}
}
