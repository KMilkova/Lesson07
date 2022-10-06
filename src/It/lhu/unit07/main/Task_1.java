package It.lhu.unit07.main;

import java.util.Random;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task_1 {

	public static void main(String[] args) {
		int k = 2;
		int n = 8;
		int[] A  = new int[n];
		
		A = madeArray(A);
		
		printArray(A);
		

		
		printKratn(A, k);
		
	}
	
	public static int[] madeArray(int[] a) {
		Random rnd = new Random();
		
		for (int i = 0; i<a.length;i++) {
			a[i] = rnd.nextInt(100);
		}
		
		return a;
	}
	
	public static void printArray(int[] a) {
		for(int i = 0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void printKratn(int[] a,int k ) {
		for (int i = 0;i<a.length;i++) {
			if (a[i]%k==0) {
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
