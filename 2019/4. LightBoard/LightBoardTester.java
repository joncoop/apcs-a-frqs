public class LightBoardTester
{
    public static void main(String[] args) {

        // a
        LightBoard sim = new LightBoard(7, 5);
        System.out.println(sim);

        // b
        boolean[][] statuses = {{true,  true,  false, true,  true},
                                {true,  false, false, true,  false},
                                {true,  false, false, true,  true},
                                {true,  false, false, false, true},
                                {true,  false, false, false, true},
                                {true,  true,  false, true,  true},
                                {false, false, false, false, false}};

        sim.setLights(statuses);
        System.out.println( sim.evaluateLight(0, 3) );
        System.out.println( sim.evaluateLight(6, 0) );
        System.out.println( sim.evaluateLight(4, 1) );
        System.out.println( sim.evaluateLight(5, 4) );
    }
}
