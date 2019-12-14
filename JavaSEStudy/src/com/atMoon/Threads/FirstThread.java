package com.atMoon.Threads;

//继承Thread 来创建线程
public class FirstThread extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=0;j<100;j++) {
			//Thread.currentThread():获取当前线程
			System.out.println(Thread.currentThread().getName()+" "+j);
			if(j==20) {
				//创建并启动一个线程
				new FirstThread().start();
				//创建并启动第二个线程
				new FirstThread().start();
				
			}
		}

	}
	
	private int i;
	//重写run()方法  run方法的方法体就是线程执行体
	public void run() {
		for (;i<100;i++) {
			//当线程类继承Thread类时，直接使用this即可获取当前线程
			// Thread对象的getName()返回当前线程的名字
			// 因此可以直接调用getName()方法返回当前线程的名字
			System.out.println(getName()+" "+i);
		}
	}

}
