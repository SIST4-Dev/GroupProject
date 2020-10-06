package com.travel.view;

import java.util.Scanner;
import com.travel.service.*;

public class Login {
	private Scanner scan;
    private MemberService service;							//서비스에서 할거
    private String id;
    private String pw;
 
    public Login() {
        this.scan = new Scanner(System.in);
        this.service = new MemberServiceImpl();				//서비스에서 할거
        
    }
     
    public	String login() {
    	while(true) {
    		System.out.println("------------------------------");
            System.out.println("         <<로그인>>        ");
            System.out.println("------------------------------");
            System.out.print("ID : ");
            id = this.scan.nextLine();
            System.out.print("PW : ");
            pw = this.scan.nextLine();
            String name = this.service.login(id, pw).trim();
            
            return name;
    	}
   		
		
	}
        

}

