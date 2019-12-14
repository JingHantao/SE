package com.atMoon.zhengzebiaodashi;

public class ZhengZeTest {
	
	public static void main(String [] args) {
		//replaceFirst 和 replaceAll 方法用来替换匹配正则表达式的文本。
		//不同的是，replaceFirst 替换首次匹配，replaceAll 替换所有匹配
		String classFileByreplaceAll="com.atMoon.".replaceAll(".", "/")+"MyClass.class";
		//.（点号）也是一个正则表达式，它匹配任何一个字符如："a" 或 "1"。
		//\. 匹配 "."
		String classFileByreplaceFirst="com.atMoon.".replaceFirst(".", "/")+"MyClass.class";
		//replace 方法直接替换字符串,第二个参数替换所有的第一个参数的类容 最后返回一个新的字符串
		String classFileByreplace="com.atMoon.".replace(".", "/")+"MyClass.class";
		//正则表达式替换.的正确使用:\\.
		String classFileByreplaceAllSuccess="com.atMoon.".replaceAll("\\.", "/")+"MyClass.class";
		
		System.out.println("classFileByreplaceAll:"+classFileByreplaceAll);
		System.out.println("classFileByreplaceFirst:"+classFileByreplaceFirst);
		System.out.println("classFileByreplace:"+classFileByreplace);
		System.out.println("classFileByreplaceAllSuccess:"+classFileByreplaceAllSuccess);
	}

}
