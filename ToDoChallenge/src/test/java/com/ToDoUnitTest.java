package com;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.controllers.ToDoController;
import com.data.ToDoRepository;
import com.model.ToDo;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ToDoUnitTest {
	 @Autowired
	    private ToDoController controller;

	 @Autowired
	    private ToDoRepository tDRepository;
	 
	 
	
	 
	 @Test
	    public void contextLoads() throws Exception {
	    	
	    	List<ToDo> testData = tDRepository.findUserByStatus("Srnk");
	    	
	    	assertThat(testData.get(2).getName()).isEqualTo("Srnk");
	    	
	    

	    
	    	
	    }
}
