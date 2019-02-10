package com.atMoon.singleton;

public class SingletonLazy {
	
	//����ʽ �౻ʵ������ʱ��Ŵ���ʵ�� �̲߳���ȫ ��Ҫ�� synchronized �ؼ���ͬ��
	private static SingletonLazy singletonLazy;
	
	private SingletonLazy() {//���췽��
		System.out.println("SingletonLazy()���췽��---");
	}
	
	private static synchronized SingletonLazy getSingletonLazy() {//ͬ������
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
		//����
		SingletonLazy s1=SingletonLazy.getSingletonLazy();
		System.out.println("s1:" + s1.hashCode());
		SingletonLazy s2=SingletonLazy.getSingletonLazy();
		System.out.println("s2:" + s1.hashCode());
		
	}

}
