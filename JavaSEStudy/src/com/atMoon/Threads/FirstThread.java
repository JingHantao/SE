package com.atMoon.Threads;

//�̳�Thread �������߳�
public class FirstThread extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=0;j<100;j++) {
			//Thread.currentThread():��ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName()+" "+j);
			if(j==20) {
				//����������һ���߳�
				new FirstThread().start();
				//�����������ڶ����߳�
				new FirstThread().start();
				
			}
		}

	}
	
	private int i;
	//��дrun()����  run�����ķ���������߳�ִ����
	public void run() {
		for (;i<100;i++) {
			//���߳���̳�Thread��ʱ��ֱ��ʹ��this���ɻ�ȡ��ǰ�߳�
			// Thread�����getName()���ص�ǰ�̵߳�����
			// ��˿���ֱ�ӵ���getName()�������ص�ǰ�̵߳�����
			System.out.println(getName()+" "+i);
		}
	}

}
