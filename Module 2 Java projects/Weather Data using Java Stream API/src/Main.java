import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<WeatherData> weatherDataList = Arrays.asList(
                new WeatherData("Hyderabad", 35.0, 70.0, 15.0),
                new WeatherData("Hyderabad", 33.0, 65.0, 12.0),
                new WeatherData("Bangalore", 28.0, 75.0, 10.0),
                new WeatherData("Bangalore", 29.0, 72.0, 8.0),
                new WeatherData("Chennai", 36.0, 80.0, 18.0),
                new WeatherData("Chennai", 34.0, 78.0, 20.0)
        );

        // Average Temperature per City
        Map<String, Double> avgTempPerCity = weatherDataList.stream()
                .collect(Collectors.groupingBy(
                        WeatherData::getCity,
                        Collectors.averagingDouble(WeatherData::getTemperature)
                ));

        avgTempPerCity.forEach((city, avgTemp) -> System.out.println(city + " : " + avgTemp));

        // Maximum Wind Speed per City
        Map<String, Double> maxWindSpeedPerCity = weatherDataList.stream()
                .collect(Collectors.groupingBy(
                        WeatherData::getCity,
                        Collectors.collectingAndThen(
                                Collectors.maxBy((w1, w2) -> Double.compare(w1.getWindSpeed(), w2.getWindSpeed())),
                                max -> max.isPresent() ? max.get().getWindSpeed() : 0
                        )
                ));

        maxWindSpeedPerCity.forEach((city, maxWindSpeed) -> System.out.println(city + " : " + maxWindSpeed));

        // Summary Statistics for Each City
        Map<String, DoubleSummaryStatistics> statsPerCity = weatherDataList.stream()
                .collect(Collectors.groupingBy(
                        WeatherData::getCity,
                        Collectors.summarizingDouble(WeatherData::getTemperature)
                ));

        statsPerCity.forEach((city, stats) -> System.out.println(city + " : " + stats));
    }
}
