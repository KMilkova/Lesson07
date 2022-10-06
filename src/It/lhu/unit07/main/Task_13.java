package It.lhu.unit07.main;

//13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
//промежутке от L до N.

public class Task_13 {

	public static void main(String[] args) {
		int[] a = new int[] {22,5,6,4,7,6,1,2,44};
		int m = 2;
		int l = 2;
		int n = 12;
		
		Task_1 task_1 = new Task_1();
		task_1.printArray(a);
		
		int cnt = findCnt(a, m, l, n);
		System.out.print(cnt);

	}
	
	public static int findCnt(int[] a,int m, int l, int n) {
		int cnt = 0;
		for (int i = 0;i<a.length;i++) {
			if (isKratn(a[i], m)&& isInDist(a[i], l, n) == true) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static boolean isKratn(int a,int k ) {
		boolean check = false;
			if (a%k==0) {
				check = true;
			}
		return check;		
	}
	
	public static boolean isInDist(int a, int l, int n) {
		boolean check = false;
			if (a>l && a<n) {
				check = true;
			}

		return check;
	}
	
	

}
