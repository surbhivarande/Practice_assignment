package assignment;
import java.util.Scanner;
public class Leapyear {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int a=sc.nextInt();
		if(a%4==0) {
			System.out.println("Given year is Leap Year");
		}
			else {
				System.out.println("Given year is not Leap Year");
		}
	}
}
