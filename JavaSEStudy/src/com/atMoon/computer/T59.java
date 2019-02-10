package com.atMoon.computer;
/**
 * 
 * @author moon
 * @date 2018年9月18日 下午5:38:24
 * @version 1.0
 * 59.实现一个程序来判断如下棋盘是否有五子连珠现象（只考虑横和竖）；如果有，请输出这5颗棋子的坐标。有几种输出几种。
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 1 0 0 0 0 0 0
0 0 0 1 1 1 1 1 0 0 0
0 0 1 0 0 1 1 0 0 0 0
0 1 0 0 1 1 0 0 0 0 0
0 0 0 0 1 0 1 1 1 0 0
0 0 0 1 0 1 0 0 0 0 0
0 0 0 0 1 0 1 1 1 0 0
0 0 0 1 1 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
 */

public class T59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Arr = new int[][] { 
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, 
			{ 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
			{ 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0 }, 
			{ 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1 }, 																						
			{ 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0 }, 
			{ 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, };
		
		Block block=new Block();
		block.print(Arr);
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length-5; j++) {

				if (Arr[i][j] ==1) {
					boolean row = true;//判断行
					for(int k=1;k<5;k++){
						if(Arr[i][j+k]!=Arr[i][j]){
							row=false;
						}
						else {
							continue;
						}
					}
					if(row){
						System.out.println("第 "+(i+1)+" 行存在5个1");
					}
				}
				else{
					continue;
				}
			}
		}
		for (int i = 0; i < Arr.length-5; i++) {
			for (int j = 0; j < Arr.length; j++) {

				if (Arr[i][j] ==1) {
					boolean column = true;//判断列
					for(int k=1;k<5;k++){
						if(Arr[i+k][j]!=Arr[i][j]){
							column=false;
						}
						else {
							continue;
						}
					}
					if(column){
						System.out.println("第 "+(j+1)+" 列存在5个1");
					}
				}
				else{
					continue;
				}
			}
		}

	}

}
