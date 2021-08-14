package com.ryde.Repository;


import java.util.List;

import com.ryde.DTO.UserDTO;

public interface UserRepository {
	public UserDTO getUser(Integer id);
	public List<UserDTO> getAllUsers();
	public void createUser(UserDTO userDTO);
	public void deleteUser(Integer id);
	public void updateUser(UserDTO userDTO);
	

	
}
