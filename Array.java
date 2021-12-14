package assignment;
import java.util.LinkedList;
import java.util.Scanner;
public class Array {
	
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	//int[] arr={2,5,7,9,12,45,39};
	LinkedList <Integer>l1=new LinkedList<>();
	l1.add(2);
	l1.add(5);
	l1.add(7);
	l1.add(9);
	l1.add(12);
	l1.add(45);
	l1.add(39);
	
	System.out.println("LinkedList"+l1);
	System.out.println("Which element you want to replace");
	int x=sc.nextInt();
	System.out.println("Element you want to replace with?");
	int y=sc.nextInt();
	 
	for(int i=0;i<l1.size();i++) {
		//System.out.println(l1.get(i));
		if(l1.get(i)==x)
		{
			l1.set(i,y);
		}
	}
	System.out.println("After inserting element:"+l1);
}
}
