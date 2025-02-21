package GuviJavaTask4;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File Myfile = new File("MyNewFile.txt");
		Scanner scanner = new Scanner(Myfile);
;	}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("The File not found");
		}
		
		finally {
			System.out.println("Please enter a valid path");
		}
		
	}

}
