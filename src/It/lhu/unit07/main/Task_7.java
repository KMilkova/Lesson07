package It.lhu.unit07.main;

//7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного k, этим числом.
//Подсчитать количество замен.

public class Task_7 {

	public static void main(String[] args) {
		double k = 2.0;
		double[] a = new double[] {2.0,1.9,2.0,3.25,4.7,5.0,2.0};
				
		printArray(a);
		
		int cnt = changeArray(a, k); 
		
		
		System.out.print(cnt);
		
		
	}
	
	public static void printArray(double[] b) {
		for (int i = 0; i< b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();

	}
	
	public static int changeArray(double[] a, double k){
		int cnt = 0;
		for (int i = 0; i<a.length;i++) {
			if (a[i] > k) {
				a[i] = k;
				cnt++;
			}
		}
		printArray(a);
		return cnt;
	}

}
