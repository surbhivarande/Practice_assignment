package assignment;
import java.util.HashSet;
import java.util.ArrayList;
public class P2 {
public static void main(String args[]) {
	HashSet<String> h=new HashSet<>();
	
	h.add("Sahil");
	h.add("Samidha");
	h.add("Ankita");
	h.add("Anushka");
	
	ArrayList<String> s=new ArrayList<>(h);
	System.out.println("Elements are:"+s);
}
}
