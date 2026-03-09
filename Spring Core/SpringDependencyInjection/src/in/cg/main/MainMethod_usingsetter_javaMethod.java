package in.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.cg.beans.Student;


public class MainMethod_usingsetter_javaMethod {
	public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(applicationContext_using_setter_javaMethod.class);
		
		Student std = (Student) context.getBean(Student.class);
		
		std.display();
		
		
	}

}