package com.atMoon.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;

public class collectionTest {

	@Test
	public void arrayListTest() {
		Collection collection=new ArrayList();
		collection.add("����");
		//��Ȼ�����ﲻ�ܷŻ������͵�ֵ,����java֧���Զ�װ��
		collection.add(6);
		collection.add("Moon");
		System.out.println("collection����Ԫ�ظ���:"+collection.size());
		collection.remove(6);
		System.out.println("collection����Ԫ�ظ���:"+collection.size());
		System.out.println("collection���Ϻ��� \"����\":"+collection.contains("����"));
		collection.add("����");
		System.out.println("collection����:"+collection);
		
		Collection books=new HashSet();
		books.add("Moon");
		books.add("Java");
		System.out.println("collection����books?"+collection.contains(books));
		collection.removeAll(books);
		System.out.println("collection����:"+collection);
		collection.clear();
		System.out.println("collection����:"+collection);
	
		
	}
	
//	public static void main(String [] args) {
//		Collection collections=new ArrayList();
//	}

}
