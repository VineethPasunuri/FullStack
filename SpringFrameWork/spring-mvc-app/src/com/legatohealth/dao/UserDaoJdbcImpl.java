package com.legatohealth.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.legatohealth.beans.User;

@Repository
public class UserDaoJdbcImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void store(User user) {
		String insertQuery = "insert into user(name, password, age)values (?, ?, ?)";
		jdbc.update(insertQuery, user.getName(), user.getPassword(), user.getAge());

	}

	@Override
	public User fetchUser(int userId) {
		String selectUserQuery = "select * from user where userid = ?";
		User userFound = jdbc.queryForObject(selectUserQuery, (rs, index) -> {
			User user = new User();
			user.setUserId(rs.getInt("userId"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
			user.setAge(rs.getInt("age"));
			return user;
		}, userId);
		return userFound;
	}

	@Override
	public List<User> fetchUsers() {
		String selectAllQuery = "select * from user";
		return jdbc.query(selectAllQuery, (rs, index) -> {
			User user = new User();
			user.setUserId(rs.getInt("userId"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
			user.setAge(rs.getInt("age"));
			return user;
		});
	}

	@Override
	public void deleteUser(int userId) {
		String deleteQuery = "delete from user where userid = ?";
		jdbc.update(deleteQuery, userId);
	}

	@Override
	public void updateUser(int userId, User user) {
		String updateQuery = "update user set name = ?, password=?, age= ? where userid= ?";
		jdbc.update(updateQuery, user.getName(), user.getPassword(), user.getAge(), user.getUserId());

	}

}
