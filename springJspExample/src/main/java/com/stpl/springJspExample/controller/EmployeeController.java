package com.stpl.springJspExample.controller;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.stpl.springJspExample.model.EmployeeBean;
import com.stpl.springJspExample.model.LoginBean;
import com.stpl.springJspExample.service.EmployeeService;
import com.stpl.springJspExample.service.LoginService;

@Controller
public class EmployeeController {
	@Autowired
	LoginService loginservice;
	@Autowired
	EmployeeService employeeservice;

	@RequestMapping("/redirect.htm")
	public ModelAndView displayLogin() {
		return new ModelAndView("Login", "comment", new LoginBean());

	}

	@RequestMapping(value = "/Login.htm", method = RequestMethod.POST)
	public ModelAndView submitLogin(@ModelAttribute LoginBean loginbean) {

		ModelAndView model = new ModelAndView("menu");
		model.addObject("userName", loginbean.getUserName());
		model.addObject("password", loginbean.getPassword());
		boolean result = loginservice.validatelogin(loginbean);
		if (result == true) {
			return model;
		} else {
			return new ModelAndView("/Loginfailure");
		}
	}

 	@RequestMapping("/menu.htm")
	public ModelAndView displaymenu() {
		return new ModelAndView("menu");
	}

	@RequestMapping("/Addemployee.htm")
	public ModelAndView Addemployeemenu() {
		return new ModelAndView("Addemployee", "command", new EmployeeBean());
	}

	@RequestMapping(value = "/Addemployee.htm", method = RequestMethod.POST)
	public ModelAndView submitaddstudent(@ModelAttribute EmployeeBean employeebean)
			throws ClassNotFoundException, SQLException, NamingException {

		// ModelAndView model=new ModelAndView("/menu");
		employeeservice.insert(employeebean);
		if (employeebean.equals(null)) {
			return new ModelAndView("/addfailure");
		}
		return new ModelAndView("/addsuccessful");

	}

	@RequestMapping("/Deleteemployee.htm")
	public ModelAndView deletestudentmenu() {
		return new ModelAndView("Deleteemployee", "command", new EmployeeBean());

	}

	@RequestMapping(value = "/Deleteemployee.htm", method = RequestMethod.POST)
	public ModelAndView submitdeletestudent(@ModelAttribute EmployeeBean employeebean)
			throws ClassNotFoundException, SQLException, NamingException {
		employeeservice.delete(employeebean);
		int studentId = employeebean.getEmployeeid();
		System.out.println(studentId);
		ModelAndView model = new ModelAndView("/menu");

		return model;
	}

	@RequestMapping("/EditEmployee.htm")
	public ModelAndView Editstudentmenu() {
		return new ModelAndView("EditEmployee", "command", new EmployeeBean());

	}

	@RequestMapping(value = "/EditEmployee.htm", method = RequestMethod.POST)
	public ModelAndView submitEditstudent(@ModelAttribute EmployeeBean employeebean)
			throws ClassNotFoundException, SQLException, NamingException {

		ModelAndView model = new ModelAndView("/menu");
		employeeservice.update(employeebean);
		return model;
	}

	
	
	@RequestMapping("/Displayemployee.htm")
	public ModelAndView Displayemployeemenu() throws ClassNotFoundException, SQLException, NamingException {
		ModelAndView model = new ModelAndView("/Displayemployee");
		List<EmployeeBean> obj = employeeservice.display();
		model.addObject("list", obj);
		return model;
	}


	@RequestMapping("/Searchemployee.htm")
	public ModelAndView searchstudentmenu() {
		return new ModelAndView("Searchemployee", "command", new EmployeeBean());

	}

	@RequestMapping(value ="/Search.htm", method = RequestMethod.POST)
	public ModelAndView submitsearchstudent(@ModelAttribute EmployeeBean employeebean)
			throws ClassNotFoundException, SQLException, NamingException {
		
		System.out.println("employeebean.getEmployeeid()==============="+employeebean.getEmployeeid());

		ModelAndView model = new ModelAndView("/searchview");
		List<EmployeeBean> obj = employeeservice.search(employeebean.getEmployeeid());
		model.addObject("list", obj);
		return model;

	}

}
