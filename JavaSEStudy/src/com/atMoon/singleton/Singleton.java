package com.atMoon.singleton;

import org.junit.Test;

/*
 * 单例模式
 */
public class Singleton {
	// 饿汉式单例 类加载的时候就产生了实例对象 线程安全
	private static Singleton singleton = new Singleton();

	private Singleton() {// 构造方法
		System.out.println("构造方法---");
	}

	private static Singleton getSingleton() {
		return singleton;
	}

	public static void main(String[] args) {
		//测试单例
		Singleton s1 = Singleton.singleton;
		System.out.println("s1:" + s1.hashCode());
		Singleton s2 = Singleton.singleton;
		System.out.println("s2:" + s2.hashCode());

	}
}
