package com.travel.service;

import java.util.ArrayList;
import com.travel.vo.*;

public interface CartService {
	//장바구니에 넣기 : Product의 상품번호를 장바구니에 넣는다.
	int insert(int productNum);
	
	//장바구니 모두 조회 : CartVO를 모두 조회
	ArrayList<CartOutputVO> readAll();
}
