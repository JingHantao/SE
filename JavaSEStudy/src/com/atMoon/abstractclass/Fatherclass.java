package com.atMoon.abstractclass;

import com.atMoon.interfaces.interfaceTest;

public abstract class Fatherclass {
	// 抽象方法
	//抽象方法可以有public、protected和default这些修饰符
	abstract void sayhello();

	// 1.抽象类可以有构造器
	public Fatherclass() {
	}

	// 2.它可以有默认的方法实现
	public void method1() {
		System.out.println("Fatherclass:调用了method1():");
	}

	// 方法重载:Overload(多态)
	public void method1(int a) {
		System.out.println("Fatherclass:调用了method1(int a):");
	}

	//
	public void method1(int a, int b) {
		System.out.println("Fatherclass:调用了method1(int a,int b):");
	}

	//
	public int method2() {
		System.out.println("Fatherclass:调用了method2():");
		return 1;
	}

	//抽象方法可以有main方法并且我们可以运行它
	public static void main(String[] args) {
		Fatherclass fatherclass = new ChildClass();
		fatherclass.sayhello();
		fatherclass.method1();
		fatherclass.method1(5);
	}
}

// 3.子类使用extends关键字来继承抽象类。
// 如果子类不是抽象类的话，它需要提供抽象类中所有声明的方法的实现。
//4.除了你不能实例化抽象类之外，它和普通Java类没有任何区别
class ChildClass extends Fatherclass {
	@Override//重写方法
	void sayhello() {
		// TODO Auto-generated method stub
		System.out.println("ChildClass:Hello:");
	}
	@Override
	public void method1() {
		System.out.println("ChildClass:重写了method1():");
	}
	

}
