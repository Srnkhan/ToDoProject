package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.data.UserRepository;
import com.model.LastAccount;
import com.model.User;

@Controller
public class UserController {
	@Autowired
	private UserRepository uR;
	
	@RequestMapping(value = "/Entry.html", method = RequestMethod.GET)
	public ModelAndView addNewUser() {
		
		User user = new User();
		
		return new ModelAndView("Entry", "form2", user);

	}

	
	@RequestMapping(value = "/Entry.html", method = RequestMethod.POST)
	public String newUser(User user) {
		List<User> users = new ArrayList<User>();
		users = uR.findUserByStatus(user.getUser());
		/*for(int i = 0 ; i < users.size();i++){
			System.out.println(users);
		}*/
		if(users.size() == 0) {
			System.out.println("New Account: " + user.getUser());
			
			uR.save(user);	
		}
		else {
			System.out.println("You have already saved this account " + user.getUser());
		}

		LastAccount.LastUserName = user.getUser();
		return ("redirect:/newToDo.html");

	}
	
	
}
