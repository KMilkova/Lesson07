package It.lhu.unit07.main;

//15. Дана последовательность действительных чисел. Указать те ее элементы, которые принадлежат отрезку[с, d].

public class Task_15 {

	public static void main(String[] args) {
		int[] a = new int[] {22,5,6,4,7,6,1,2,44};
		int c = 2;
		int d =7;
		
		Task_1.printArray(a);
		
		for(int i = 0; i<a.length;i++) {
			if (a[i]>=c && a[i]<=d) {
				System.out.print(a[i]+" ");
			}
		}

	}

}
