public class Question3_Runner
{
	public static void main(String[] args)
   {
   	MemberInfo a = new MemberInfo( "BOB", 2019, false );
   	System.out.println( a );
   	MemberInfo b = new MemberInfo( "APLUS", 2020, true );
   	
   	String[] names = "JANE STEVE MICHAEL MARIA".split(" ");
   	ClubMembers cm = new ClubMembers();
   	cm.addMembers( names, 2015 );
   	cm.addMember( a );
   	cm.addMember( b );
   	System.out.println( cm );
   	
   	System.out.println( cm.removeMembers( 2017 ) ); 
     	System.out.println( cm ); 		  		
	}
}

/*
BOB 2019 false
[JANE 2015 true, STEVE 2015 true, MICHAEL 2015 true, MARIA 2015 true, BOB 2019 false, APLUS 2020 true]
[MARIA 2015 true, MICHAEL 2015 true, STEVE 2015 true, JANE 2015 true]
[BOB 2019 false, APLUS 2020 true]
*/