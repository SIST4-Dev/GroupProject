package com.travel.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.travel.vo.*;

public interface CartDao {

	// 
	public int insert(int productNum) throws SQLException;

	// 
	public ArrayList<CartOutputVO> readAll() throws SQLException;



}
