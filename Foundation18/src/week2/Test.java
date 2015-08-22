package week2;
public class Test {
public static void main (String[]args) {
	int [] array = new int [10];
	int [] array2 = new int [20];
	fill (array);
	print (array);
	fill (array2);
	print (array2);
	System.out.println(pairOrNot(5));
}

public static void print(int[]array) {
	for (int i=0; i<array.length; i++){
		System.out.print(array[i]+" ");
	}
	System.out.println();
}

public static void fill(int []array) {
for (int i=0; i<array.length; i++) {
	array [i]=(int)(Math.random()*10);
	}
}

public static boolean pairOrNot (int val){
//	if (val%2==0){
//		return true;
//	} else {
//		return false;
	return val%2==0;

}
}
