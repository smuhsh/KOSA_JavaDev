package sec01_array.EX08_NonRectangleArray;

import java.util.Arrays;

/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 배열 교재p181 2차원 비정방 행렬 배열의 3가지 원소 값 대입방법
 * 
 * */
public class NonRectangleArray {

	public static void main(String[] args) {
		
		//비정방 행령의 선언 및 값 대입방법
		int[][] array1 = new int[2][];
		array1[0] = new int[2];
		array1[0][0] = 1;
		
		array1[0][1] = 2;
		array1[1] = new int[3];
		array1[1][0] = 3;
		array1[1][1] = 4;
		array1[1][2] = 5;
		
		System.out.println(array1[0][0]+" "+array1[0][1]);
		System.out.println(array1[1][0]+" "+array1[1][1]+" "+array1[1][2]);
		System.out.println();
		
		int[][] array2 = new int[2][];
		array2[0] = new int[] {1,2};
		array2[1] = new int[] {3,4,5};
		
		System.out.println(array2[0][0]+" "+array2[0][1]);
		System.out.println(array2[1][0]+" "+array2[1][1]+" "+array2[1][2]);
		System.out.println();
		
		//비정방 행렬의 선언 및 값 대입방법2
		int [][] array3 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array3[0][0]+" "+array3[0][1]);
		System.out.println(array3[1][0]+" "+array3[1][1]+" "+array3[1][2]);
		System.out.println();
		
		int[][] array4;
		array4 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array4[0][0]+" "+array4[0][1]);
		System.out.println(array4[1][0]+" "+array4[1][1]+" "+array4[1][2]);
		
		//비정방 행렬의 선언 및 값 대입방법3
		int[][] array5 = {{1,2},{3,4,5}};
		System.out.println(array5[0][0]+" "+array5[0][1]);
		System.out.println(array5[1][0]+" "+array5[1][1]+" "+array5[1][2]);
		System.out.println();
		
	}

}
