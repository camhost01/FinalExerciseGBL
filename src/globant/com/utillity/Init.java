package globant.com.utillity;


import java.util.ArrayList;
import java.util.List;

import globant.com.person.Assignature;
import globant.com.person.FullTimeTeacher;
import globant.com.person.PartialTimeTeacher;
import globant.com.person.Student;

public class Init {

	public static List<Student> initStudent()
	{
		List<Student> stdList = new ArrayList<>();
		Student std1 = new Student("Laura",1,21);
		Student std2 = new Student("Mariana",2,22);
		Student std3 = new Student("Andrés",3,19);
		Student std4 = new Student("Felipe",4,23);
		Student std5 = new Student("Carla",5,27);
		Student std6 = new Student("Maximo",6,20);
		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
		stdList.add(std4);
		stdList.add(std5);
		stdList.add(std6);

		return 	stdList;
	}

	public static List<FullTimeTeacher> initFullTeacher()
	{
		List<FullTimeTeacher> fulltimeTeacher = new ArrayList<>();
		FullTimeTeacher tch1 = new FullTimeTeacher("Alejandro", 2100.0,1);
		FullTimeTeacher tch2 = new FullTimeTeacher("Paola", 2200.0,3);
		
		fulltimeTeacher.add(tch1);
		fulltimeTeacher.add(tch2);
		return fulltimeTeacher;
	}
	
	public static List<PartialTimeTeacher> initpartialTeacher()
	{
		List<PartialTimeTeacher> partialTeacher = new ArrayList<>();
		PartialTimeTeacher tch3 = new PartialTimeTeacher("Jose", 1100.0,10);
		PartialTimeTeacher tch4 = new PartialTimeTeacher("Alejandra", 1200.0,9);
		
		partialTeacher.add(tch3);
		partialTeacher.add(tch4);
		return partialTeacher;
	}
	
	public static List<Assignature> initAssignatures()
	{
		List<Assignature> nAssignature = new ArrayList<>();
		List <Student> stls = new ArrayList<>(); 
		List <FullTimeTeacher> tch = new ArrayList<>();
		List <PartialTimeTeacher> ptch = new ArrayList<>();
		tch = Init.initFullTeacher();
		ptch = Init.initpartialTeacher();
		stls = initStudent();
		Assignature ass1 = new Assignature("Maths", stls, tch.get(0), 201);
		Assignature ass2 = new Assignature("Spanish", stls, tch.get(1), 401);
		Assignature ass3 = new Assignature("Biology", stls, ptch.get(0), 102);
		Assignature ass4 = new Assignature("Natural Scients", stls, ptch.get(1), 302);
		nAssignature.add(ass1);
		nAssignature.add(ass2);
		nAssignature.add(ass3);
		nAssignature.add(ass4);
		return nAssignature;
	}
}
