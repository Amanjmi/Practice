package One_Many_Association;

public class Department {
	private String deptId;
	private String deptName;
	private Employee[] employee;
	public Department(String deptId, String deptName, Employee[] employee) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.employee = employee;
	}
	public void getDepartmentDetails() {
		System.out.println("Department Details are ");
		System.out.println("__________________________");
		System.out.println("Department ID : "+ deptId);
		System.out.println("Department Name : "+deptName);
		System.out.println();
		System.out.println("Employee Detais are ");
		System.out.println("__________________________");
		for(Employee emp:employee) {
		System.out.println("Employee ID : " + emp.empId);
		System.out.println("Employee Name : " +emp.empName);
		System.out.println("Employee Address : "+ emp.empAdd);
		System.out.println();
	}
	}

}
