package com.atMoon.collections;

import java.util.EnumSet;
/*
 * /**
     * 
     * ö������һ���Դ��ľ�̬����values(),����enumʵ�������ݲ��Ҹ������е�Ԫ��˳�������ʱ��˳��һ�� 
     * ö��Ҳ��������ͨ����һ������������Ժͷ���������Ϊ����Ӿ�̬�ͷǾ�̬�����Ի򷽷�
     */

enum Colors{
	
	Red,Blue,Black,Pink
}

public class EnumSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EnumSet.allOf()����һ������ָ��ö����������ö��ֵ��EnumSet����
		EnumSet es1=EnumSet.allOf(Colors.class);
		System.out.println("es1:"+es1);
		//�ռ���,����ΪColors
		EnumSet es2=EnumSet.noneOf(Colors.class);
		System.out.println("es2:"+es2);
		es2.add(Colors.Blue);
		es2.add(Colors.Pink);
		System.out.println("es2:"+es2);
		//��ָ��ö��ֵ���� es3
		EnumSet es3=EnumSet.of(Colors.Red,Colors.Black);
		System.out.println("es3:"+es3);
		//EnumSet.range(a,b):����ָ��ö�����͵�EnumSet ����ֵ��a��b(������)
		EnumSet es4=EnumSet.range(Colors.Blue,Colors.Pink);
		System.out.println("es4:"+es4);
		//es5Ϊ����Colors�в�����es4��Ԫ��
		EnumSet es5=EnumSet.complementOf(es4);
		System.out.println("es5:"+es5);
		

	}

}
