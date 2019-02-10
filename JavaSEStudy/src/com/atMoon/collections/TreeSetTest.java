package com.atMoon.collections;

/*
 * 实现了SortedSet接口
 * TreeSet里面元素是有序的,也不允许有重复的元素
 * 通过 compareTo(Object object)比较对象是否相等 返回值为0则认为相等
 * 否则就认为不相等
 * 重写对象equals方法规则:保证该方法与compareTo(Object o)方法有一致的结果:
 * equals返回true->compareTo(Object o)应该返回0
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
	// 重写Comparable方法 始终返回1
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 1;
	}

}

//实现定制排序Demo
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
		// java自动装箱 int->Interger
		numsSet.add(5);
		// numsSet.add(5);//重复元素无法插入
		numsSet.add(10);
		numsSet.add(2);
		numsSet.add(-3);
		System.out.println("numsSet:" + numsSet);
		System.out.println("numsSet.first:" + numsSet.first());
		System.out.println("numsSet.last:" + numsSet.last());
		System.out.println("numsSet 小于5的子集(不包含5):" + numsSet.headSet(5));
		System.out.println("numsSet 大于5的子集(包含5):" + numsSet.tailSet(5));
		System.out.println("numSet (-3,5)的子集(包含-3,不包含5)"
				+ numsSet.subSet(-3, 5));
		
		System.out.println("-----------");
		TreeSet set=new TreeSet();
		Z z1=new Z(6);
		set.add(z1);
		System.out.println(set.add(z1));
		//TreeSet会认为两个对象不相等(重写了compareTo(Object o)方法的缘故)
		System.out.println(set);
		((Z)(set.first())).age=9;
		System.out.println(((Z)(set.last())).age);//输出9 说明两个对象相同 都变为了9
		
		System.out.println("-----------");
		//由Comparator对象负责集合元素的排序规则
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
