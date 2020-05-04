import java.util.ArrayList;

public class StepTracker
{
    private int totalSteps;
    private int totalDays;
    private int activeDays;
    private int activeLimit;

    public StepTracker(int activeLimit) {
        this.totalSteps = 0;
        this.totalDays = 0;
        this.activeDays = 0;
        this.activeLimit = activeLimit;
    }

    /** Accumulates information about steps, in readings taken once per day
        activeDays, which returns the number of active days
     */
    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays += 1;

        if (steps >= activeLimit) {
            activeDays += 1;
        }
    }

    /** Returns the number of active days
     */
    public int activeDays() {
        return activeDays;
    }

    /** Returns the average number of steps per day, calculated by dividing the
        total number of steps taken by the number of days tracked
     */
    public double averageSteps() {
        if (totalDays == 0 ) {
           return 0.0;
        }

        return (double)totalSteps / totalDays;
    }
}
