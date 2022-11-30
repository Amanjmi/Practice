//Calling a constructor at the time of object creation
class Student1
{
	private String name;
	private int age;
	private String city;
	
	public Student1(String name, int age, String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;

	}
	 public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}	
}
public class constructor {
	public static void main(String[] args) {
		Student1 std1=new Student1("Rohit", 17,"Hyderabad");
		//std1.setData("Rohan", 18, "Bengaluru");
		
		
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		System.out.println(std1.getCity());

	}

}

//class DBConnectivity
//{
//	public DBConnectivity()
//	{
//		System.out.println("Connect to database");
//	}
//}
//
//
//
//public class constructor {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		DBConnectivity db=new DBConnectivity();
//		
//
//	}
//
//}
