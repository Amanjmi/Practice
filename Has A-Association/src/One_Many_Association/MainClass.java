package One_Many_Association;

public class MainClass {

	public static void main(String[] args) {
		Employee e1=new Employee("131313" ,"Santa" , "sbl");
		Employee e2=new Employee("131314" ,"Banta" , "mbd");
		Employee e3=new Employee("131315" ,"Anta" , "fbd");
		
		Employee[] emp=new Employee[3];
		 emp[0]=e1;
		 emp[1]=e2;
		 emp[2]=e3;
		 Department department= new Department("Man1113", "Production" ,emp);
		 department.getDepartmentDetails();
	}

}
