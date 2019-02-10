package com.atMoon.integers;

/*
 *(基本数据类型:值类型)原始类型：boolean，char，             byte，short，int，          long，float，double
 * (包装类:引用类型)包装类型：Boolean，Character，Byte，Short，Integer，Long，Float，Double
 * 装箱:int->Integer
 * 拆箱:Integer->int
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
		System.out.println(i == i2); // Integer会自动拆箱为int，所以为true
		System.out.println(i == i3); // true，理由同上
		// Integer.valueOf()函数对于-128到127之间的数，会进行缓存， Integer i4 = 127时，会将127进行缓存，
		// 下次再写Integer i5 = 127时，就会直接从缓存中取，就不会new了
		Integer i4 = 127;// 编译时被翻译成：Integer i4 = Integer.valueOf(127);
		Integer i5 = 127;
		System.out.println(i4 == i5);// true
		Integer i6 = 128;
		Integer i7 = 128;// 编译时被翻译成:Integer i7 = new Integer (128)
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
		 * 1，无论如何，Integer与new
		 * Integer不会相等。不会经历拆箱过程，new出来的对象存放在堆，而非new的Integer常量则在常量池
		 * （在方法区），他们的内存地址不一样，所以为false。
		 * 
		 * 2，两个都是非new出来的Integer，如果数在-128到127之间，则是true,否则为false。因为java在编译Integer
		 * i2 = 128的时候,被翻译成：Integer i2 =
		 * Integer.valueOf(128);而valueOf()函数会对-128到127之间的数进行缓存。
		 * 
		 * 3，两个都是new出来的,都为false。还是内存地址不一样。
		 * 
		 * 4，int和Integer(无论new否)比，都为true，因为会把Integer自动拆箱为int再去比。
		 */
	}
}
