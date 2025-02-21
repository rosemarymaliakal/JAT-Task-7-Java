package GuviJavaTask4;
import java.util.List;
import java.util.ArrayList;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> MyArrayList = new ArrayList<String>();
		MyArrayList.add("Rose");
		MyArrayList.add("Ann");
		MyArrayList.add("Lily");
		MyArrayList.add("Gia");
		
		System.out.println("My arraylist is "+ MyArrayList);
		
		MyArrayList.remove(0);
		MyArrayList.remove(1);
		MyArrayList.remove(1);
		MyArrayList.remove(0);
		
		System.out.println("My arraylist after removing all elements is "+MyArrayList);
	}

}
