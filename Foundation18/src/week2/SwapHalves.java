package week2;
import java.util.Scanner;
public class SwapHalves {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int qty = scan.nextInt();
		if (qty<=0) {
		System.out.println("Неверный размер вектора");
		} else {
		int[] array = new int [qty];
		swapHalves(array);
	}
}
public static void swapHalves(int[] vector) {
	for(int i=0; i<vector.length; i++) {
		vector[i]=(int)(Math.random()*10);
		}
//	for (int i=0; i<vector.length; i++) {
//	System.out.print(vector[i]+" ");
//		}
//	System.out.println();
	
	int center = vector.length >> 1;
	int val = vector.length % 2;
	for (int i = 0; i < center; i++) {
	int tmp = vector[i];
	vector[i] = vector[center + i + val];
	vector[center + i + val] = tmp;
	        }
	for (int i=0; i<vector.length; i++) {
	System.out.print(vector[i]+" ");
		}
	}
}
