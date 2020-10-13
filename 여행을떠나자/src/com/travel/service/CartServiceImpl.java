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
	
	//장바구니에 상품번호를 보냈다.
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
	
	//장바구니모두보기
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
