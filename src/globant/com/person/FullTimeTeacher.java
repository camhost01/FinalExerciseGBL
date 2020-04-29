package globant.com.person;

public class FullTimeTeacher extends Teacher{
	private int experience;
	
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public FullTimeTeacher(String name, Double basSalary, int experience) {
		super(name, basSalary);
		this.experience=experience;
	}

	@Override
	public Double calculSalary() {
		Double salary;
		salary=(1.10*experience)*getBasSalary();
		return salary;
	}

}
