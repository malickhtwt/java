package com.example.demo;

import com.example.demo.dao.StudentDao;
import com.example.demo.dao.StudentDaoImpl;
import com.example.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.ResultSet;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(String[] args) {
//		return runner -> {
//			System.out.println("Hello World!");
//		};
//	}

//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
//		return runner -> {
////			createManyStudent(studentDao);
////			readStudent(studentDao);
//			getAllStudents(studentDao);
//		};
//	}

//	public void readStudent(StudentDao studentDao) {
//		Student student = new Student("JP", "Morgan", "jp@morgan.com");
//		studentDao.save(student);
//		int id = student.getId();
//		Student result = studentDao.findId(id);
//		System.out.println("The student is: " + result);
//	}

//	public void getAllStudents(StudentDao studentDao) {
//		List<Student> allStudents = studentDao.findAll();
//		System.out.println(allStudents);
//	}


//	public void createManyStudent(StudentDao studentDao) {
//		Student Student1 = new Student("Jonh", "Doe", "john@doe.com");
//		Student Student2 = new Student("John", "Smith", "john@smith.com");
//		Student Student3 = new Student("Jane", "Jenny", "jane@jenny.com");
//		studentDao.save(Student1);
//		studentDao.save(Student2);
//		studentDao.save(Student3);
//		System.out.println("Student id is: " + Student1.getId());
//		System.out.println("Student id is: " + Student2.getId());
//		System.out.println("Student id is: " + Student3.getId());
//	}

}
