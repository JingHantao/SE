package com.atMoon.interfaces;

public interface interfaceTest {
	// 1.�ӿڲ����г�Ա����
	// public abstract String string;
	//2.�ӿڲ����й�����
	//public interfaceTest() ;
	//3.�ӿڷ�����Ĭ�����η���public�Ҳ���ʹ���������η�����
	//public abstract void method3();
	//4.�ӿڲ�����main����,��������
	//5.�ӿ�ֻ���Լ̳�һ�����������ӿ�
	//6.��������ӿ�����ӷ�������ô�����ı�ʵ�ָýӿڵ��ࡣ
	//7.�ӿ�����΢�е����ģ���Ϊ����Ҫʱ��ȥѰ��������ʵ�ֵķ�����
	public void method1();

	public int method2(int a);

	public int method2(double a);

	public int method2(int a, int b);

	public double method3(double a);

	public class test implements interfaceTest {

		@Override
		public void method1() {
			// TODO Auto-generated method stub

		}

		@Override
		public int method2(int a) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int method2(double a) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int method2(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double method3(double a) {
			// TODO Auto-generated method stub
			return 0;
		}

	}
	

}
