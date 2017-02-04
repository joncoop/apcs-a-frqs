
public class HorseBarnTester {

	public static void main(String[] args) {

		Horse trigger = new Clydesdale("Trigger", 1340);
		Horse silver = new Arabian("Silver", 1210);
		Horse lady = new Clydesdale("Lady", 1575);
		Horse patches = new Clydesdale("Patches", 1350);
		Horse duke = new Arabian("Duke", 1410);
		
		HorseBarn sweetHome = new HorseBarn(7);
		sweetHome.putHorseInSpace(0, trigger);
		sweetHome.putHorseInSpace(2, silver);
		sweetHome.putHorseInSpace(3, lady);
		sweetHome.putHorseInSpace(5, patches);
		sweetHome.putHorseInSpace(6, duke);
		
		System.out.println(sweetHome);
		System.out.println();
		
		System.out.println( sweetHome.findHorseSpace("Trigger"));
		System.out.println( sweetHome.findHorseSpace("Silver"));
		System.out.println( sweetHome.findHorseSpace("Coco"));
		System.out.println();
		
		sweetHome.removeHorse("Lady");
		
		sweetHome.consolidate();
		System.out.println(sweetHome);
	}

}
