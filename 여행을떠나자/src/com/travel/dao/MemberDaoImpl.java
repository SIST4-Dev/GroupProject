package com.travel.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDaoImpl implements MemberDao {
	private DBConnection dbconn;
	public MemberDaoImpl() { 
		this.dbconn = new DBConnection();
	}
	// 
	public String login(String id, String pw) throws SQLException{
		Connection conn = this.dbconn.getConnection();
		String sql = "SELECT MEMBER_NAME FROM member WHERE MEMBER_ID = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		//pstmt.setString(2, pw);
		ResultSet rs = pstmt.executeQuery();
		String name= "아무개";
		if(rs.next()) {name = rs.getString("MEMBER_NAME");}

		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return name;

	}
}