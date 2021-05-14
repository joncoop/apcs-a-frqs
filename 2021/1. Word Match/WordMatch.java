public class WordMatch
{
	private String secret;

	public WordMatch( String word )
	{
		this.secret = word;
	}

   public int scoreGuess(String guess)
   {
   	int count = 0;
      int gLen = guess.length();
      int sLen = secret.length();

      for (int i = 0; i < sLen - gLen; i++) {
         String chunk = secret.substring(i, i + gLen);

         if (guess.equals(chunk)) {
            count++;
         }
      }

      return count * gLen * gLen;
   }

   public String findBetterGuess( String guess1, String guess2 )
   {
   	int s1 = scoreGuess(guess1);
      int s2 = scoreGuess(guess2);

      if (s1 > s2) {
         return guess1;
      }
      else if (s2 > s1) {
         return guess2;
      }
      else if (guess1.compareTo(guess2) > 0) {
         return guess1;
      }
      else {
         return guess2;
      }
   }

}
