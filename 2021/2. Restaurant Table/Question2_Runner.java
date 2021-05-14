public class Question2_Runner
{
	public static void main(String[] args)
   {
   	SingleTable ann = new SingleTable(4, 74, 60);
   	SingleTable bob = new SingleTable( 8, 74, 70);
   	SingleTable fred = new SingleTable( 12, 76, 75 );
		CombinedTable ct = new CombinedTable( ann, bob );
		System.out.println( ct.canSeat( 9) );  //true
		System.out.println( ct.canSeat( 11 ));  //false
		System.out.println( ct.getDesirability() );  //65.0
		
		ct = new CombinedTable( bob, fred );
		System.out.println( ct.canSeat( 18) );  //true
		System.out.println( ct.getDesirability() );  //62.5
		bob.setViewQuality( 80 );
		System.out.println( ct.getDesirability() );  //67.5		
	}
}