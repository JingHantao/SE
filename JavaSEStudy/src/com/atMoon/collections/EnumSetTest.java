package com.atMoon.collections;

import java.util.EnumSet;
/*
 * /**
     * 
     * 枚举中有一个自带的静态方法values(),返回enum实例的数据并且该数组中的元素顺序和声明时的顺序一样 
     * 枚举也可以像普通的类一样可以添加属性和方法，可以为它添加静态和非静态的属性或方法
     */

enum Colors{
	
	Red,Blue,Black,Pink
}

public class EnumSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EnumSet.allOf()创建一个包含指定枚举类里所有枚举值的EnumSet集合
		EnumSet es1=EnumSet.allOf(Colors.class);
		System.out.println("es1:"+es1);
		//空集合,类型为Colors
		EnumSet es2=EnumSet.noneOf(Colors.class);
		System.out.println("es2:"+es2);
		es2.add(Colors.Blue);
		es2.add(Colors.Pink);
		System.out.println("es2:"+es2);
		//以指定枚举值创建 es3
		EnumSet es3=EnumSet.of(Colors.Red,Colors.Black);
		System.out.println("es3:"+es3);
		//EnumSet.range(a,b):创建指定枚举类型的EnumSet 集合值从a到b(都包含)
		EnumSet es4=EnumSet.range(Colors.Blue,Colors.Pink);
		System.out.println("es4:"+es4);
		//es5为包含Colors中不包含es4的元素
		EnumSet es5=EnumSet.complementOf(es4);
		System.out.println("es5:"+es5);
		

	}

}
