public class StepTracker
{
    private int activeLimit;
    private int totalSteps = 0;
    private int totalDays = 0;
    private int activeDays = 0;

    /** Constructor for a StepTracker
     *
     * @param activeLimit  The minimum number of steps for a day to be considered active.
     */
    public StepTracker(int activeLimit) {
        this.activeLimit = activeLimit;
    }

    /** Accumulates information about steps, in readings taken once per day
     *  activeDays, which returns the number of active days
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
     *  total number of steps taken by the number of days tracked
     */
    public double averageSteps() {
        if (totalDays == 0) {
           return 0.0;
        }

        return (double) totalSteps / totalDays;
    }
}
