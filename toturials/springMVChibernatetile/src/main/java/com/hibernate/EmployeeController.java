package com.hibernate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@RequestMapping(value = "/employee")
	public ModelAndView emp() {
		ModelAndView modelView = new ModelAndView("redirect:/employees");
		return modelView;
	}
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public String listemployees(Model model) {
		model.addAttribute("employee", new Employee());
		model.addAttribute("employeeList", employeeService.listEmployees());
		return "employee";
	}

	// Same method For both Add and Update Employee
	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public String addemployee(Model model, @Valid @ModelAttribute("employee") Employee employee, BindingResult br) {
		if(br.hasErrors()) {
			model.addAttribute("employeeList", employeeService.listEmployees());// for list to show 
			return "employee";
		}
		else {
			if (employeeService.getEmployeeById(employee.getId())==null) {
				// new employee, add it
				employeeService.addEmployee(employee);
			} else {
				// existing employee, call update
				employeeService.updateEmployee(employee);
			}
			return "redirect:/employees";
		}
		
	

	}

	@RequestMapping("/employee/remove/{id}")
	public String removeemployee(@PathVariable("id") int id) {

		employeeService.removeEmployee(id);
		return "redirect:/employees";
	}

	@RequestMapping("/employee/edit/{id}")
	public String editemployee(@PathVariable("id") int id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeById(id));
		model.addAttribute("employeeList", employeeService.listEmployees());
		return "employee";
	}
}
