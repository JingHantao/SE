package com.atMoon.list;

/*
 * ArrayList和LinkedList的大致区别如下:
 1.ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。 
 2.对于随机访问get和set，ArrayList觉得优于LinkedList，因为LinkedList要移动指针。 
 3.对于新增和删除操作add和remove，LinedList比较占优势，因为ArrayList要移动数据。 
 */

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hfhf_T0";
		 System.out.println(str.substring(str.length()-2,str.length()));

	}

}
