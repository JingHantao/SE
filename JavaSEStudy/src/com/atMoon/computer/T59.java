package com.atMoon.computer;
/**
 * 
 * @author moon
 * @date 2018��9��18�� ����5:38:24
 * @version 1.0
 * 59.ʵ��һ���������ж����������Ƿ���������������ֻ���Ǻ������������У��������5�����ӵ����ꡣ�м���������֡�
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
					boolean row = true;//�ж���
					for(int k=1;k<5;k++){
						if(Arr[i][j+k]!=Arr[i][j]){
							row=false;
						}
						else {
							continue;
						}
					}
					if(row){
						System.out.println("�� "+(i+1)+" �д���5��1");
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
					boolean column = true;//�ж���
					for(int k=1;k<5;k++){
						if(Arr[i+k][j]!=Arr[i][j]){
							column=false;
						}
						else {
							continue;
						}
					}
					if(column){
						System.out.println("�� "+(j+1)+" �д���5��1");
					}
				}
				else{
					continue;
				}
			}
		}

	}

}
