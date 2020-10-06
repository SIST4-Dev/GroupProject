package com.travel.vo;
public class CartOutputVO {
    private int cartNum;
    private int productNum;
    private String productLoc;
    private int productPrice;
    private String checkin;
    private String checkout;
    private String productExp;
	public CartOutputVO(int cartNum, int productNum, String productLoc, int productPrice, String checkin,
			String checkout, String productExp) {
		this.cartNum = cartNum;
		this.productNum = productNum;
		this.productLoc = productLoc;
		this.productPrice = productPrice;
		this.checkin = checkin;
		this.checkout = checkout;
		this.productExp = productExp;
	}
	public int getCartNum() {
		return cartNum;
	}
	public void setCartNum(int cartNum) {
		this.cartNum = cartNum;
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
