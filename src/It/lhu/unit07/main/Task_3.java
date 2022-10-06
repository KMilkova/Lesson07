package It.lhu.unit07.main;

//3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или
//отрицательное.

public class Task_3 {

	public static void main(String[] args) {
		int[] a = new int[] {0,0,5, -9, 55,5,-21};
		
		for (int i = 0; i< a.length;i++) {
			if (a[i]>0) {
				System.out.print("Положительное + ");
			}else if (a[i]<0) {
				System.out.print("Отрицательное - ");
			}
			else {
				continue;
			}
			break;
		}
	}

}
