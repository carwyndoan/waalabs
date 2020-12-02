package miu.edu.employeevalidation.controller;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import miu.edu.employeevalidation.domain.Employee;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class EmployeeController {

	private static final Log logger = LogFactory.getLog(EmployeeController.class);

	@Autowired
	ServletContext servletContext;

	@RequestMapping(value = { "/", "employee_input" })
	public String inputEmployee(@ModelAttribute("employee") Employee employee) {
		return "decorates/EmployeeForm";
	}

	@RequestMapping(value = "/employee_save")
	public String saveEmployee(@Valid Employee emp, BindingResult bindingResult,
			Model model) {
		
		if (bindingResult.hasErrors()) {
			return "decorates/EmployeeForm";
		}

		String[] suppressedFields = bindingResult.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder(): "
					+ StringUtils.addStringToArray(suppressedFields, ", "));
		}

//		MultipartFile productImage = emp.getEmployeeImage();
//		String rootDirectory =  servletContext.getRealPath("/");
//		if (productImage != null && !productImage.isEmpty()) {
//			try {
//				productImage.transferTo(
//						new File(rootDirectory + "resources\\images\\" + emp.getId() + ".png"));
//			} catch (Exception e) {
//				throw new RuntimeException("Product Image saving failed", e);
//			}
//		}

		// save product here
		model.addAttribute("employee", emp);

		return "decorates/EmployeeDetails";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[]{"firstName"});
	}
}
