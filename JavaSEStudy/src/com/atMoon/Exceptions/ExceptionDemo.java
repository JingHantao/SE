package com.atMoon.Exceptions;

public class ExceptionDemo {
	
	public static int func() {
		try {
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 2;
		}finally {
			return 3;
		}
	}
	
	public static void main(String []args ) {
		 
		System.out.println(func());
		try {
//			if(true) {
//				throw new Exception();
//			}
			int a=10/0;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catching---");
			System.out.println(e);
			return ;
		}finally {
			System.out.println("finally---");
		}
		System.out.println("ending---");
	}
 
}
