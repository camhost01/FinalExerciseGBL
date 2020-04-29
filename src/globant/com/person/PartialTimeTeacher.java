package globant.com.person;

public class PartialTimeTeacher extends Teacher{

	private int hours;
	public PartialTimeTeacher(String name, Double basSalary, int hours) {
		super(name, basSalary);
		this.hours = hours; 
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public Double calculSalary() {
		Double salary;
		salary=hours*getBasSalary();
		return salary;
	}

}
