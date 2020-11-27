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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes({"userinfo"})
public class AuthenticationController {
	private static final long serialVersionUID = 1L;

	@Autowired
	DataFacade data;

	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	protected String loginForm() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	protected String checkLogin(Model model, @RequestParam("name") String name, @RequestParam("password") String password) {
		String expectedPassword = data.findPassword(name );
		
		if(expectedPassword == null || !expectedPassword.equals(password)) {
			model.addAttribute("errors", "Invalid username or password");
			model.addAttribute("name", name);
			return "index";
		} else {
			model.addAttribute("userinfo", name);
			System.out.println("session redirect: " + model.asMap().get("userinfo"));
			return  "redirect:/advice";
		}
	}
}
