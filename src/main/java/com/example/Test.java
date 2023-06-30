package com.example;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String s=encoder.encode("Admin");
		System.out.println(s);
		//String s1=encoder.encode("EMPLOYEE");
		//System.out.println(s1);

	}

}
