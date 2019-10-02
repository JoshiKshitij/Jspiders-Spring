package com.btm.mvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@Autowired
	SessionFactory sessionFactory;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	ModelAndView saveMethod(Student std, Model model) {

		model.addAttribute("s", std);
		System.out.println(std);

		Transaction tx = null;
		try (Session session = sessionFactory.openSession()) {
			tx = session.beginTransaction();

			session.save(std);

			tx.commit();

		} catch (Exception e) {
			tx.rollback();
		}

		return new ModelAndView("details.jsp");
	}

	/*
	 * @RequestMapping(value = "/get/{myvalue}") ModelAndView
	 * pathVarriableMethod(@PathVariable(value = "myvalue") String var) {
	 * 
	 * System.out.println("path varriable Id ->> " + var); return new
	 * ModelAndView("details.jsp"); }
	 */

}
