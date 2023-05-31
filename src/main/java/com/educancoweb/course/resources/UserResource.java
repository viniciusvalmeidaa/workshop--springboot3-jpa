package com.educancoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educancoweb.course.entities.User;

@RestController
@RequestMapping(value="/	users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria.@gamil.com", "99257799", "01234");
		return ResponseEntity.ok().body(u);
	}
}
