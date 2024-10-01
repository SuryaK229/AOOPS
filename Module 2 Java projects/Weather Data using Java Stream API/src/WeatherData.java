public class WeatherData {
    private String city;
    private double temperature;
    private double humidity;
    private double windSpeed;

    public WeatherData(String city, double temperature, double humidity, double windSpeed) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public String getCity() {
        return city;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "city='" + city + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                '}';
    }
}
