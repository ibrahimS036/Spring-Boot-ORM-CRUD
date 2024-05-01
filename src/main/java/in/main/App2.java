package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.beans.FirstSpringProgram.Student2;

public class App2 {

	public static void main(String[] args) {

		System.out.println("Welcome to spring...");
		String fileLocation = ("/in/resources/applicationContext2.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext(fileLocation);
		Student2 std = (Student2) context.getBean("stdId3");
		std.display();
		System.out.println("====================================");
		Student2 std1 = (Student2) context.getBean("stdId4");
		std1.display();

	}

}
