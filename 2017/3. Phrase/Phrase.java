public class Phrase {

    private String currentPhrase;
    
    public Phrase(String p)
    {
        this.currentPhrase = p;
    }

    public int findNthOccurrence(String str, int n)
    {
        int count = 0;
        int loc = currentPhrase.indexOf(str);

        while(loc > -1) {
            count++;
            
            if (count == n) {
                return loc;
            }
            
            loc = currentPhrase.indexOf(str, loc + 1);
        }
        
        return -1;
    }
    
    public void replaceNthOccurrence(String str, int n, String repl) {
         
        int start = findNthOccurrence(str, n);
        
        if (start > -1) {
            int end = start + str.length();
            String before = currentPhrase.substring(0, start);
            String after = currentPhrase.substring(end);
             
            currentPhrase = before + repl + after;
        }
    }
    
    public int findLastOccurrence(String str) {
        //return currentPhrase.lastIndexOf(str);
        
        int last = -1;
        int n = 1;
        
        int loc = findNthOccurrence(str, n);
        
        while (loc > last) {         
            last = loc;
            n++;
            
            loc = findNthOccurrence(str, n);
        }
        
        return last;
    }
    
    public String toString() {
        return currentPhrase;
    }
}
