package It.lhu.unit07.main;

//11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).

public class Task_11 {

	public static void main(String[] args) {
		int[] a = new int[] {1,5,22,45,6,1,25};
		int m = 5;
		int l = 0;
		Task_1.printArray(a);
		
		for (int i = 0; i<a.length;i++) {
			l = a[i]% m;
			if (l>0 && l<(m-1)) {
				System.out.print(a[i]+ " ");
			}
		}
		

	}

}
