package com;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import com.controllers.ToDoController;
import com.model.ToDo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
	
	 @Autowired
	    private ToDoController controller;
	
    @Test
    public void contextLoads() throws Exception {
    	assertThat(controller).isNotNull();
    }

}