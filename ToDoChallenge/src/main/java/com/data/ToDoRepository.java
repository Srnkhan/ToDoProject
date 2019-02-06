package com.data;

import java.util.List;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
	@Query("SELECT u FROM ToDo u WHERE u.name = ?1")
	List<ToDo> findUserByStatus(String name);
}
