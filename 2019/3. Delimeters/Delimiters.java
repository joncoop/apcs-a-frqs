import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters. */
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close
     *  is the close delimiter.
     *  Precondition: open and close are non-empty strings.
     */

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in
      * part (a).
      */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> result  = new ArrayList<String>();

        for (String t: tokens) {
            if (t.equals(openDel) || t.equals(closeDel)) {
                result.add(t);
            }
        }

        return result;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described
     *  in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        int numOpen = 0;

        for (String d: delimiters) {
            if (d.equals(openDel)) {
                numOpen += 1;
            }
            else if (d.equals(closeDel)) {
              numOpen -= 1;
            }

            if (numOpen < 0) {
                return false;
            }
        }

        return numOpen == 0;
    }

}
