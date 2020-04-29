package globant.com.person;

public abstract class Teacher extends Entity{

	private double basSalary;
	public Teacher(String name, Double basSalary) {
		super(name);
		this.basSalary = basSalary;
		// TODO Auto-generated constructor stub
	}
	
	
	public double getBasSalary() {
		return basSalary;
	}


	public void setBasSalary(double basSalary) {
		this.basSalary = basSalary;
	}


	public abstract Double calculSalary();

}
