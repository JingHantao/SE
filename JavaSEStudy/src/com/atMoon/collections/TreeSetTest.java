package com.atMoon.collections;

/*
 * ʵ����SortedSet�ӿ�
 * TreeSet����Ԫ���������,Ҳ���������ظ���Ԫ��
 * ͨ�� compareTo(Object object)�Ƚ϶����Ƿ���� ����ֵΪ0����Ϊ���
 * �������Ϊ�����
 * ��д����equals��������:��֤�÷�����compareTo(Object o)������һ�µĽ��:
 * equals����true->compareTo(Object o)Ӧ�÷���0
 */

import java.util.Comparator;
import java.util.TreeSet;

import junit.extensions.TestSetup;

class Z implements Comparable {
	int age;

	public Z(int age) {
		this.age = age;
	}

	public boolean equals(Object obj) {
		return true;
	}

	@Override
	// ��дComparable���� ʼ�շ���1
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 1;
	}

}

//ʵ�ֶ�������Demo
class M{
	int age;
	public M(int age) {
		this.age=age;
	}
	@Override
	public String toString() {
		return "M [age=" + age + "]";
	}
	
}

public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet numsSet = new TreeSet();
		// java�Զ�װ�� int->Interger
		numsSet.add(5);
		// numsSet.add(5);//�ظ�Ԫ���޷�����
		numsSet.add(10);
		numsSet.add(2);
		numsSet.add(-3);
		System.out.println("numsSet:" + numsSet);
		System.out.println("numsSet.first:" + numsSet.first());
		System.out.println("numsSet.last:" + numsSet.last());
		System.out.println("numsSet С��5���Ӽ�(������5):" + numsSet.headSet(5));
		System.out.println("numsSet ����5���Ӽ�(����5):" + numsSet.tailSet(5));
		System.out.println("numSet (-3,5)���Ӽ�(����-3,������5)"
				+ numsSet.subSet(-3, 5));
		
		System.out.println("-----------");
		TreeSet set=new TreeSet();
		Z z1=new Z(6);
		set.add(z1);
		System.out.println(set.add(z1));
		//TreeSet����Ϊ�����������(��д��compareTo(Object o)������Ե��)
		System.out.println(set);
		((Z)(set.first())).age=9;
		System.out.println(((Z)(set.last())).age);//���9 ˵������������ͬ ����Ϊ��9
		
		System.out.println("-----------");
		//��Comparator�����𼯺�Ԫ�ص��������
		TreeSet set2=new TreeSet(new Comparator() {
			public int compare(Object o1,Object o2) {
				M m1=(M)o1;
				M m2=(M)o2;
				return m1.age>m2.age?-1:m1.age<m2.age?1:0;
			}
		});
		set2.add(new M(5));
		set2.add(new M(-3));
		set2.add(new M(9));
		System.out.println(set2);
	}

}
