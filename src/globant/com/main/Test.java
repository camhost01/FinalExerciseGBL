package globant.com.main;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import globant.com.person.Assignature;
import globant.com.person.FullTimeTeacher;
import globant.com.person.PartialTimeTeacher;
import globant.com.person.Student;
import globant.com.utillity.Init;


public class Test {

	public static void main(String[] args) {
		
		String uskey = null;
		Scanner scan= new Scanner(System.in);
		while(uskey!="5")
		{
			System.out.println("*********GLOBANT UNIVERSITY**********");
		   System.out.println("1-View teachers\n"
							+ "2-View Assignatures\n"
							+ "3-Create new Student\n"
							+ "4-Create new Assignature"
							+ "\n5-Exit");
		   uskey=scan.nextLine();
		   switch(uskey)
		   {
		   case "1":
			   Teachers();
			   break;
		   case "2":
			   Assignatures();
			   break;
		   case "3":
			   break;
		   case "4":
			   break;
		   case "5":
			   System.exit(0);
			   break;
		   default: System.out.println("Wrong selection");
			   break;
		   }
		}	 
	}
	
	public static void Teachers()
	{
		List<FullTimeTeacher> ftch = new ArrayList<>();
		List<PartialTimeTeacher> ptch = new ArrayList<>();
		ftch = Init.initFullTeacher();
		ptch = Init.initpartialTeacher();
		System.out.println("******************************");
		System.out.println("FULL TIME TEACHERS");
		for(int i=0;i<ftch.size();i++)
		{
			System.out.println("Teacher: " + ftch.get(i).getName() 
							   +" - Base Salary: " + ftch.get(i).getBasSalary()
							   +" - Years of Experience: " + ftch.get(i).getExperience()
							   +" - Salary + Experience: " + ftch.get(i).calculSalary());
		}
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("PARTIAL TIME TEACHERS");
		for(int i=0;i<ftch.size();i++)
		{
			System.out.println("Teacher: " + ptch.get(i).getName() 
							   +" - Base Salary: " + ptch.get(i).getBasSalary()
							   +" - Hours per Week: " + ptch.get(i).getHours()
							   +" - Salary per hours: " + ptch.get(i).calculSalary());
		}
		System.out.println("******************************\n");
	}
	public static void Assignatures()
	{
		String subselect = null;
		Scanner scan= new Scanner(System.in);
		List <Assignature> als = new ArrayList<>();
		List <Student> lstd = new ArrayList<>();
		lstd = Init.initStudent();
		als = Init.initAssignatures();
		System.out.println("******************************");
		for(int x=0;x<als.size();x++)
		{
			
			System.out.println("Assignature: " + als.get(x).getName() + " ClassRoom: " + als.get(x).getClassroom());
		}
		for(int x=0;x<als.size();x++)
		{
			
			System.out.println("PRESS " + x + " for assignature " + als.get(x).getName() + " detail");
		}
		subselect=scan.nextLine();
		int choose = Integer.parseInt(subselect);
			System.out.println(choose);
			System.out.println("Asignature = " + als.get(choose).getName() 
		                  + "\nProfesor = " + als.get(choose).getTeacher().getName());
			System.out.println("******************************");
			for(int x = 0;x<lstd.size();x++)
			{
				System.out.println("Student = " + lstd.get(x).getName() + " / ID : " + lstd.get(x).getId());
			}
			System.out.println("******************************");
	    }

}
	 


