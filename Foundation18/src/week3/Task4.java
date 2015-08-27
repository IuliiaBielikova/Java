package week3;

import java.util.Scanner;

public class Task4 {

	public static void main (String[]args){ //2
		int size=getSizeFromConsole();
		String[]array=new String[size];
		fillArrayFromConsole(array);
		print(array);
	}
	
	public static void print (String[]array) {
		for (int i=0; i<array.length;i++){
		int len =array[i].length();
		if (len<5) {
		System.out.println(array[i]);
			}
		}
	}
	public static void fillArrayFromConsole (String[]array){
		Scanner scan=new Scanner (System.in);
		for (int i=0; i<array.length;i++){
		array[i]=scan.nextLine();	
		}
			
	}
	public static int getSizeFromConsole(){
		Scanner scan=new Scanner (System.in);
		int val=scan.nextInt();
		return val;
	}
}
