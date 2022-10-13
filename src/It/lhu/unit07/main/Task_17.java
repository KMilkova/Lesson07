package It.lhu.unit07.main;

//17. Дана последовательность целых чисел. Образовать новую последовательность, выбросив из исходной 
//те члены, которые равны min


public class Task_17 {

	public static void main(String[] args) {
		int[] a = new int[] {24,4,6,8,5,4,6,8,4,6};
		Task_1.printArray(a);
		
		int min = findMin(a);
		
		int newSize = findSize(a,min);		
		
		int[] newArray = madeNewArray(a, newSize, min);
				
		Task_1.printArray(newArray);
	}
	
	public static int findMin(int[] b) {
		int min = b[0];
		for(int i = 0; i<b.length; i++) {
			if (b[i]<min) {
				min = b[i];
			}
		}
		return min;
	}
	
	public static int findSize(int[] a,int min) {
		int newSize = 0;
		for(int i = 0; i<a.length;i++) {
			if (a[i] != min) {
				newSize++;
			}
		}
		return newSize;
	}
	
	public static int[] madeNewArray(int[] a, int newSize, int min) {
		int[] newArray =new int[newSize];
		for (int i = 0, j = 0;i<a.length;i++) {
			if (a[i] != min) {
				newArray[j] = a[i];
				j++;
			}
		}
		return newArray;
	}

}
