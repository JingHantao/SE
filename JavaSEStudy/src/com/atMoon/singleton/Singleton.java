package com.atMoon.singleton;

import org.junit.Test;

/*
 * ����ģʽ
 */
public class Singleton {
	// ����ʽ���� ����ص�ʱ��Ͳ�����ʵ������ �̰߳�ȫ
	private static Singleton singleton = new Singleton();

	private Singleton() {// ���췽��
		System.out.println("���췽��---");
	}

	private static Singleton getSingleton() {
		return singleton;
	}

	public static void main(String[] args) {
		//���Ե���
		Singleton s1 = Singleton.singleton;
		System.out.println("s1:" + s1.hashCode());
		Singleton s2 = Singleton.singleton;
		System.out.println("s2:" + s2.hashCode());

	}
}
