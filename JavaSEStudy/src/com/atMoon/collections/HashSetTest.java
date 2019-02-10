package com.atMoon.collections;

import java.util.HashSet;

import org.omg.CORBA.Object;

//��A��д��equals��������ʼ�շ���true
class A {
	public boolean equals(boolean obj) {
		return true;
	}
}
//��B��д��hashCode��������ʼ�շ���1
class B{
	public int hashCode() {
		return 1;
	}
}
//��C��д��equals����ʼ�շ���true,hashCodeʼ�շ���2
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
	 * 1.����,Ԫ�ص������п��ܷ����仯
	 * 2.��ͬ��,�����̰߳�ȫ��
	 * 3.Ԫ��ֵ����Ϊnull
	 * HashSetͨ��equals������hashCode�����ж�����Ԫ���Ƿ����
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
