package com.atMoon.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class collectionTest {

	@Test
	public void arrayListTest() {
		Collection collection=new ArrayList();
		collection.add("张三");
		//虽然集合里不能放基本类型的值,但是java支持自动装箱
		collection.add(6);
		collection.add("Moon");
		System.out.println("collection集合元素个数:"+collection.size());
		collection.remove(6);
		System.out.println("collection集合元素个数:"+collection.size());
		System.out.println("collection集合含有 \"张三\":"+collection.contains("张三"));
		collection.add("李四");
		System.out.println("collection集合:"+collection);
		
		Collection books=new HashSet();
		books.add("Moon");
		books.add("Java");
		System.out.println("collection含有books?"+collection.contains(books));
		collection.removeAll(books);
		System.out.println("collection集合:"+collection);
		collection.clear();
		System.out.println("collection集合:"+collection);
	
		
	}
	
//	public static void main(String [] args) {
//		Collection collections=new ArrayList();
//	}

}
