package com.atMoon.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//ʵ��Callable�ӿ���ʵ���߳���
public class ThirdThread implements Callable<Integer> {
	// ʵ��call()��������Ϊ�߳�ִ����
	public Integer call() {
		int i = 0;
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " ��ѭ������i��ֵ��"
					+ i);
		}// call()���������з���ֵ
		return i;
	}

	public static void main(String[] args) {

		// ����Callable����
		ThirdThread rt = new ThirdThread();
		// ʹ��FutureTask����װCallable����
		FutureTask<Integer> task = new FutureTask<Integer>(rt);
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " ��ѭ������i��ֵ��"
					+ i);
			if (i == 20) {
				// ʵ�ʻ�����Callable�����������������߳�
				new Thread(task, "�з���ֵ���߳�").start();
			}
		}
		try {
			// ��ȡ�̷߳���ֵ
			System.out.println("���̵߳ķ���ֵ��" + task.get());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
