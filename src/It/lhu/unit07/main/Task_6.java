package It.lhu.unit07.main;

//6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.

public class Task_6 {

	public static void main(String[] args) {
		int[] a = new int[] {22,5,6,4,7,6,1,2,44};
		
		Task_9.printArray(a);
		
		int minLength = findMax(a)-findMin(a);

		System.out.print(minLength);
		
	}
	
	public static int findMax(int[] b) {
		int max = b[0];
		for (int i = 0; i< b.length;i++) {
			if (max<b[i]) {
				max=b[i];
			}
		}
		return max;
	}

	public static int findMin(int[] b) {
		int min = b[0];
		for (int i = 0; i< b.length;i++) {
			if (min>b[i]) {
				min=b[i];
			}
		}
		return min;
		
	}
}
