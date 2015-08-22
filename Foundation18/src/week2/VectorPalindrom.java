package week2;
import java.util.Scanner;
public class VectorPalindrom {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int qty = scan.nextInt() ;
	int[] array = new int [qty];
	for(int i=0; i<array.length; i++) {
	array[i]=scan.nextInt();
		}
	System.out.println(isVectorPalindrom(array));
	}

public static boolean isVectorPalindrom(int[]vector) {
	for (int i=0; i<vector.length/2;i++) {
		if (vector[i]!=vector[vector.length-i-1]) {
			return false;
		}
	}
		return true;
	}
}

