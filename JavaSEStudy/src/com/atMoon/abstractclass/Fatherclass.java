package com.atMoon.abstractclass;

import com.atMoon.interfaces.interfaceTest;

public abstract class Fatherclass {
	// ���󷽷�
	//���󷽷�������public��protected��default��Щ���η�
	abstract void sayhello();

	// 1.����������й�����
	public Fatherclass() {
	}

	// 2.��������Ĭ�ϵķ���ʵ��
	public void method1() {
		System.out.println("Fatherclass:������method1():");
	}

	// ��������:Overload(��̬)
	public void method1(int a) {
		System.out.println("Fatherclass:������method1(int a):");
	}

	//
	public void method1(int a, int b) {
		System.out.println("Fatherclass:������method1(int a,int b):");
	}

	//
	public int method2() {
		System.out.println("Fatherclass:������method2():");
		return 1;
	}

	//���󷽷�������main�����������ǿ���������
	public static void main(String[] args) {
		Fatherclass fatherclass = new ChildClass();
		fatherclass.sayhello();
		fatherclass.method1();
		fatherclass.method1(5);
	}
}

// 3.����ʹ��extends�ؼ������̳г����ࡣ
// ������಻�ǳ�����Ļ�������Ҫ�ṩ�����������������ķ�����ʵ�֡�
//4.�����㲻��ʵ����������֮�⣬������ͨJava��û���κ�����
class ChildClass extends Fatherclass {
	@Override//��д����
	void sayhello() {
		// TODO Auto-generated method stub
		System.out.println("ChildClass:Hello:");
	}
	@Override
	public void method1() {
		System.out.println("ChildClass:��д��method1():");
	}
	

}
