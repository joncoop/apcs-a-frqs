public class Feeder
{
    /**
    * The amount of food, in grams, currently in the bird feeder; initialized in the constructor and
    * always greater than or equal to zero
    */
    private int currentFood;

    /**
    * Simulates one day with numBirds birds or possibly a bear at the bird feeder,
    * as described in part (a)
    * Precondition: numBirds > 0
    */
    public void simulateOneDay(int numBirds)
    {
        double bearGetsFood = Math.random() < 0.05;

        if (bearGetsFood) {
            currentFood = 0;
        }
        else {
            int amountEatenByEachBird = (int)(41 * Math.random() + 10);
            currentFood -= numBirds * amountEatenByEachBird;

            if (currentFood < 0) {
                currentFood = 0;
            }
        }
    }

    /**
    * Returns the number of days birds or a bear found food to eat at the feeder in this simulation,
    * as described in part (b)
    * Preconditions: numBirds > 0, numDays > 0
    */
    public int simulateManyDays(int numBirds, int numDays)
    {
        int daysWithFood = 0;

        while (currentFood > 0 && daysWithFood < numDays) {
            simulateOneDay(numBirds);
            daysWithFood++;
        }

        return daysWithFood;
    }
}