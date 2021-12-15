package AssignmentDate15;
import java.util.Scanner;
public class CharArray {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.nextLine();
	
	char[] arr=str.toCharArray();
	System.out.println(arr);
	
}
}
