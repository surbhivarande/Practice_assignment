package AssignmentDate16;

import java.util.ArrayList;

public class RemoveElements {
public static void main(String[]args) {
	//create ArrayList
	ArrayList<Integer> a1 = new ArrayList<>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	//print elements
	System.out.println("Original ArrayList:"+a1);
	//remove element
	a1.remove(2);
	a1.remove(0);
	//print elements
	System.out.println(" Final ArrayList is:"+a1);
}
}
