package com.travel.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.travel.dao.*;
import com.travel.vo.*;

public class ProductServiceImpl implements ProductService {
	private ProductDao dao;
	
	public ProductServiceImpl() {
		this.dao = new ProductDaoImpl();
	}
	
	//여행지입력
	@Override
	public int insert(ProductVO product) {
		int row = 0;
		try {
			row = this.dao.insert(product);
		}catch(SQLException e) {
			System.out.println(e);
		}
		return row;
	}
	
	//모두보기
	@Override
	public ArrayList<ProductVO> showAll(){
		ArrayList<ProductVO> list = null;
		try {
			list = this.dao.readAll();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return list; //null 혹은 list를 리턴한다.
	}
	
	//검색
	@Override
	public ArrayList<ProductVO> showByLocation(String productLoc) {
		ArrayList<ProductVO> list = null;
		try {
			list = this.dao.readByLocation(productLoc);
		}catch(SQLException e) {
			System.out.println(e);
		}
		return list;
	}
	
	//상세보기
	@Override
	public ProductVO showDetail(int productNum) {
		ProductVO product = null;
		try {
			product = this.dao.read(productNum);
		}catch(SQLException e) {
			System.out.println(e);
		}
		return product;
	}
	
	
	//여행지수정
	@Override
	public int update(ProductVO product) {
		int row = 0;
		try {
			row = this.dao.update(product);
		}catch(SQLException e) {
			System.out.println(e);
		}
		return row; //수정 성공했다면 1, 실패했다면 0
	}
	
	//여행지삭제
	@Override
	public int delete(int productNum) {
		int row = 0;
		try {
			row = this.dao.delete(productNum);
		}catch(SQLException e) {
			System.out.println(e);
		}
		return row;
	}
	
	
}
