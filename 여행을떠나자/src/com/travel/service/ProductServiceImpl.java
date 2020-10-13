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
	
	//�������Է�
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
	
	//��κ���
	@Override
	public ArrayList<ProductVO> showAll(){
		ArrayList<ProductVO> list = null;
		try {
			list = this.dao.readAll();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return list; //null Ȥ�� list�� �����Ѵ�.
	}
	
	//�˻�
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
	
	//�󼼺���
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
	
	
	//����������
	@Override
	public int update(ProductVO product) {
		int row = 0;
		try {
			row = this.dao.update(product);
		}catch(SQLException e) {
			System.out.println(e);
		}
		return row; //���� �����ߴٸ� 1, �����ߴٸ� 0
	}
	
	//����������
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
