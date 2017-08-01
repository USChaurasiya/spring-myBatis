package com.uma.myBatisExample.dao;


import com.ibatis.sqlmap.client.SqlMapClient;
import com.uma.myBatisExample.dto.User;

public interface UserDao {

	public User addUser(User user, SqlMapClient sqlmapClient);
	public User getUserById(Integer id, SqlMapClient sqlmapClient);
	public void deleteUserById(Integer id, SqlMapClient sqlmapClient);
}
