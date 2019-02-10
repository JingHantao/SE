package com.atMoon.computer;

/**
 * 
 * @author moon
 * @date 2018��9��18�� ����4:59:49
 * @version 1.0 60.ʵ��һ����������������˹������Ϸ�е����У�������1��Ԫ���������Ϸ����в����䣩�� 0 0 0 0 0 0 0 0 0 0
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
				System.out.println("��" + (i+1) + "��Ԫ�ض���1");
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

	// ɾ����ά����ĵ�n�� ���½�
	public void delete(int[][] Arr, int n) {
		for (int i = n - 1; i > 0; i--) {
			if (i > 0) {
				for (int j = 0; j < Arr.length; j++) {
					Arr[i][j] = Arr[i - 1][j];// ɾ����n�к� ����λ��
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
