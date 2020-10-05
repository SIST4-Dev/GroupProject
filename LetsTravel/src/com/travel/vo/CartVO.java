package com.travel.vo;
public class CartVO {
    private int cartNum;
    private int productNum;
    private String memberId;
	public CartVO(int cartNum, int productNum, String memberId) {
		this.cartNum = cartNum;
		this.productNum = productNum;
		this.memberId = memberId;
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
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

}
