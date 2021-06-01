package datastructure;

import java.util.Scanner;

public class LeftRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the amount to rotate");
		int d = sc.nextInt();
		int br[] =leftRotate(arr, d);
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i]+" ");
		}
		
		sc.close();
	}
	static int[] leftRotate(int arr[],int d) {
		int n = arr.length;
		int br[]=new int[n];
		d=d%n;
		int k=0;
		for (int i = d; i < n; i++) {
			br[k++]=arr[i];
		}
		for(int i=0;i<d;i++) {
			br[k++]=arr[i];
		}
		return br;
	}
}
