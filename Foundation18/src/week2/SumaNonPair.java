package week2;

import java.util.Scanner;

public class SumaNonPair {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int qty = scan.nextInt();
		if (qty<=0) {
		System.out.println("Неверный размер вектора");
		} else {
	int[] array = new int [qty];
	calcNonPairCount(array);
		}
	}	
public static int calcNonPairCount(int[]vector) {
	for(int i=0; i<vector.length; i++) {
	vector[i]=(int)(Math.random()*100);
	}
//	for (int i=0; i<vector.length; i++) {
//	System.out.print(vector[i]+" ");
//	}
	int count=0;
	for (int i=0; i<vector.length; i++) {
		if (vector[i]%2==1) {
		count++;	
		}
	}
//	System.out.println();
	System.out.println(count);
	return count;
	}
}
