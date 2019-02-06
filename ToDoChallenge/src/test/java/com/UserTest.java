package com;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.controllers.ToDoController;
import com.controllers.UserController;
import com.data.ToDoRepository;
import com.data.UserRepository;
import com.model.ToDo;
import com.model.User;

import junit.framework.Assert;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	
	 @Autowired
	 UserRepository userRepository;
	 
	 @Test
    public void contextLoads() throws Exception {
    	
    	List<User> users2 = userRepository.findAll();
    	assertThat(users2).isNotNull();
    	
    	List<User> users = userRepository.findUserByStatus("Srnk");
    	assertThat(users.get(0).getUser()).isEqualTo("Srnk");
    }

}