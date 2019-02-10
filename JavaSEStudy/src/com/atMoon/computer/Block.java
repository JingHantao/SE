package com.atMoon.computer;

/**
 * 
 * @author moon
 * @date 2018年9月18日 下午4:59:49
 * @version 1.0 60.实现一个程序来消除俄罗斯方块游戏中的满行（把满行1的元素消除，上方所有层下落）： 0 0 0 0 0 0 0 0 0 0
 *          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 *          1 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0 0 1 1
 *          1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1
 *          1 1 1 1 0 1 1 1 1
 * 
 */

public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Arr = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // n=6
																							// i=5
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, };

		Block block = new Block();
		block.print(Arr);
		for (int i = 0; i < Arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < Arr.length-1; j++) {

				if (Arr[i][j] ==0) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println("第" + (i+1) + "行元素都是1");
				block.delete(Arr, i+1);
			}
		}
		 System.out.println("----------------");
		// block.delete(Arr, 8);
		// block.delete(Arr, 9);
		 block.print(Arr);
	}

	public void print(int[][] Arr) {
		for (int i = 0; i < Arr.length; i++) {

			for (int j = 0; j < Arr[i].length; j++) {

				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 删除二维数组的第n行 并下降
	public void delete(int[][] Arr, int n) {
		for (int i = n - 1; i > 0; i--) {
			if (i > 0) {
				for (int j = 0; j < Arr.length; j++) {
					Arr[i][j] = Arr[i - 1][j];// 删除第n行后 交换位置
				}
			}
			if (i == 0) {
				for (int j = 0; j < Arr.length; j++) {
					Arr[i][j] = 0;
				}
			}
		}
	}
}
