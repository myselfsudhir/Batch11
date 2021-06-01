package datastructure;

import java.util.Scanner;

public class SumArray {
	static int sum(int arr[]) {
		int res=0;
		for (int i = 0; i < arr.length; i++) {
			res+=arr[i];
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sum(arr));
		sc.close();
	}
}
