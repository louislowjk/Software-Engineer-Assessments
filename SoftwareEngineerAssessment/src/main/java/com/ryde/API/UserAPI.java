package com.ryde.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ryde.DTO.UserDTO;
import com.ryde.Exception.UserException;
import com.ryde.Service.UserService;

@RestController
public class UserAPI {

	@Autowired
	private UserService userService;

	// GET ALL USERS
	@GetMapping(value = "/users")
	public ResponseEntity<List<UserDTO>> getAllUsers() throws UserException {
		List<UserDTO> userList = userService.getAllUsers();
		return new ResponseEntity<>(userList, HttpStatus.OK);
	}
	
	
	//GET SPECIFIC USER WITH ID 
	@GetMapping(value = "/users/{id}")
	public ResponseEntity<UserDTO> getUser(@PathVariable Integer id) throws UserException {
		UserDTO userDTO = userService.getUser(id);
		return new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
	}

	//CREATE USER 
	@PostMapping(value = "/users")
	public ResponseEntity<String> createUser(@RequestBody UserDTO userDto) throws UserException {
		Integer id = userService.createUser(userDto);
		String successMsg = "Successfully added user " + id;
		return new ResponseEntity<String>(successMsg, HttpStatus.CREATED);
	}

	// DELETE SPECIFIC USER WITH ID 
	@DeleteMapping(value = "/users/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer id) throws UserException {
		Integer i = userService.deleteUser(id);
		String successMsg = "Successfully delete user " + i;
		return new ResponseEntity<String>(successMsg, HttpStatus.CREATED);
	}

	// UPDATE USER 
	@PutMapping(value = "/users")
	public ResponseEntity<String> updateUser(@RequestBody UserDTO userDTO) throws UserException {
		Integer id = userService.updateUser(userDTO);
		String successMsg = "Successfully updated user " + id;
		return new ResponseEntity<String>(successMsg, HttpStatus.CREATED);
	}
}
