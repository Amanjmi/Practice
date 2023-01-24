import java.util.Scanner;

class UnderageException extends Exception{
	public UnderageException(String msg) {
		super(msg);
	}
}
class OverageException extends Exception{
	public OverageException() {
	}
}
class Applicant{
	int age;
	public void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter you age");
		age = scan.nextInt();
	}
	public void varify() throws UnderageException,OverageException {
		if(age<18) {
			UnderageException u1= new UnderageException("U are a child wait till 18");
			System.out.println(u1.getMessage());
			throw u1;
		}
		if(age>60) {
			OverageException u2= new OverageException();
			System.out.println("U are a too old now wait for your time and start praying");
			throw u2;
		}
		else{
			System.out.println("U are eligible distribute sweets");
		}
	}
}
class Launchrto{
	public void innitiate() {
		Applicant a =new Applicant();
		try {
			a.input();
			a.varify();
		}
		catch (UnderageException|OverageException u1){
			try {
				a.input();
				a.varify();
			}
			catch (UnderageException|OverageException u2){
				System.out.println("Your application Blocked for some time");
				System.exit(0);
				}
		}
	}
}
public class Rto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Launchrto rt=new Launchrto();
 rt.innitiate();
	}
}
