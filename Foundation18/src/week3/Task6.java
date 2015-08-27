package week3;
import java.util.ArrayList;
public class Task6 {
	public static void main (String[] args) {
		ArrayList list=new ArrayList();
				
		list.add("Hello");
		list.add(true);
		list.add("Hello");
		list.add("true");
		list.add("Hello");
		list.add("Hello");
		list.add("false");
		
		System.out.println(list);
		while (list.remove(true));
		System.out.println(list);
		while (list.remove("true"));
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
}
