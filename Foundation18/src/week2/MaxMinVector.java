package week2;
import java.util.Scanner;
public class MaxMinVector {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int qty = scan.nextInt();
		if (qty<=0) {
		System.out.println("Неверный размер вектора");
		} else {
		int[] array = new int [qty];
	swapMaxMinVector(array);
		}
}		
public static void swapMaxMinVector(int[] vector) {
	for(int i=0; i<vector.length; i++) {
	vector[i]=(int)(Math.random()*10);
			}
	for (int i=0; i<vector.length; i++) {
	System.out.print(vector[i]+" ");
		}
	System.out.println();
	
	int max = 1;
    int min = 0;
    for(int i = 1; i < vector.length; i++){
        if(vector[i]>max){
            max=vector[i];}
        }
    for(int i = 1; i < vector.length; i++){
        if(vector[i]<vector[i-1]){
            min=vector[i];}
        }
    System.out.println(min);
    System.out.println(max);
	}
}
