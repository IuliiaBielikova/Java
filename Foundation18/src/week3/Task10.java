package week3;
import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
	public static void main (String[]args){ 
		int size=getSizeFromConsole();
		ArrayList<String>array=new ArrayList<>();
		fillArrayFromConsole(array, size);
		remove (array);
		System.out.println(array);
	}
	
	public static void remove (ArrayList<String>list){
		for (int i=0; i<list.size();i++) {
			String str=list.get(i);
			if (str.length()<5) {
			list.remove(i);
			i--;
			}
		}
	}
	
	public static void fillArrayFromConsole (ArrayList<String>list, int size){
	Scanner scan=new Scanner (System.in);
	for (int i=0; i<size;i++) {
	String str=scan.nextLine();
	list.add(str);	
	}
			
	}
	public static int getSizeFromConsole(){
		Scanner scan=new Scanner (System.in);
		int val=scan.nextInt();
		return val;
	}
}
