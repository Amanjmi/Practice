//conversion from ineuron java to avav norueni
//public class Reverse_of_String {
//
//	public static void main(String[] args) {
//		String s1 = "ineuron java";
//		String s2="";
//		for (int i=s1.length()-1;i>=0;i--) {
//			s2=s2+s1.charAt(i);
//		}
//		System.out.println("Reverse string is: "+s2);
//	}
//
//}


//conversion from ineuron java to java ineuron
public class Reverse_of_String {

	public static void main(String[] args) {
		String s1 = "ineuron java";
		String s2="";
		String ar[]=s1.split(" ");
		for (int i=ar.length-1;i>=0;i--) {
			s2=s2+ar[i]+" ";
		}
		System.out.println("Reverse string is: "+s2);
	}

}