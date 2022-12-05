package OneToOneAssociation;

public class Employee {
	private String empId;
	private String empName;
	private String empAdd;
	Account account;
	public Employee(String empId, String empName, String empAdd, Account account) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
		this.account = account;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee Details are :: ");
		System.out.println("EMPID   ::  " + empId);
		System.out.println("EMPNAME ::  " + empName);
		System.out.println("EMPADDR ::  " + empAdd);
		System.out.println("==========================================");
		System.out.println("ACCOUNT Details are :: ");
		System.out.println("ACCNO   ::  " + account.accNo);
		System.out.println("ACCNAME ::  " + account.accName);
		System.out.println("ACCTYPE ::  " + account.accType);
	}
}
