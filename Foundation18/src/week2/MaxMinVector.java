package week2;
import java.util.Scanner;
public class MaxMinVector {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int qty = scan.nextInt();
		if (qty<=0) {
		System.out.println("�������� ������ �������");
		} else {
		int[] array = new int [qty];
	swapMaxMinVector(array);
		}
}		
public static void swapMaxMinVector(int[] vector) {
	for(int i=0; i<vector.length; i++) {
	vector[i]=(int)(Math.random()*10);
			}
//	for (int i=0; i<vector.length; i++) {
//	System.out.print(vector[i]+" ");
//		}
//	System.out.println();
	int maxIndex = 0;
    int minIndex = 0;
    for (int i = 0; i < vector.length; i++) {
     if (vector[i] > vector[maxIndex])
      maxIndex = i;
     if (vector[i] < vector[minIndex])
      minIndex = i;
    }
    int temp = vector[maxIndex];
    vector[maxIndex] = vector[minIndex];
    vector[minIndex] = temp;
    for (int i=0; i<vector.length; i++) {
    System.out.print(vector[i]+" ");
    	}
	}
}
