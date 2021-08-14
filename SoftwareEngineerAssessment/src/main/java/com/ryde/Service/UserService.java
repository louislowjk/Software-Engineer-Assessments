package com.ryde.Service;

import java.util.List;

import com.ryde.DTO.UserDTO;
import com.ryde.Exception.UserException;

public interface UserService {
	public Integer createUser(UserDTO userDTO) throws UserException;
	public UserDTO getUser(Integer id) throws UserException;
	public List<UserDTO> getAllUsers()throws UserException;
	public Integer deleteUser(Integer id) throws UserException;
	public Integer updateUser(UserDTO userDTO) throws UserException;
}
