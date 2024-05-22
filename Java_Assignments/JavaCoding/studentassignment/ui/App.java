package studentassignment.ui;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;
import studentassignment.service.StudentService;
import studentassignment.service.StudentServiceImpl;
public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student stud = new Student();
		stud.setId(1);
		stud.setName("MS Dhoni");
		stud.setCity("Ranchi");
		Student stud1 = new Student(2,"SKY","Lucknow");
		Student stud2 = new Student(3,"R Ashwin","Chennai");
		Student stud3 = new Student(4,"Ishan Kishan","Patna");
		Student stud4 = new Student(5,"Virat Kohli","New Delhi");
		Student stud5 = new Student(6,"Rohit Sharma","New Delhi");
		Student stud6 = new Student(7,"Irfan Pathan","Ahmedabad");
		Student stud7 = new Student(2,"SKY","Lucknow");
		Student stud8 = new Student(3,"R Ashwin","Chennai");
		Student stud9 = new Student(4,"Ishan Kishan","Patna");
		Student stud10 = new Student(5,"Virat Kohli","New Delhi");
		Student stud11 = new Student(6,"Rohit Sharma","New Delhi");
		Student stud12= new Student(7,"Irfan Pathan","Ahmedabad");

		StudentService studentService = new StudentServiceImpl();



		List<Student> studentList = Arrays.asList(stud,stud1,stud2,stud3,stud4,stud5,stud6,
				stud7,stud8,stud9,stud10,stud11,stud12);
		for (Student student :studentList) {
			try {
				System.out.println(studentService.addStudent(student));

			} catch(Exception e) {
				e.getMessage();
			}
		}

		
		System.out.println();
		System.out.println("***********Menu************");
		
		

		
		System.out.print(""
				+ "1. Read all student\n"
				+ "2. Display all the student belong to a particular city\n"
				+ "3. Display name wise sorted\n"
				+ "4. Display city wise sorted.\r\n"
				+ "5. Display student details with id\n"
				+ "Enter your choice: ");

		int option = sc.nextInt();
		switch(option) {
		case 1:
		{
			System.out.println();
			System.out.println("**********Students List**********");
			for(Student student : studentService.getAllStudents()) {
				System.out.println(student);
			}
			System.out.println();
			break;
		}
		case 2:
		{
			System.out.print("Enter city: ");
			String city = sc.next();

			System.out.println();
			System.out.println("*********Students from " + city + "*********");
			try {
				for(Student student : studentService.getStudentByCity(city)) {
					System.out.println(student);
				}
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		case 3:
		{
			System.out.println();
			System.out.println("*********Students list sorted by name*********");
			for(Student student : studentService.sortStudentsByName()) {
				System.out.println(student);
			}
			break;
		}
		case 4:
		{
			System.out.println();
			System.out.println("*********Students list sorted by name*********");
			for(Student student : studentService.sortStudentsByCity()) {
				System.out.println(student);
			}
			break;
		}
		case 5:
		{
			System.out.println();
			System.out.println("Get student detail by ID: ");
			System.out.print("Enter Student ID: ");
			int id = sc.nextInt();
			System.out.println("************************************");
			try {
				Student student = studentService.displayStudent(id);
				System.out.println(student);
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());;
			}
			break;
		}
		
		}
		
		sc.close();
		}
	

}
