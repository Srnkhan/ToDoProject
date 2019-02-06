package com;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.hibernate.annotations.Entity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import com.controllers.ToDoController;
import com.data.ToDoRepository;
import com.model.ToDo;

import junit.framework.Assert;
@RunWith(SpringRunner.class)
@SpringBootTest
public class unitTest {
	
	 @Autowired
	    private ToDoController controller;

	 @Autowired
	    private ToDoRepository tDRepository;
	 
    
	 
	 
	 @Test
    public void contextLoads() throws Exception {
    	List<ToDo> testData = tDRepository.findAll();
    	List<ToDo> testData2 = tDRepository.findUserByStatus("Srnk");
    	for(int i = 0 ; i < testData2.size();i++) {
    		System.out.println(testData2.get(i));
    	}
    	assertThat(testData).isNotNull();
    	assertThat(testData2).isNotNull();
    	assertThat(controller).isNotNull();
    	assertThat(testData2.get(2).getName()).isEqualTo("Srnk");
    	
    }

}