package It.lhu.unit07.main;

//14. Дан одномерный массив A[N]. Найти:

//max( , , , ) min( , , , ) a2 a4  a2k + a1 a3  a2k+1

public class Task_14 {

	public static void main(String[] args) {
		int[] a = new int[] {55,2,6,7,8,61,1,5,6,7,9,8};
		Task_1.printArray(a);
		
		int cntChetn = 0;
		int cntNeChetn = 0;
		if (a.length%2 == 0){
			cntChetn = a.length/2;
			cntNeChetn = a.length/2;
		}else {
			cntChetn = a.length/2;
			cntNeChetn = a.length/2-1;
		}
		
		
		int[] chetm = madeArray(a, cntChetn, 0);
		int[] neChetm = madeArray(a, cntNeChetn, 1);
		
		Task_1.printArray(chetm);
		Task_1.printArray(neChetm);
		

		int maxChetn = Task_6.findMax(chetm);
		int minNeChetn = Task_6.findMin(neChetm);
		
		int res = minNeChetn+maxChetn;
		
		System.out.print(res);


	}
	
	public static int[] madeArray(int[] a, int n, int k) {
		int[] arr = new int[n];
		if (k == 0) {
			for (int i = 0, j = 0; i<a.length;i++) {
				if (i%2 == 0) {
					arr[j] = a[i];
					j++;
				}
			}
		}
		else {
			for (int i = 0, j = 0; i<a.length;i++) {
				if (i%2 != 0) {
					arr[j] = a[i];
					j++;
				}
			}
		}
		return arr;
	}


}
