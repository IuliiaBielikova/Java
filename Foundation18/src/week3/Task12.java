package week3;
import java.io.FileWriter;
import java.io.IOException;

public class Task12 {
	
	public static void main (String[]args) throws IOException{
		FileWriter writer=new FileWriter ("text.txt", true);
		writer.write("Hello world");
		writer.flush();
	}

}
