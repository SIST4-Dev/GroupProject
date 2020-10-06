package com.travel.service;

import java.sql.SQLException;

import com.travel.dao.*;

public class MemberServiceImpl implements MemberService {
	private MemberDao dao;
		
	public MemberServiceImpl() {
		this.dao = new MemberDaoImpl();		
	}


	@Override
	public String login(String id, String pw) {
		String name = null;
		try {
			name = this.dao.login(id,pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}
	

	
}
