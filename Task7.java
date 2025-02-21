package GuviJavaTask4;
import java.util.ArrayList;
import java.util.List;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> MyList = new ArrayList<Integer>();
		
		MyList.add(24);
		MyList.add(56);
		MyList.add(89);
		MyList.add(78);
		
//		System.out.println("My list is "+MyList);
		
		int[] MyArray = new int[4];
		MyArray[0]=MyList.get(0);
		MyArray[1]=MyList.get(1);
		MyArray[2]=MyList.get(2);
		MyArray[3]=MyList.get(3);
		
		System.out.println("Elements of My array is ");
		
		for(Integer Elements:MyArray ) {
			
			System.out.println(Elements);
		}

	}

}
