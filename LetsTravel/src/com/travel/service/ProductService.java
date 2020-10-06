package com.travel.service;

import java.util.ArrayList;

import com.travel.vo.ProductVO;

public interface ProductService {

	//�������Է�
	int insert(ProductVO product);
		
	//��κ���
	ArrayList<ProductVO> showAll();
	
	//�˻�
	ArrayList<ProductVO> showByLocation(String productLoc);
	
	//�󼼺���
	ProductVO showDetail(int productNum);
	
	//����������
	int update(ProductVO product);
	
	//����������
	int delete(int productNum);
	
}
