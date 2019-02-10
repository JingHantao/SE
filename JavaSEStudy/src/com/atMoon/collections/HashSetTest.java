package com.atMoon.collections;

import java.util.HashSet;

import org.omg.CORBA.Object;

//类A重写了equals方法并且始终返回true
class A {
	public boolean equals(boolean obj) {
		return true;
	}
}
//类B重写了hashCode方法并且始终返回1
class B{
	public int hashCode() {
		return 1;
	}
}
//类C重写了equals并且始终返回true,hashCode始终返回2
class C{
	public boolean equals(boolean obj) {
		return true;
	}
	public int hashCode() {
		return 2;
	}
}

public class HashSetTest {
	/*
	 * HsahSet:
	 * 1.无序,元素的排序有可能发生变化
	 * 2.不同步,不是线程安全的
	 * 3.元素值可以为null
	 * HashSet通过equals方法和hashCode方法判断两个元素是否相等
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet books=new HashSet();
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		
		System.out.println(books);

	}

}
