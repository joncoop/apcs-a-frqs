public class Question1_Runner
{
	public static void main(String[] args)
   {
		WordMatch w = new WordMatch( "mississippi" );
		System.out.println( w.scoreGuess("i"));  //4
		System.out.println( w.scoreGuess("iss"));  //18
		System.out.println( w.scoreGuess("issipp")); //36
		System.out.println( w.scoreGuess("mississippi"));  //121
  
		w = new WordMatch( "aaaabb" );
		System.out.println( w.scoreGuess("a"));  //4
		System.out.println( w.scoreGuess("aa"));  //12
		System.out.println( w.scoreGuess("aaa")); //18
		System.out.println( w.scoreGuess("aabb"));  //16
		System.out.println( w.scoreGuess("c"));  //0
		
		w = new WordMatch("concatenation");
		System.out.println( w.scoreGuess("ten"));  //9
		System.out.println( w.scoreGuess("nation"));  //36
		System.out.println( w.findBetterGuess("ten","nation"));  //nation
		
		System.out.println( w.scoreGuess("con"));  //9	
		System.out.println( w.scoreGuess("cat"));  //9	
		System.out.println( w.findBetterGuess("con","cat"));  //cont
		
		w = new WordMatch("apluscompsci.com");
		System.out.println( w.scoreGuess("s"));  //2
		System.out.println( w.scoreGuess("sc"));  //8
		System.out.println( w.findBetterGuess("com","compsci"));  //compsci		
	}
}