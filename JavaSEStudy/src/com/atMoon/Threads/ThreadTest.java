package com.atMoon.Threads;

public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void waitForSignal() {
		Object object=new Object();
		synchronized(Thread.currentThread()) {
			//object.wait();
			object.notify();
		}
	}

}
