package assignment;
import java.util.Scanner;
public class Division {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the Number1");
		int num1=sc.nextInt();
		System.out.println("Enter the Number2");
		int num2=sc.nextInt();
		
		int div=num1/num2;
		System.out.println("Division is:"+div);
	}
}
