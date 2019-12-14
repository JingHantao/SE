package com.atMoon.object;

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
		//== 比较的是变量(栈)内存中存放的对象的(堆)内存地址，
		//用来判断两个对象的地址是否相同，即是否是指相同一个对象。
		//比较的是真正意义上的指针操作。
		if (str1 == "hello") {
			System.out.println("str1==\"hello\":" + true);
		} else {
			System.out.println("str1==\"hello\":" + false);
		}
        //equals用来比较的是两个对象的内容是否相等，
		//由于所有的类都是继承自java.lang.Object类的，所以适用于所有对象，
		//如果没有对该方法进行覆盖的话，调用的仍然是Object类中的方法，
		//而Object中的equals方法返回的却是==的判断。
		/*
		 * 对equals重新需要注意五点：
　　		1   自反性：对任意引用值X，x.equals(x)的返回值一定为true；
　　		2   对称性：对于任何引用值x,y,当且仅当y.equals(x)返回值为true时，x.equals(y)的返回值一定为true；
　　		3   传递性：如果x.equals(y)=true, y.equals(z)=true,则x.equals(z)=true ；
　		4   一致性：如果参与比较的对象没任何改变，则对象比较的结果也不应该有任何改变；
　　		5   非空性：任何非空的引用值X，x.equals(null)的返回值一定为false 。
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
