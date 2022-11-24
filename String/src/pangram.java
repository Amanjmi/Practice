
public class pangram {

	public static void main(String[] args) {
		boolean b=false;
		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		s1=s1.replace(" ","");
		char[] ch=s1.toCharArray();
		int[] ar =new int[26];
		for (int i=0;i<ch.length;i++) {
			int index= ch[i]-65;
			ar[index]++;
		}
		for (int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
				System.out.println("String is not a pangram");
				b=true;
			}
			}
			if(b==false){
				System.out.println("String is a pangram");
			}
		}
	}


