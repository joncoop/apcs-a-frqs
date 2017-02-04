import java.util.ArrayList;
import java.util.List;

public class FuelDepotTester {

	public static void main(String[] args) {

		FuelRobot robot = new RealFueler(2, true);
		
		List<FuelTank> tanks = new ArrayList<FuelTank>();
		tanks.add(new RealTank(20));
		tanks.add(new RealTank(30));
		tanks.add(new RealTank(80));
		tanks.add(new RealTank(55));
		tanks.add(new RealTank(50));
		tanks.add(new RealTank(75));
		tanks.add(new RealTank(20));

		FuelDepot depot = new FuelDepot(robot, tanks);
		
		System.out.println(depot.nextTankToFill(50));
		System.out.println(depot.nextTankToFill(15));
		
		depot.moveToLocation(3);
		System.out.println(robot.getCurrentIndex() + " " + robot.isFacingRight());
		depot.moveToLocation(6);
		System.out.println(robot.getCurrentIndex() + " " + robot.isFacingRight());
		depot.moveToLocation(1);
		System.out.println(robot.getCurrentIndex() + " " + robot.isFacingRight());
		
	}

}
