package com.atMoon.map;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HsahMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hs;
		Array a;
		Map<String,String>map = new HashMap<>();
		List<Integer> onehundred = new ArrayList<Integer>();
		for(int i = 0 ;i < 100 ; i++){
			onehundred.add(i);
		}
		for (Integer integer:onehundred) {
			map.put("key:" + integer, "val" + integer);
		}
	}

}
