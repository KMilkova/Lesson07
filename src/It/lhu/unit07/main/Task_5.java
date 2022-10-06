package It.lhu.unit07.main;

//5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
//Если таких чисел нет, то вывести сообщение об этом факте.

class Task_5 {

	public static void main(String[] args) {
		int[] a = new int[] {3,22,4,6,77,7,4,3};
		Task_1 task_1 = new Task_1();
		task_1.printArray(a);	
		
		int cntChetn = newArraySize(a);
		if (cntChetn==0) {
			System.out.print("Нет четный чисел");
		}else {
			int[] newArray = new int[cntChetn];
			for(int i =0, j = 0; i<a.length;i++) {
				if (isChetn(a[i])) {
					newArray[j]=a[i];
					j++;
				}
			}
			task_1.printArray(newArray);	
		}

	}
	
	public static int newArraySize(int[] a) {
		int cnt = 0;
		for (int i = 0;i<a.length;i++) {
			if (isChetn(a[i])) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static boolean isChetn(int i) {
		boolean check = false;	
		if (i%2 == 0) {
			check = true;
		}

		return check;
	}
	

}
