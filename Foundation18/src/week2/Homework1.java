package week2;
import java.util.Scanner;
public class Homework1 { //lestnitsa zvezdy
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		drawStair (height);
	}

public static void drawStair(int height) {
	if (height<=0) {
		System.out.println("Неверное значение высоты");
	}
	for (int i=height-1; i>=0; i--) {
		for (int j=i; j<height; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	} 
}
