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
				//使用Iterator迭代过程中,不可修改集合元素
				//booksCollection.remove(book);
				iterator.remove();
				//对book元素赋值,不会改变集合元素本身
				book="test";				
			}
			System.out.println(booksCollection);
		}
		

	}

}
