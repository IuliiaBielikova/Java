package week2;
import java.util.Scanner;
public class VectorByRandom {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int qty = scan.nextInt();
		int[] array = new int [qty];
	fillVectorByRandom(array);
	}
public static void fillVectorByRandom(int[]vector) {
	for(int i=0; i<vector.length; i++) {
	vector[i]=(int)(Math.random()*10);
	}
	for (int i=0; i<vector.length; i++) {
		System.out.print(vector[i]+" ");
	}
}
}
