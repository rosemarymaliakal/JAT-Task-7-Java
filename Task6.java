package GuviJavaTask4;
import java.util.TreeMap;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> MyEmplyeeTreemap=new TreeMap<Integer, String>();
		
		MyEmplyeeTreemap.put(101, "Popy");
		MyEmplyeeTreemap.put(99,"kathy");
		MyEmplyeeTreemap.put(127, "shyam");
		MyEmplyeeTreemap.put(80, "joe");
		
		System.out.println("Employee names in alphabetical order is :");

		for(String EmpName:MyEmplyeeTreemap.values()) {
			System.out.println(EmpName);
		}
	}

}
