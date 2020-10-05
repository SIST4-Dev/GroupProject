package com.travel.vo;
public class ProductVO {
    private int productNum;
    private String productLoc;
    private int productPrice;
    private String checkin;
    private String checkout;
    private String productExp;
	public ProductVO(int productNum, String productLoc, int productPrice, String checkin, String checkout,
			String productExp) {
		this.productNum = productNum;
		this.productLoc = productLoc;
		this.productPrice = productPrice;
		this.checkin = checkin;
		this.checkout = checkout;
		this.productExp = productExp;
	}
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public String getProductLoc() {
		return productLoc;
	}
	public void setProductLoc(String productLoc) {
		this.productLoc = productLoc;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public String getProductExp() {
		return productExp;
	}
	public void setProductExp(String productExp) {
		this.productExp = productExp;
	}

}
