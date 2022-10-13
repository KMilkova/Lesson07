package It.lhu.unit07.main;

import java.util.Random;

//20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
//(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Task_20 {

	public static void main(String[] args) {
		int n = 10;
		int[] a = new int[n];
		a = madeArray(a);
		
		Task_1.printArray(a);

		
		for (int i = 1; i<a.length;i+=2) {
			a[i] = 0;
		}
		
		Task_1.printArray(a);
		
	}
	
	public static int[] madeArray(int[] a) {
		Random rnd = new Random();
		for (int i = 0; i<a.length;i++) {
			a[i] = rnd.nextInt(100);
		}
		
		return a;
	}

}
