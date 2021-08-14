package com.ryde.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryde.DTO.UserDTO;
import com.ryde.Exception.UserException;
import com.ryde.Repository.UserRepository;

@Service(value = "userService")
public class UserServiceImpl implements UserService{
	@Autowired UserRepository repository;
	@Override
	public Integer createUser(UserDTO userDTO) throws UserException {
		UserDTO existUser = repository.getUser(userDTO.getId());
		if(existUser != null)
			throw new UserException("service.USER_EXISTS");
		repository.createUser(userDTO);
		return userDTO.getId();
		
	}

	@Override
	public UserDTO getUser(Integer id) throws UserException {
		UserDTO userDto = repository.getUser(id);
		if(userDto == null)
			throw new UserException("service.USER_NOT_FOUND");
		return userDto;
	}

	@Override
	public List<UserDTO> getAllUsers() throws UserException {
		List<UserDTO> list = repository.getAllUsers();
		if(list.isEmpty())
			throw new UserException("service.NO_USERS");
		
		return list;
	}

	@Override
	public Integer deleteUser(Integer id) throws UserException {
		UserDTO userDto = repository.getUser(id);
		if(userDto == null)
			throw new UserException("service.USER_NOT_FOUND");
		repository.deleteUser(id);
		return id; 
	}

	@Override
	public Integer updateUser(UserDTO userDTO) throws UserException {
		UserDTO findUser = repository.getUser(userDTO.getId());
		if(findUser==null)
			throw new UserException("service.USER_NOT_FOUND");
		repository.updateUser(userDTO);
		return userDTO.getId();
	}

}
