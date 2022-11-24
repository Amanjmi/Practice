
class Dog
{
	private String name;
	private int cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}	
}
public class enc_2gettersfriststrore_in_variable {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.setName("Sheru");
		System.out.println(d.getName());
		d.setCost(2000);
		// Pay attention on below line
		int cost=d.getCost();
		System.out.println(cost);
	}

}
