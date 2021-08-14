package com.ryde.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ryde.DTO.UserDTO;

public class UserRowMapper implements RowMapper<UserDTO>{

	@Override
	public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserDTO userDto = new UserDTO();
		userDto.setName(rs.getString("name"));
		userDto.setAddress(rs.getString("address"));
		userDto.setDescription(rs.getString("description"));
		userDto.setDob(rs.getDate("dob"));
		userDto.setId(rs.getInt("id"));
		userDto.setCreatedAt(rs.getDate("createdAt"));
		
		return userDto;
	}
	
}
