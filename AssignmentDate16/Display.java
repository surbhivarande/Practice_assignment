package AssignmentDate16;

import java.util.LinkedList;

public class Display {
public static void main(String[]args) {
	
	LinkedList<String>l1=new LinkedList<>();
	l1.add("black");
	l1.add("red");
	l1.add("white");
	
	System.out.println(l1);
	for(int i=0;i<l1.size();i++) {
		System.out.println("Position of elements:"+i+" "+l1.get(i));
	} 
}
}
