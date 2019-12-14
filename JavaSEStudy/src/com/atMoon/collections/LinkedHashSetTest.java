package com.atMoon.collections;

import java.util.LinkedHashSet;

/*
 * 6
 * HashSet的子类,继承HashSet,实现Set接口,依旧不允许元素集合重复
 * 需要维护元素的插入顺序(使用链表),性能略低于HashSet
 * 但是迭代访问Set里面的全部元素时将有很好的性能(链表)
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
