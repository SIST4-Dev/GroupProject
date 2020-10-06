package com.travel.dao;

import java.sql.SQLException;

public interface MemberDao {

	// 1번
	public String login(String id, String pw) throws SQLException;

}
