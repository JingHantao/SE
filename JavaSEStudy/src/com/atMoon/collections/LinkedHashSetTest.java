package com.atMoon.collections;

import java.util.LinkedHashSet;

/*
 * 6
 * HashSet������,�̳�HashSet,ʵ��Set�ӿ�,���ɲ�����Ԫ�ؼ����ظ�
 * ��Ҫά��Ԫ�صĲ���˳��(ʹ������),�����Ե���HashSet
 * ���ǵ�������Set�����ȫ��Ԫ��ʱ���кܺõ�����(����)
 */

public class LinkedHashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet books = new LinkedHashSet();
		books.add("one");
		books.add("two");
		System.out.println(books);

		books.remove("one");
		System.out.println(books);
		books.add("Three");
		System.out.println(books);

	}

}
