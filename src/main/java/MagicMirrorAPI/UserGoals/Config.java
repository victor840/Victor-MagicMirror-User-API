package MagicMirrorAPI.UserGoals;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class Config {

    @Bean
    public RestTemplate createTemplate(){
        return new RestTemplate();
    }
}
