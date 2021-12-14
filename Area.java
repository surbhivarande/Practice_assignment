package assignment;
import java.util.Scanner;
public class Area {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		double r=sc.nextDouble();
		
		double area= Math.PI *r*r;
		System.out.println("Area of Circle:"+area);
		double para= 2 * Math.PI *r;
		System.out.println("Perimeter of Circle:"+para);
	}
}