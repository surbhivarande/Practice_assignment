package assignment;
import java.util.Scanner;
public class Sumofdigit {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a value:");
		int sum=sc.nextInt();
		int a=sum%10;
	    System.out.println(a);
	    int remain=sum/10;
	    System.out.println(remain);
	    
	    int add=a+remain;
		System.out.println("Sum of the Digit is:"+add);
		
	}
}
