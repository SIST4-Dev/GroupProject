package com.travel.dao;
import java.sql.SQLException;
import java.util.ArrayList;

import com.travel.vo.ProductVO;

public interface ProductDao {

	// 7번
	public int insert(ProductVO product) throws SQLException;

	// 4번
	public ArrayList<ProductVO> readByLocation(String productLoc) throws SQLException;

	// 2번
	public ArrayList<ProductVO> readAll() throws SQLException;

	// 3번
	public ProductVO read(int productNum) throws SQLException;

	// 8번
	public int update(ProductVO product) throws SQLException;

	// 9번
	public int delete(int productNum) throws SQLException;
}
