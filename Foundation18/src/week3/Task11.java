package week3;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Task11 {
	public static void main (String[]args) throws IOException{
//		FileReader reader=new FileReader("C:/Java");
		FileReader reader=new FileReader("text.txt");
		Scanner scan=new Scanner(reader);
//		String line=scan.nextLine();
//		System.out.println(line);
//		String line1=scan.nextLine();
//		System.out.println(line1);
//		String line2=scan.nextLine();
//		System.out.println(line2);
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
	}
}
