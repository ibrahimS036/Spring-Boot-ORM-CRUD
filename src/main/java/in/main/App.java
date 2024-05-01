package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.FirstSpringProgram.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome To First Spring Program...Using xml Configuration.");

		String Config_location = "/in/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(Config_location);

		Student std1 = (Student) context.getBean("stId1");
		std1.display();
		
		System.out.println("==========================");
		
		Student std2 = (Student) context.getBean("stId2");
		std2.display();

	}
}
