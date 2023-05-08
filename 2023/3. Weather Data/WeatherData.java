import java.util.ArrayList;

public class WeatherData {
    private ArrayList<Double> temperatures;

    public void cleanData(double lower, double upper) {
        int i = 0;
        
        while (i < temperatures.size()) {
            double temp = temperatures.get(i);
            boolean outOfRange = temp < lower || temp > upper;

            if (outOfRange) {
                temperatures.remove(i);
            }
            else {
                i++;
            }
        }
    }

    public int longestHeatWave(int threshold) {
        int longestStreak = 0;
        int currentStreak = 1;

        for (int i = 1; i < temperatures.size(); i++) {
            boolean yesterdayWasHot = temperatures.get(i - 1) > threshold;
            boolean todayIsHot = temperatures.get(i) > threshold;

            if (yesterdayWasHot && todayIsHot) {
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
