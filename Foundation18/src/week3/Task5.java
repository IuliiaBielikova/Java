package week3;

import java.util.ArrayList;

public class Task5 {
	
	public static void main (String[] args) {
		ArrayList list=new ArrayList();
				
		list.add("Hello");
		list.add(10);
		list.add(2.5);
		list.add('A');
		list.add(true);
		
		System.out.println(list.size());
		System.out.println(list);
		list.add(2, "new element"); // добавить элемент
		System.out.println(list);
		list.set(3, "elem"); // заменить элемент
		System.out.println(list);
		System.out.println(list.get(4));//вывести конкретный элемент из массива
		list.remove(1); // удалить элемент
		System.out.println(list);
		System.out.println(list.contains("Hello"));
	}
}
