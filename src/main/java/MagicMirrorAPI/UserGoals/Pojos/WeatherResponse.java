package MagicMirrorAPI.UserGoals.Pojos;

import java.util.List;

public class WeatherResponse {

    private Coord coord;
    private List<WeatherObj> weather;


    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<WeatherObj> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherObj> weather) {
        this.weather = weather;
    }
}
