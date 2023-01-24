import java.util.Scanner;

class InvalicustomerException extends Exception{
	public InvalicustomerException (String str) {
		super(str);
		
	}
}

class Attm {
	String userid="2244";
	String password="1111";
	String uid;
	String pwd;
	public void input(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your User ID");
		uid=scn.nextLine();
		System.out.println("Enter your Password");
		pwd=scn.nextLine();
	}
	public void varify() throws InvalicustomerException {
		if (userid==uid && pwd ==password){
			System.out.println("Take your cash");
		}
		else 
		{
		InvalicustomerException ice = 	new InvalicustomerException("Are you mad u understand me foolish");
				System.out.println(ice.getMessage());
		throw ice;
		}
	}
}
class Dank {
	public void initiate() {
	Attm atm=new Attm();
		try {
		atm.input();
		atm.varify();
	}
		catch (InvalicustomerException i1){
			try {
				atm.input();
				atm.varify();
			}
			catch (InvalicustomerException i2){
				try {
					atm.input();
					atm.varify();
				}
				catch (InvalicustomerException i3){
					try {
						atm.input();
						atm.varify();
					}
					catch (InvalicustomerException i4){
						System.out.println("O chor we caught u Don't run now");
					}		
		}
}
}
	}
	}

public class rough_customException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dank d=new Dank();
    d.initiate();
	}
}
