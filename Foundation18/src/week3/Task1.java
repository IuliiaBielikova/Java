package week3;

public class Task1 {
	
	public static void main (String[] args) {
		String str1=new String ("qwerty qwerty qwerty");
		String str2="qwerty";
		int value=10;
		String str3=String.valueOf(value);
		
//		int length=str1.length();
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		System.out.println(length);
		
//		char ch=str1.charAt(5);
//		System.out.println(ch);
		
//		String sub = str1.substring(1,4);
//		System.out.println(sub);
//		
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equalsIgnoreCase("Qwerty"));
		
		int idx=str1.indexOf("ert"); //ищет часть строки в общей строке
		int idx2=str1.lastIndexOf("ert");
		System.out.println(idx);
		System.out.println(idx2);
		
		System.out.println(str1.contains("ert"));
		
		
	}
}
