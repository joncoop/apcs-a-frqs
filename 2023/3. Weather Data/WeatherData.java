import java.util.ArrayList;

public class WeatherData {
    private ArrayList<Double> temperatures;

    public void cleanData(double lower, double upper) {
        for (int i = temperatures.size() - 1; i >= 0; i--) {
            double temp = temperatures.get(i);
            boolean outOfRange = temp < lower || temp > upper;

            if (outOfRange) {
                temperatures.remove(i);
            }
        }
    }

    public int longestHeatWave(int threshold) {
        int longestStreak = 0;
        int currentStreak = 0;

        for (int i = 0; i < temperatures.size(); i++) {
            double temp = temperatures.get(i);

            if (temp > threshold) {
                currentStreak++;
                longestStreak = Math.max(currentStreak, longestStreak);
            }
            else {
                currentStreak = 1;
            }
        }

        return longestStreak;
    }
}