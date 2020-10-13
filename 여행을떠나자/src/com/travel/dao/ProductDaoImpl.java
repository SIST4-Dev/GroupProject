package com.travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;

import com.travel.vo.ProductVO;

public class ProductDaoImpl implements ProductDao {
	private DBConnection dbconn;
	
	public ProductDaoImpl() { 
		this.dbconn = new DBConnection();
	}
	//
	public int insert(ProductVO product) throws SQLException{
		Connection conn = this.dbconn.getConnection();
		String sql = "INSERT INTO Product VALUES(PRODUCT_NUM_SEQ.NEXTVAL, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getProductLoc());
		pstmt.setInt(2, product.getProductPrice());
		pstmt.setDate(3, Date.valueOf(product.getCheckin()));
		pstmt.setDate(4, Date.valueOf(product.getCheckout()));
		pstmt.setString(5, product.getProductExp());

		int row = pstmt.executeUpdate();
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		
		return row;
	}

	// 
	public ArrayList<ProductVO> readAll() throws SQLException{
		Connection conn = this.dbconn.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT PRODUCT_NUM, PRODUCT_LOC, PRODUCT_COST, CHECKIN, CHECKOUT " +
				" FROM PRODUCT ORDER BY PRODUCT_NUM";
		ResultSet rs = stmt.executeQuery(sql);
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		if(rs.next()) {
			do {
				int productNum = rs.getInt("PRODUCT_NUM");
				String productLoc = rs.getString("PRODUCT_LOC");
				int productPrice = rs.getInt("PRODUCT_COST");
				String checkin = rs.getString("CHECKIN");
				String checkout = rs.getString("CHECKOUT");
				ProductVO product = new ProductVO(productNum, productLoc, productPrice, checkin, checkout);
				list.add(product);
			} while(rs.next());
		} else {
			list = null;
		}
		DBClose.close(conn);
		return list;
	}

	// 
	public ArrayList<ProductVO> readByLocation(String productLoc) throws SQLException{
		Connection conn = this.dbconn.getConnection();
		String sql = "SELECT PRODUCT_NUM, PRODUCT_LOC, PRODUCT_COST, CHECKIN, CHECKOUT " +
				" FROM PRODUCT WHERE PRODUCT_LOC = ? "+
				" ORDER BY PRODUCT_NUM";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, productLoc);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		if(rs.next()) {
			do {
				int productNum = rs.getInt("PRODUCT_NUM");
				int productPrice = rs.getInt("PRODUCT_COST");
				String checkin = rs.getString("CHECKIN");
				String checkout = rs.getString("CHECKOUT");
				ProductVO product = new ProductVO(productNum, productLoc, productPrice, checkin, checkout);
				list.add(product);
			} while (rs.next());
		} else {
			list = null;
		}
		DBClose.close(conn);
		return list;
	}

	// 
	public ProductVO read(int productNum) throws SQLException{
		Connection conn = this.dbconn.getConnection();
		String sql = "SELECT * FROM PRODUCT WHERE PRODUCT_NUM = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, productNum);
		ResultSet rs = pstmt.executeQuery();
		ProductVO product = null;
		if(rs.next()) {
			String productLoc = rs.getString("PRODUCT_LOC");
			int productPrice = rs.getInt("PRODUCT_COST");
			String checkin = rs.getString("CHECKIN");
			String checkout = rs.getString("CHECKOUT");
			String productExp = rs.getString("PRODUCT_EXP");
			product = new ProductVO(productNum, productLoc, productPrice, checkin, checkout, productExp);

		} else {
			product = null;
		}

		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return product;
	}


	// 
	public int update(ProductVO product) throws SQLException{
		Connection conn = this.dbconn.getConnection();
		String sql = "UPDATE PRODUCT SET PRODUCT_LOC = ?, PRODUCT_COST = ?, CHECKIN = ?, CHECKOUT = ?, PRODUCT_EXP = ? WHERE PRODUCT_NUM = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getProductLoc());
		pstmt.setInt(2, product.getProductPrice());
		pstmt.setDate(3, Date.valueOf(product.getCheckin()));
		pstmt.setDate(4, Date.valueOf(product.getCheckout()));
		pstmt.setString(5, product.getProductExp());
		pstmt.setInt(6, product.getProductNum());
		int row = pstmt.executeUpdate();
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		
		return row;
		
	}

	// 
	public int delete(int productNum) throws SQLException{
		Connection conn = this.dbconn.getConnection();
		String sql = "DELETE FROM Product WHERE PRODUCT_NUM =?";
		PreparedStatement pstmt = conn.prepareStatement(sql); 
		pstmt.setInt(1, productNum);  //비로소 완전한 SQL문장
		int row = pstmt.executeUpdate();
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		
		return row;
	}
}
