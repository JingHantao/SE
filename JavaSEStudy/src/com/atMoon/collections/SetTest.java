package com.atMoon.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set books=new HashSet();
		String a=new String("one");
		String b=new String("one");
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		books.add(a);
		//set集合:无序,不允许包含重复元素
		//放入set失败,a.equals(b)为true时就判断两个元素重复
		books.add(b);
		System.out.println(books);
		books.add("two");
		books.add("three");
		System.out.println(books);
	}

}
