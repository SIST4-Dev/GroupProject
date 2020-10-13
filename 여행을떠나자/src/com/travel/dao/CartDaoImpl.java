package com.travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.travel.vo.*;

public class CartDaoImpl implements CartDao {
	private DBConnection dbconn;

	public CartDaoImpl() { 
		this.dbconn = new DBConnection();
	}
	// 
	public int insert(int productNum) throws SQLException{
		Connection conn = this.dbconn.getConnection();
		String sql = "INSERT INTO CART VALUES(CART_NUM_SEQ.NEXTVAL, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, productNum);
		pstmt.setString(2, "test1");

		int row = pstmt.executeUpdate();
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return row;
	}
	
	//
	public ArrayList<CartOutputVO> readAll() throws SQLException {
		Connection conn = this.dbconn.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT CART_NUM, PRODUCT_NUM, PRODUCT_LOC, PRODUCT_COST, CHECKIN, CHECKOUT, PRODUCT_EXP" +
				" FROM CART NATURAL JOIN PRODUCT "+
				" ORDER BY CART_NUM";
		ResultSet rs = stmt.executeQuery(sql);
		ArrayList<CartOutputVO> list = new ArrayList<CartOutputVO>();
		if(rs.next()) {
			do {
				int cartNum = rs.getInt("CART_NUM");
				int productNum = rs.getInt("PRODUCT_NUM");
				String productLoc = rs.getString("PRODUCT_LOC");
				int productPrice = rs.getInt("PRODUCT_COST");
				String checkin = rs.getString("CHECKIN");
				String checkout = rs.getString("CHECKOUT");
				String productExp = rs.getString("PRODUCT_EXP");
				
				CartOutputVO cart = new CartOutputVO(cartNum, productNum, productLoc, productPrice, checkin, checkout, productExp);
				list.add(cart);
			} while(rs.next());
		}else {
			list = null;
		}
		DBClose.close(conn);
		return list;
	}

}
