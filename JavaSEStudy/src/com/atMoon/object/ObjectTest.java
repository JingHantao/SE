package com.atMoon.object;

import java.util.concurrent.Semaphore;

import org.junit.Test;

public class ObjectTest {
	
	
	@Test
	public void firstmethod() {
			System.out.println("firstmethod():");
	}
	@Test
	public void secondmethod() {
		this.firstmethod();
		System.out.println("secondmethod():");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("hello");
		String str2 = "hello";
		//== �Ƚϵ��Ǳ���(ջ)�ڴ��д�ŵĶ����(��)�ڴ��ַ��
		//�����ж���������ĵ�ַ�Ƿ���ͬ�����Ƿ���ָ��ͬһ������
		//�Ƚϵ������������ϵ�ָ�������
		if (str1 == "hello") {
			System.out.println("str1==\"hello\":" + true);
		} else {
			System.out.println("str1==\"hello\":" + false);
		}
        //equals�����Ƚϵ�����������������Ƿ���ȣ�
		//�������е��඼�Ǽ̳���java.lang.Object��ģ��������������ж���
		//���û�жԸ÷������и��ǵĻ������õ���Ȼ��Object���еķ�����
		//��Object�е�equals�������ص�ȴ��==���жϡ�
		/*
		 * ��equals������Ҫע����㣺
����		1   �Է��ԣ�����������ֵX��x.equals(x)�ķ���ֵһ��Ϊtrue��
����		2   �Գ��ԣ������κ�����ֵx,y,���ҽ���y.equals(x)����ֵΪtrueʱ��x.equals(y)�ķ���ֵһ��Ϊtrue��
����		3   �����ԣ����x.equals(y)=true, y.equals(z)=true,��x.equals(z)=true ��
��		4   һ���ԣ��������ȽϵĶ���û�κθı䣬�����ȽϵĽ��Ҳ��Ӧ�����κθı䣻
����		5   �ǿ��ԣ��κηǿյ�����ֵX��x.equals(null)�ķ���ֵһ��Ϊfalse ��
		 */
		if (str1.equals("hello")) {
			System.out.println("str1.equals(\"hello\"):" + true);
		} else {
			System.out.println("str1.equals(\"hello\"):" + false);
		}
		
		
		if (str2 == "hello") {
			System.out.println("str2==\"hello\":" + true);
		} else {
			System.out.println("str2==\"hello\":" + false);
		}
		if (str2.equals("hello")) {
			System.out.println("str2.equals(\"hello\"):" + true);
		} else {
			System.out.println("str2.equals(\"hello\"):" + false);
		}

	}
}
