package AssignmentDate16;

import java.util.LinkedList;

public class Insert {
public static void main(String[]args) {
	LinkedList <String>l1=new LinkedList<>();
	l1.add("s");
	l1.add("r");
	l1.add("v");
	
	
	System.out.println("Original LinkedList"+l1);
	
	l1.addFirst("k");
	l1.addLast("m");
	
	System.out.println("Final LinkedList"+l1);
}
}