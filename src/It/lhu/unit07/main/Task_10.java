package It.lhu.unit07.main;

//10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task_10 {

	public static void main(String[] args) {
		int[] a = new int[] {5,2,0,3,4,7,8,6};
		printArray(a);
		
		for (int i = 0; i<a.length;i++) {
			if (a[i]>i) {
				System.out.print(a[i]+" ");
			}
		}
	}
	
	public static void printArray(int[] b) {
		for (int i = 0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}

}
