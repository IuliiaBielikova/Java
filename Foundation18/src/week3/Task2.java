package week3;

public class Task2 {

	public static void main (String[] args) {
		String s="qwerty";
		String res=revert(s);
		System.out.println(res);
	}
	
	public static String revert (String str) {
		String result="";
		for (int i = str.length()-1; i>=0; i--) {
//		result= result+str.charAt(i);
		result +=str.charAt(i);
		}
//			System.out.print(str.charAt(i));
		return result;
		
	public static int indexOfCount(String str, String sub) { //1
		return 0;
	}
	public static void main (String[]args){ //2
		int size=getSizeFromConsole();
		String[]array=new String[size];
		fillArrayFromConsole(array);
		print(array);
	}
	
	public static void print (STring[]array) {
		
	}
	public static void fillArrayFromConsole (String[]array){
		
	}
	public static int getSizeFromConsole(){
		return 0;
	}
	}
}
