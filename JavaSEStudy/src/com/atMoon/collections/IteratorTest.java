package com.atMoon.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection booksCollection=new HashSet();
		booksCollection.add("one");
		booksCollection.add("two");
		booksCollection.add("three");
		Iterator iterator=booksCollection.iterator();
		while(iterator.hasNext()) {
			String book=(String) iterator.next();
			System.out.println(book);
			if( book.equals("two")){
				//ʹ��Iterator����������,�����޸ļ���Ԫ��
				//booksCollection.remove(book);
				iterator.remove();
				//��bookԪ�ظ�ֵ,����ı伯��Ԫ�ر���
				book="test";				
			}
			System.out.println(booksCollection);
		}
		

	}

}
