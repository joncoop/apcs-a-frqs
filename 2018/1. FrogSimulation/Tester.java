public class Tester {
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);        
        System.out.println(sim.simulate());
        
        double proportion = sim.runSimulations(400);
        System.out.println(proportion);
    }
}
