public class WordChecker
{
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;

    /**
    * Returns true if each element of wordList (except the first) contains the previous
    * element as a substring and returns false otherwise, as described in part (a)
    * Precondition: wordList contains at least two elements.
    * Postcondition: wordList is unchanged.
    */
    public boolean isWordChain()
    {
        for (int i = 1; i < wordList.size(); i++) {
            String previous = wordList.get(i - 1);
            String current = wordList.get(i);

            if (current.indexOf(previous) == -1) {
                return false;
            }
        }

        return true;
    }

    /**
    * Returns an ArrayList<String> based on strings from wordList that start
    * with target, as described in part (b). Each element of the returned ArrayList has had
    * the initial occurrence of target removed.
    * Postconditions: wordList is unchanged.
    * Items appear in the returned list in the same order as they appear in wordList.
    */
    public ArrayList<String> createList(String target)
    {
        ArrayList<String> result = new ArrayList<String>();

        for (String word: wordList) {            
            if (word.indexOf(target) == 0) {
                String afterTarget = word.substring(target.length());
                result.add(afterTarget);
            }
        }

        return result;
    }
}