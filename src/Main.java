import java.util.Date;

public class Main {

	public static void main(String[] args)
	{

		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
		StudentGroup sg=new StudentGroup(10);
		Student s1 = new Student(01,"Harikrihna",new Date(1996,01,06),63.568);
		Student s2 = new Student(02,"Harikrihna",new Date(1996,01,06),63.568);
		Student s3 = new Student(03,"Harikrihna",new Date(1996,01,06),63.568);
		Student s4 = new Student(04,"Harikrihna",new Date(1996,01,06),63.568);
sg.addFirst(s1);

	}

}
