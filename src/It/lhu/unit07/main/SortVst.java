package It.lhu.unit07.main;

import java.util.Random;

public class SortVst {

	public static void main(String[] args) {
		double[] arr = new double[100];
		arr = madeArray(arr, 100);
		printArray(arr);
		
		int max;
		double temp;
		
		for (int i = 0; i< arr.length - 1;i++) {
			max = i;
			for (int j = i+1; j < arr.length;j++) {
				if (arr[j]>arr[max]) {
					max = j;
				}
			}

			temp = arr[max];
			arr[max]= arr[i];
			arr[i] = temp;
			
		}
		
		printArray(arr);
	}
	
	public static void printArray(double[] b) {
		for (int i = 0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
	
	public static double[] madeArray(double[] a, int n) {
		Random rnd = new Random();
		for (int i = 0; i<a.length;i++) {
			a[i] = rnd.nextInt(100);
		}
		
		return a;
	}
	

}
