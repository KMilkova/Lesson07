package It.lhu.unit07.main;

//8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Task_8 {

	public static void main(String[] args) {
		int[] a = new int[] {0,0,5, -9, 55,5,-21};
		
		int cntOtr = 0;
		int cntPol = 0;
		int cntZer = 0;
		
		for (int i = 0; i< a.length;i++) {
			if (a[i]>0) {
				cntPol++;
			}else if (a[i]<0) {
				cntOtr++;
			}
			else {
				cntZer++;
			}
		}
		
		System.out.print("-: "+cntOtr+ "\n+: "+cntPol+ "\n0: "+ cntZer );

	}

}
