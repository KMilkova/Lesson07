package It.lhu.unit07.main;

//2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

public class Task_2 {

	public static void main(String[] args) {
		int[] mas = new int[] {154,0,156,7,11,0,5,0,9};
		
		int cntZero = cntZeroInArray(mas);
				
		int[] zeroMas = madeArrayWithZroPos(mas,new int[cntZero]);
		
		printArray(mas);
		
		System.out.println();
		
		printArray(zeroMas);
		
	}
	
	public static int cntZeroInArray(int[] a) {
		int cnt = 0;
		for (int i = 0; i<a.length;i++) {
			if (a[i] == 0) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static int[] madeArrayWithZroPos(int[] a, int[] zeroMas) {
		for (int i = 0,j =0; i<a.length;i++) {
			if (a[i] == 0) {
				zeroMas[j] = i;
				j++;
			}
		}
		
		return zeroMas;
	}
	
	public static void printArray(int[] a) {
		for (int i = 0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}
}
