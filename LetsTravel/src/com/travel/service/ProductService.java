package com.travel.service;

import java.util.ArrayList;

import com.travel.vo.ProductVO;

public interface ProductService {

	//여행지입력
	int insert(ProductVO product);
		
	//모두보기
	ArrayList<ProductVO> showAll();
	
	//검색
	ArrayList<ProductVO> showByLocation(String productLoc);
	
	//상세보기
	ProductVO showDetail(int productNum);
	
	//여행지수정
	int update(ProductVO product);
	
	//여행지삭제
	int delete(int productNum);
	
}
