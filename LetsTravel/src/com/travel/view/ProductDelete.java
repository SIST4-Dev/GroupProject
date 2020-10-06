package com.travel.view;	//굳이 필요없을듯 -AdminUI클래스 case3에 있음

import java.util.ArrayList;
import java.util.Scanner;

import com.travel.service.ProductService;
import com.travel.service.ProductServiceImpl;
import com.travel.vo.ProductVO;

public class ProductDelete {
	private Scanner scan;
	private ProductService service;
	
	public ProductDelete() {
		this.scan = new Scanner(System.in);
		this.service = new ProductServiceImpl();
	}

	public void delete(){
		System.out.println("------------------------------");
        System.out.println("           여행정보 삭제");
        System.out.println("------------------------------");
        
        System.out.printf("(1 ~ %d)\n", this.service.showAll().size() - 1);
		System.out.print("삭제를 원하시는 상품의 번호를  입력하세요 >> ");
		int num= this.scan.nextInt();
		scan.nextLine();

		System.out.printf("%d번을 선택하셨습니다.\n", num);
		ProductVO product2 = service.showDetail(num);
		ProductOutput po = new ProductOutput();
		po.outputDetail(product2);
		
		System.out.print("삭제하시겠습니까(y/n) ? : ");
		if (this.scan.next().toUpperCase().equals("Y")) {
			if (this.service.delete(product2.getProductNum()) == 1) {
				System.out.println("상품이 삭제됐습니다.");
			}
		}

	}

}
