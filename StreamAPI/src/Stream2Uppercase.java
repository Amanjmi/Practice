import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2Uppercase {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Jeetu");
		name.add("Kaif");
		name.add("Aswan");
		name.add("Saif");
		name.add("afsheen");
		
		System.out.println(name);
		ArrayList<String> uc=new ArrayList<String>();
		for(String names:name)
			uc.add(names.toUpperCase());
		System.out.println(uc);
		List<String> streamList=name.stream().map(names->names.toUpperCase()).collect(Collectors.toList());
		System.out.println(streamList);
	streamList.forEach(names->System.out.println(names));
	System.out.println();
	streamList.forEach(System.out::println);
	}
}
