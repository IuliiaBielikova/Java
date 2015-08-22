package week2;
import java.util.Scanner;
public class VectorAverage {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int qty = scan.nextInt();
			if (qty<=0) {
			System.out.println("Неверный размер вектора");
			} else {
		int[] array = new int [qty];
		calcVectorAvg(array);
			}
	}
public static int calcVectorAvg(int[]vector){
	for(int i=0; i<vector.length; i++) {
		vector[i]=(int)(Math.random()*10);
		}
	for (int i=0; i<vector.length; i++) {
	System.out.print(vector[i]+" ");
		}
	int count=0;
	int res=0;
	for (int i=0; i<vector.length; i++) {
		count=count+vector[i];
	}
	res=count/vector.length;
	System.out.println();
	System.out.println(res);
	return res;
}
}
