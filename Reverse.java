package datastructure;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int br[]= reverseArray(arr, n);
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i]+" ");
		}
	}
	static int[] reverseArray(int arr[],int n) {
		int br[]=new int[n];
		for(int i=0;i<n;i++) {
			br[i]=arr[n-i-1];
		}
		return br;
	}
}
