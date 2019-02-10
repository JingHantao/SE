package com.atMoon.interfaces;

public interface interfaceTest {
	// 1.接口不能有成员变量
	// public abstract String string;
	//2.接口不能有构造器
	//public interfaceTest() ;
	//3.接口方法的默认修饰符是public且不可使用其它修饰符修饰
	//public abstract void method3();
	//4.接口不能有main方法,不能运行
	//5.接口只可以继承一个或多个其它接口
	//6.如果你往接口中添加方法，那么你必须改变实现该接口的类。
	//7.接口是稍微有点慢的，因为它需要时间去寻找在类中实现的方法。
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
