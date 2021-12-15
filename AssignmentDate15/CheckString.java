package AssignmentDate15;
import java.util.Scanner;
public class CheckString {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String1:");
	String str1=sc.nextLine();
	System.out.println("Enter the String2:");
	String str2=sc.nextLine();
	
	if(str1.equals(str2)) {
		System.out.println("Str1 is equal to Str2");
	}
	else {
		System.out.println("Str1 is not equal to Str2");
	}
}
}
