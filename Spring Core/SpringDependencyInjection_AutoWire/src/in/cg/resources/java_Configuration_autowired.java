package in.cg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.cg.beans.Address;
import in.cg.beans.Student;

@Configuration
@ComponentScan("in.cg.beans")
public class java_Configuration_autowired {

    @Bean
    public Address creatAddressObj() {
        Address a = new Address();
        a.setCity("Bangalore");
        a.setHno(32);
        a.setPincode(452689);
        return a;
    }

    @Bean
    public Student createStudentObj() {
        Student s1 = new Student();
        
        s1.setId(1001);
        s1.setName("Sanjay");
        s1.setEmail("sanjay@gmail.com");
        return s1;
    }
}