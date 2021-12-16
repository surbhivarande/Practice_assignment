package AssignmentDate16;

import java.util.LinkedList;

public class SpecificPosition {
	public static void main(String[]args) {
		//create LinkedList
		LinkedList <String>l1=new LinkedList<>();
		l1.add("s");
		l1.add("r");
		l1.add("v");
		
		//print LinkList
		System.out.println("Original LinkedList"+l1);
		//add elements at Specific Position
	 l1.add(2,"a");
	 l1.add(4,"c");
	 System.out.println("Final LinkedList"+l1);
	 for(String m:l1) {
	 System.out.println(m);
	}
	}
}