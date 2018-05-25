import java.util.ArrayList;

public class WordPairList
{
    private ArrayList<WordPair> allPairs;
    
    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        
        for (int i=0; i<words.length - 1; i++) {
            for (int j=i+1; j<words.length; j++) {
                String first = words[i];
                String second = words[j];
                WordPair pair = new WordPair(first, second);
                allPairs.add(pair);
            }
        }
    }
    
    public int numMatches() {
        int count = 0;
        
        for (WordPair pair: allPairs) {
            String first = pair.getFirst();
            String second = pair.getSecond();
            
            if (first.equals(second)) {
                count++;
            }
        }
        
        return count;
    }
    
    public String toString() {
        return allPairs.toString();
    }
}
