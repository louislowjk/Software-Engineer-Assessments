package com.ryde.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ryde.DTO.UserDTO;
import com.ryde.RowMapper.UserRowMapper;

@Repository(value = "userRepository")
public class UserRepositoryImpl implements UserRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createUser(UserDTO userDTO) {

		String query = "insert into User values (?,?,?,?,?,?)";
		jdbcTemplate.update(query, userDTO.getId(), userDTO.getName(), userDTO.getDob(), userDTO.getAddress(),
				userDTO.getDescription(), userDTO.getCreatedAt());

	}

	@Override
	public UserDTO getUser(Integer id) {
		String query = "select * from user where id = ?";
		UserDTO dto = null;
		try {
			dto = jdbcTemplate.queryForObject(query, new Object[] { id }, new UserRowMapper());
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		return dto;

	}

	@Override
	public List<UserDTO> getAllUsers() {
		String query = "Select * from user";
		return jdbcTemplate.query(query, new UserRowMapper());
	}

	@Override
	public void deleteUser(Integer id) {
		String query = "delete from user where id = ?";
		jdbcTemplate.update(query, id);

	}

	@Override
	public void updateUser(UserDTO userDTO) {
		
		String query = "update user set "
				+ "name=?, dob= ? ,address=?,description=?,createdAt=? where id=?";
		jdbcTemplate.update(query,
				userDTO.getName(),
				userDTO.getDob(),
				userDTO.getAddress(),
				userDTO.getDescription(),
				userDTO.getCreatedAt(),	userDTO.getId()
				);
	}

}
