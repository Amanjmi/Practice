package Many_to_Many;

public class Main_M_M_association {

	public static void main(String[] args) {
		Courses c1=new Courses("A11", "JAVA" , 5000);
		Courses c2=new Courses("B11", "PYTHON" , 4000);
		Courses c3=new Courses("C11", "BLLOCKCHAIN",6000);
		Courses[] crs=new Courses[3];
		crs[0]=c1;
		crs[1]=c2;
		crs[2]=c3;
		
		Students s1=new Students("J11","Aman","Sambhal",crs);
		Students s2=new Students("J12","Aswan","Meerut",crs);
		Students s3=new Students("J13","Jeetu","Delhi",crs);
		System.out.println();
		s1.getStudentsDetails();
		System.out.println("*****************************************");
		System.out.println();
		System.out.println();
		s2.getStudentsDetails();
		System.out.println("************************************"
				+ "***");
		System.out.println();
		System.out.println();
		s3.getStudentsDetails();
		}
	}

