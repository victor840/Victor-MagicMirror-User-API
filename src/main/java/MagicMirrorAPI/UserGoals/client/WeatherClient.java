package MagicMirrorAPI.UserGoals.client;

import MagicMirrorAPI.UserGoals.Pojos.WeatherResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {

    private static final Logger logger = LoggerFactory.getLogger(WeatherClient.class);

    public WeatherResponse getWeatherResponse(){
        WeatherResponse weatherResponse = new WeatherResponse();

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://api.openweathermap.org/data/2.5/weather?q=newark&appid=4b79fda432626aed1c209a5462d0fc8f";
        ResponseEntity<WeatherResponse> response = restTemplate.getForEntity(url, WeatherResponse.class);
        if(response.getStatusCode() == HttpStatus.OK){
            return response.getBody();
        }else {
            logger.warn("Response not found!");
        }
        return weatherResponse;
    }

}
