package com.travel.service;

import java.util.ArrayList;
import com.travel.vo.*;

public interface CartService {
	//��ٱ��Ͽ� �ֱ� : Product�� ��ǰ��ȣ�� ��ٱ��Ͽ� �ִ´�.
	int insert(int productNum);
	
	//��ٱ��� ��� ��ȸ : CartVO�� ��� ��ȸ
	ArrayList<CartOutputVO> readAll();
}
