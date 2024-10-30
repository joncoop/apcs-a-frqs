public class FrogSimulation
{
    /** Distance, in inches, from the starting point to the goal. */
    private int goalDistance;
    
    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;
    
    /** Constructs a FrogSimulation where dist is the distance, in inches from 
     *  the starting postition to the goal, and numHops is the maximum number of 
     *  hops allowed to reach the goal.
     */
    public FrogSimulation(int dist, int numHops) {
        this.goalDistance = dist;
        this.maxHops = numHops;
    }
    
    /** Returns an integer representing the distance, in inches to be moved
     *  when the frog hops.
     */
    private int hopDistance() {
        /* No implementation is given, so I'm just returning a random number around
         * the range given in examples. In the examples, frogs also seem to go forward
         * more often (17 / 20 hops).
         */
        
        int dist = (int)(6 * Math.random() + 2);
        
        boolean reverse = Math.random() < 0.15;
        
        if (reverse) {
            dist *= -1;
        }
        
        return dist;
    }
    
    /** Simulates a frog attempting to reach the goal. The frog hops until one of 
     *  the following conditions becomes true:
     *  
     *     - The frog has reached or passed the goal.
     *     - The frog has reached a negative position.
     *     - The frog has taken the maximum number of hops without reaching the goal.
     *     
     *  Returns true if the frog successfully reaches the goal during the simulation;
     *          false otherwise.
     */
    public boolean simulate() {
        int hops = 0;
        int dist = 0;
        
        while (hops < maxHops && dist >= 0 && dist < goalDistance) {
            dist += hopDistance();
            hops += 1;
        }
        
        return dist >= goalDistance;
    }
    
    /** Runs num simulations and returns the proportion of simulations in which
     *  the frog successfully reached or passed the goal.
     */
    public double runSimulations(int num) {
        int count = 0;
        
        for (int i = 0; i  <num; i++) {
            boolean reachedGoal = simulate();
            
            if (reachedGoal) {
                count += 1;
            }
        }
        
        return (double) count /  num;
    }
}
