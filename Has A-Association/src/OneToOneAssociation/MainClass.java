package OneToOneAssociation;

public class MainClass {
		public static void main(String[] args) {

			Account account = new Account("ABC123", "sachin", "Savings");

			// Constructor Injection
			Employee employee = new Employee("IND10", "sachin", "MI", account);
			employee.getEmployeeDetails();

		}

	}

