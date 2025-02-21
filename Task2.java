package GuviJavaTask4;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String MyName = scanner.nextLine();
		System.out.println("My String is "+MyName);
		try {
			int[] myArray = {1,2};
		System.out.println(" My Array is "+myArray);
			System.out.println("Element at 5th position is "+myArray[4]);
		} 

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This is an ArrayIndexOutOfBoundsException and Please check the index value ");
		}
		
		try {
			char TenthString = MyName.charAt(10);
			System.out.println("10th Element of the string is "+TenthString);
			
		}
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("This is a StringIndexOutOfBoundsException as the 10th element not exist");
		}
		
		
		
		

	}

}
