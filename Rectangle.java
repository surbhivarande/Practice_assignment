package assignment;
import java.util.Scanner;
public class Rectangle {
//Area of rectangle=length*width
	//perimeter of rectangle=2l+2w
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of length");
		int l=sc.nextInt();
		
		System.out.println("Enter value of Width");
		int w=sc.nextInt();
		int area=l*w;
		
		System.out.println("Area of Rectangle:"+area);
		int para=2*l+2*w;
		System.out.println("Perimeter of Rectangle:"+para);
	}
}
