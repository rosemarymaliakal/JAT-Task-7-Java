package GuviJavaTask4;
import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter age");
    	int UserAge=scanner.nextInt();
    	
        try {
            checkAge(UserAge); // This will throw CustomException because age is less than 18
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    
    // Method that throws CustomException
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18, not allowed.");
        } 
    }
}



