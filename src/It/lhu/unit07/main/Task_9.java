package It.lhu.unit07.main;

//9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task_9 {

	public static void main(String[] args) {
		int[] a = new int[] {5,25,0,48,22,4,11,185,15};
		
		printArray(a);
		placeChange(a,findIdMin(a), findIdMax(a));
		printArray(a);
	}
	
	public static int findIdMin(int[] b) {
		int id = 0;
		int min = b[0];
		for (int i = 0; i< b.length;i++) {
			if (min>b[i]) {
				min=b[i];
				id = i;
			}
		}
		return id;
		
	}
	
	public static int findIdMax(int[] b) {
		int id = 0;
		int max = b[0];
		for (int i = 0; i< b.length;i++) {
			if (max<b[i]) {
				max=b[i];
				id = i;
			}
		}
		return id;
	}
	
	public static void placeChange(int[] b, int minId, int maxId) {
		int t = b[maxId];
		b[maxId] = b[minId];
		b[minId] = t;
	}
	
	public static void printArray(int[] b) {
		for (int i = 0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}

}
