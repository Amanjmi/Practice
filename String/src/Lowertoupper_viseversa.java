////lower to upper
//import java.util.*;
//public class Lowertoupper_viseversa {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please writse string to be done in upper case");
//		String s1=scan.nextLine();
//        String s2="";
//        for(int i=0;i<s1.length();i++) {
//         s2=s2+((char)(s1.charAt(i)-32));
//        }
//      System.out.println("Upper case: "+s2);
//	}
//
//}


// upper to lower
//import java.util.*;
//public class Lowertoupper_viseversa {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please writse string to be done in lower case");
//		String s1=scan.nextLine();
//        String s2="";
//        for(int i=0;i<s1.length();i++) {
//         s2=s2+((char)(s1.charAt(i)+32));
//        }
//      System.out.println("Lower case: "+s2);
//	}
//
//}


//mixing problem all upper case letter to lower case and vise versa

import java.util.*;
public class Lowertoupper_viseversa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please writse string to be done in reverse case");
		String s1=scan.nextLine();
        String s2="";
        for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)>='a') {
        		s2=s2+((char)(s1.charAt(i)-32));
        	}else {
         s2=s2+((char)(s1.charAt(i)+32));
        }
        }
      System.out.println("Reverse case: "+s2);
	}
}