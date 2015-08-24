package week2;
import java.util.Scanner;
public class RevertVector {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int qty = scan.nextInt();
			if (qty<=0) {
			System.out.println("Неверный размер вектора");
			} else {
		int[] array = new int [qty];
		revertVector(array);
		}
	}
public static void revertVector(int[]vector) {
	for(int i=0; i<vector.length; i++) {
		vector[i]=(int)(Math.random()*10);
		}
//	for (int i=0; i<vector.length; i++) {
//	System.out.print(vector[i]+" ");
//		}
	System.out.println();
	for ( int i = 0, j = vector.length - 1; i < j; ++i, --j ) {
          int tmp = vector[i];
          vector[i] = vector[j];
          vector[j] = tmp;
      }
	for (int i=0; i<vector.length; i++) {
	System.out.print(vector[i]+" ");
		}
	}
}