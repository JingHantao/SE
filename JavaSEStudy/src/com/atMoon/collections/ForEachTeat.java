package com.atMoon.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ForEachTeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection booksCollection = new HashSet();
		booksCollection.add("one");
		booksCollection.add("two");
		booksCollection.add("three");
		System.out.println(booksCollection);

		// ʹ��foreachѭ��
		for (Object object : booksCollection) {
			String book = (String) object;
			System.out.println(book);
			if (book.equals("two")) {
				System.out.println(book);
				// foreach�� ѭ���ı伯��û������
				// booksCollection.remove(book);
			}

		}
	}

}