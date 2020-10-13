package com.travel.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.travel.vo.*;
import com.travel.dao.CartDao;
import com.travel.dao.CartDaoImpl;

public class CartServiceImpl implements CartService {
	private CartDao dao;
	
	public CartServiceImpl() {
		this.dao = new CartDaoImpl();
	}
	
	//��ٱ��Ͽ� ��ǰ��ȣ�� ���´�.
	@Override
	public int insert(int productNum) {
		int row = 0;
		try {
			row = this.dao.insert(productNum);
		}catch(SQLException e) {
			System.out.println(e);
		}
		return row;
	}
	
	//��ٱ��ϸ�κ���
	@Override
	public ArrayList<CartOutputVO> readAll(){
		ArrayList<CartOutputVO> list = null;
		try {
			list = this.dao.readAll();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return list;
	}
	
	
}
