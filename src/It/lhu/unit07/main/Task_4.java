package It.lhu.unit07.main;

//4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.

public class Task_4 {

	public static void main(String[] args) {
		int[] mas = new int[]{1,3,8,9,44,124};
	
		int m = mas[0];
		
		for(int i = 1; i<mas.length;i++) {
			if(m>mas[i]) {
				System.out.print("Не возрастающая");
				break;
			}
			m=mas[i];
		}
		System.out.print("Возрастающая");
		
	}

}
