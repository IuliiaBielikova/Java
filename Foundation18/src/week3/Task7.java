package week3;

import java.util.ArrayList;

public class Task7 {
	public static void main (String[] args) {
		ArrayList list=new ArrayList();
				
//		list.add(10);
//		list.add(11);
//		list.add(12);
//		list.add(13);
//		
//		int sum=sum (list);
//		System.out.println(sum);
		
		list.add("zxcv");
		list.add("zxcvbn");
		list.add("qwerttyu");
		len(list);
	}
	public static int sum (ArrayList list) {
		int sum=0;
		for (int i=0; i<list.size();i++) {
			sum=sum + (int)list.get(i);
		}
		return sum;
	}
	
	public static void len(ArrayList list) {
		for (int i=0; i<list.size();i++) {
			String s=(String)list.get(i);
			System.out.println(s.length());

		}
	}
}
