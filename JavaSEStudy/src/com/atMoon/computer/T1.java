package com.atMoon.computer;

import java.awt.Point;
import java.util.Scanner;

import com.atMoon.interfaces.interfaceTest;

public class T1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Arr = new int[][] { { 1, 2, 3

		}, { 4, 5, 6

		},{7,8,9} };

		T1 t1 = new T1();
		t1.print(Arr);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("m:");
		int m=scanner.nextInt();
		System.out.println("n:");
		int n=scanner.nextInt();
		int [][]arr=new int[m][n];
		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				arr[i][j]=scanner.nextInt();
			}
			//System.out.println();
		}
		t1.print(arr);

	}

	public void print(int[][] Arr) {
		for (int i = 0; i < Arr.length; i++) {

			for (int j = 0; j < Arr[i].length; j++) {

				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
