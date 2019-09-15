package child;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ChildApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ChildApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		// For test
		System.out.println(com.example.CommonUtility.class.getName());
	}
}
