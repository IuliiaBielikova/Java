package week2;
import java.util.Scanner;
public class Rectangle {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int width = scan.nextInt();
		drawRectangle (height, width);
	}
	public static void drawRectangle (int height, int width) {
		if (height==0 || height<0) {
			System.out.println("Неверное значение высоты");
		}
		if (width==0 || width<0) {
			System.out.println("Неверное значение ширины");
		}
		for (int i=1; i<=height; i++) {
			for (int j=1; j <=width;j++) {
			System.out.print("*");
			}
		System.out.println();
		}
	}
}
