package com.atMoon.integers;

/*
 *(������������:ֵ����)ԭʼ���ͣ�boolean��char��             byte��short��int��          long��float��double
 * (��װ��:��������)��װ���ͣ�Boolean��Character��Byte��Short��Integer��Long��Float��Double
 * װ��:int->Integer
 * ����:Integer->int
 */

public class IntergerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 128;
		Integer i2 = 128;
		Integer i3 = new Integer(128);
		System.out.println(i == i2); // Integer���Զ�����Ϊint������Ϊtrue
		System.out.println(i == i3); // true������ͬ��
		// Integer.valueOf()��������-128��127֮�����������л��棬 Integer i4 = 127ʱ���Ὣ127���л��棬
		// �´���дInteger i5 = 127ʱ���ͻ�ֱ�Ӵӻ�����ȡ���Ͳ���new��
		Integer i4 = 127;// ����ʱ������ɣ�Integer i4 = Integer.valueOf(127);
		Integer i5 = 127;
		System.out.println(i4 == i5);// true
		Integer i6 = 128;
		Integer i7 = 128;// ����ʱ�������:Integer i7 = new Integer (128)
		System.out.println(i6 == i7);// false
		Integer i8 = new Integer(127);
		System.out.println(i5 == i8); // false
		Integer i9 = new Integer(128);
		Integer i10 = new Integer(123);
		System.out.println(i9 == i10); // false

		Integer i11 = new Integer(120);
		Integer i12 = new Integer(120);
		Integer i13 = new Integer(0);
		System.out.println(i11 == i12); // false
		System.out.println(i11 == i12 + i13); // true
		/*
		 * 1��������Σ�Integer��new
		 * Integer������ȡ����ᾭ��������̣�new�����Ķ������ڶѣ�����new��Integer�������ڳ�����
		 * ���ڷ������������ǵ��ڴ��ַ��һ��������Ϊfalse��
		 * 
		 * 2���������Ƿ�new������Integer���������-128��127֮�䣬����true,����Ϊfalse����Ϊjava�ڱ���Integer
		 * i2 = 128��ʱ��,������ɣ�Integer i2 =
		 * Integer.valueOf(128);��valueOf()�������-128��127֮��������л��档
		 * 
		 * 3����������new������,��Ϊfalse�������ڴ��ַ��һ����
		 * 
		 * 4��int��Integer(����new��)�ȣ���Ϊtrue����Ϊ���Integer�Զ�����Ϊint��ȥ�ȡ�
		 */
	}
}
