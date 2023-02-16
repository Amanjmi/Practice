import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class namesLengthSorting {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Aman");
	al.add("Jeetu");
	al.add("Saif");
	al.add("Nitin");
	al.add("Aswan");
	al.add("Zaid");
	System.out.println("Before sorting " +al);
	System.out.println();
	List<String> result=al.stream().sorted().collect(Collectors.toList());
	System.out.println(result);
	System.out.println();
	List<String> result1=al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
	System.out.println(result1);
	
	}
}
