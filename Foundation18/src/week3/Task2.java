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
		
	}
}
