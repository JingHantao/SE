package com.atMoon.zhengzebiaodashi;

public class ZhengZeTest {
	
	public static void main(String [] args) {
		//replaceFirst �� replaceAll ���������滻ƥ��������ʽ���ı���
		//��ͬ���ǣ�replaceFirst �滻�״�ƥ�䣬replaceAll �滻����ƥ��
		String classFileByreplaceAll="com.atMoon.".replaceAll(".", "/")+"MyClass.class";
		//.����ţ�Ҳ��һ��������ʽ����ƥ���κ�һ���ַ��磺"a" �� "1"��
		//\. ƥ�� "."
		String classFileByreplaceFirst="com.atMoon.".replaceFirst(".", "/")+"MyClass.class";
		//replace ����ֱ���滻�ַ���,�ڶ��������滻���еĵ�һ������������ ��󷵻�һ���µ��ַ���
		String classFileByreplace="com.atMoon.".replace(".", "/")+"MyClass.class";
		//������ʽ�滻.����ȷʹ��:\\.
		String classFileByreplaceAllSuccess="com.atMoon.".replaceAll("\\.", "/")+"MyClass.class";
		
		System.out.println("classFileByreplaceAll:"+classFileByreplaceAll);
		System.out.println("classFileByreplaceFirst:"+classFileByreplaceFirst);
		System.out.println("classFileByreplace:"+classFileByreplace);
		System.out.println("classFileByreplaceAllSuccess:"+classFileByreplaceAllSuccess);
	}

}
