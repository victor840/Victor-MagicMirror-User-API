package MagicMirrorAPI.UserGoals;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class UserGoalsApplication{

	public static void main(String[] args) {
		SpringApplication.run(UserGoalsApplication.class, args);
	}

}
