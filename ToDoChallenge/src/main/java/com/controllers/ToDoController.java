package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.data.ToDoRepository;
import com.data.UserRepository;
import com.model.LastAccount;
import com.model.ToDo;

@Controller
public class ToDoController {

	@Autowired
	private ToDoRepository td;
	
	@Autowired
	private UserRepository uR;
	
	ToDo mainToDo = new ToDo();
	
	@RequestMapping(value = "/newToDo.html", method = RequestMethod.POST)
	public String newToDo(ToDo toDo) {
		mainToDo = toDo;	
		td.save(toDo);
		return ("redirect:/allToDo.html");

	}

	@RequestMapping(value = "/newToDo.html", method = RequestMethod.GET)
	public ModelAndView addNewToDo() {

		ToDo td = new ToDo();
		td.setName(LastAccount.LastUserName);
		return new ModelAndView("newToDo", "form", td);

	}

	@RequestMapping(value = "/allToDo.html", method = RequestMethod.GET)
	public ModelAndView TDs() {
		
	//	List<ToDo> tds = td.findAll();
		List<ToDo>test = td.findUserByStatus(LastAccount.LastUserName);
		
		
		
		return new ModelAndView("allToDo", "allToDoList", test);
	}
	
	
	
	
}
