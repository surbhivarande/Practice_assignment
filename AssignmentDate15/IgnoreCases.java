package AssignmentDate15;

public class IgnoreCases {
public static void main(String args[]) {
	String str1="surbhi";
	String str2="SurBhi";
	String str3="SURBHI";
	
	boolean result=str2.equalsIgnoreCase(str3);
	System.out.println("Str id equal to str1"+result);
	
	boolean result2=str2.equalsIgnoreCase(str3);
	System.out.println("str2 is equal to str3"+result2);
}
}
