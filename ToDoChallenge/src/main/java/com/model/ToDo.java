package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;

	private String ToDo;

	public String getToDo() {
		return ToDo;
	}

	public void setToDo(String ToDo) {
		this.ToDo = ToDo;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String tm) {
		this.time = tm;
	}

	private String time;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
			
			return "ToDo [id=" + id + ", ToDo=" + ToDo + ", time=" + time + ", Name=" + name+ "]";
		
	}

}
