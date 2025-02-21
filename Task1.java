package GuviJavaTask4;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		try
		{
			int Div = num1 / num2 ;
				System.out.println("The value is "+Div);
		}	
		catch (ArithmeticException e) {
			System.out.println("This is an ArithmeticException, Please enter a nonZero number");
			
		}
		
		

	}

}
