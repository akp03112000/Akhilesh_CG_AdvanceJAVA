package in.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.cg.beans.Student;
import in.cg.resources.java_Configuration_autowired;

public class MainMethod {

    public static void main(String[] args) {

        ApplicationContext context =
            new AnnotationConfigApplicationContext(
                java_Configuration_autowired.class);

        Student std =
            context.getBean("createStudentObj", Student.class);

        std.display();
    }
}