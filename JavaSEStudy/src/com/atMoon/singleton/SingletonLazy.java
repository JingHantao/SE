package com.atMoon.singleton;

public class SingletonLazy {
	
	//懒汉式 类被实例化的时候才创建实例 线程不安全 需要加 synchronized 关键字同步
	private static SingletonLazy singletonLazy;
	
	private SingletonLazy() {//构造方法
		System.out.println("SingletonLazy()构造方法---");
	}
	
	private static synchronized SingletonLazy getSingletonLazy() {//同步方法
		if(singletonLazy==null) {
			singletonLazy=new SingletonLazy();
		}
		return singletonLazy;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试
		SingletonLazy s1=SingletonLazy.getSingletonLazy();
		System.out.println("s1:" + s1.hashCode());
		SingletonLazy s2=SingletonLazy.getSingletonLazy();
		System.out.println("s2:" + s1.hashCode());
		
	}

}
