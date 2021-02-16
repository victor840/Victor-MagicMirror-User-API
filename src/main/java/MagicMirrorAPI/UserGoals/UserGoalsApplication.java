package MagicMirrorAPI.UserGoals;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class UserGoalsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserGoalsApplication.class, args);
	}
	@Autowired
	private RestTemplate restTemplate;



	@Override
	public void run(String... args) throws Exception {


	}
}
