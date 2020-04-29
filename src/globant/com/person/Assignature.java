package globant.com.person;

import java.util.List;



public class Assignature extends Entity{
	

	private List<Student> students;
	private Teacher teacher;
	private int classroom;
	public Assignature(String name,List <Student> students, Teacher teacher, int classroom)
	{
		super(name);
		this.students=students;
		this.teacher=teacher;
		this.classroom=classroom;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
