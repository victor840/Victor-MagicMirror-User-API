package MagicMirrorAPI.UserGoals.controller;

import MagicMirrorAPI.UserGoals.Pojos.WeatherResponse;
import MagicMirrorAPI.UserGoals.client.WeatherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    //Will need help configuring this Weather API controller class
    // Will push this to the the weatherAPI branch and pull it back in to the project if
    //i find a way to flesh out this class properly

    @Autowired
    private WeatherClient weatherClient;

    @GetMapping("/weather")
    public ResponseEntity<?> getWeather(){
        WeatherResponse response = weatherClient.getWeatherResponse();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
