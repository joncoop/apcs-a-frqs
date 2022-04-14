import java.util.ArrayList;


/**
 * Write a description of class WordList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordList
{
    private ArrayList<String> myList;
    
    public WordList(ArrayList<String> myList) {
    	this.myList = myList;
    }
    
    public int numWordsOfLength(int len)
    {
        int count = 0;
        
        for (String w: myList)
        {
            if (w.length() == len)
            {
                count++;
            }
        }
        
        return count;
    }
    
    public void removeWordsOfLength(int len)
    {
        String word;
        
        for (int i = myList.size() - 1; i >= 0; i--)
        {
            word = myList.get(i);
            
            if (word.length() == len)
            {
                myList.remove(i);
            }
        }
    }
    
    public String toString() {
    	return myList.toString();
    }
}
