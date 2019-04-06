import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class wordRunner {
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		String output = "";

		int size = file.nextInt();
		file.nextLine();
		
		Word[] array= new Word[size];
		
		for (int x = 0; x < size; x++)
		{
			String s = file.nextLine();
			Word next= new Word(s);
			array[x]= next;
		}
		
		Arrays.sort(array);
	System.out.println(Arrays.toString(array));		
		
		}
}
