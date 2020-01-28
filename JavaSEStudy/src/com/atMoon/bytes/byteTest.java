package com.atMoon.bytes;

public class byteTest {
	public static void main(String[] args) {
		Double double1=1.0;
		byte b1=1,b2=2,b3,b6,b8;
		final byte b4=4,b5=6,b7=3;
		b3=(byte) (b1+b2);
		b6=b4+b5;
		b8=(byte) (b1+b4);
		//b7=(byte) (b2+b5);
		System.out.println(b3+b6);
	}
}
