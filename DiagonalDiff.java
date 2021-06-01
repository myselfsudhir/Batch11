package datastructure;

import java.util.Scanner;

public class DiagonalDiff {
	static int diff(int arr[][]) {
		int prime=0,sub=0;
		int n = arr.length;
		for(int i = 0 ;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==j)
					prime+=arr[i][j];
				if(i+j==n-1)
					sub+=arr[i][j];
			}
		}
		return Math.abs(prime-sub);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		System.out.println("Enter the matrix");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(diff(arr));
		sc.close();
	}
}
