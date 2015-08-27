package week3;

public class Task3 {
	public static void main (String[] args) {
		indexOfCount("zxcvbnm zxcvbnm zxcvbnm", "cvb");
	}

	public static int indexOfCount(String str, String sub) {
		int count=0; 
		int index = 0;
        while ((index = str.indexOf(sub, index) + 1) != 0) {
        	count++;
        }
        System.out.println(count);
        return count;
	}
}
