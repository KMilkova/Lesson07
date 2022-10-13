package It.lhu.unit07.main;

import java.util.Random;

//12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
//простыми числами.

public class Task_12 {

	public static void main(String[] args) {
		int n = 8;
		double[] a = new double[n];
		a = madeArray(a);
		printArray(a);
		double sum =findSum(a);
		System.out.print(sum);
	}
	
	public static double findSum(double[] b) {
		double sum = 0;
		for (int i = 0; i< b.length;i++) {
			if (isSimple(i)) {
				sum+=b[i];
			}
		}
		return sum;
	}
	
	public static boolean isSimple(int i) {		
		boolean check = true;
		int cnt = 0;
		for (int j = 1; j<i;j++) {
			if (i% j == 0) {
				cnt++;

			}
		}
		if (cnt>=2) {
			return false;
		}else {
			return true;
		}
	
	}
	
	public static double[] madeArray(double[] a) {
		Random rnd = new Random();
		for (int i = 0; i<a.length;i++) {
			a[i] = rnd.nextDouble(100);
		}
		
		return a;
	}
	
	public static void printArray(double[] b) {
		for (int i = 0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}

}
