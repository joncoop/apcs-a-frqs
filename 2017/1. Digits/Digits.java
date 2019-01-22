import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<Integer>();

        if (num == 0) {
            digitList.add(0);    
        }
        
        while (num > 0) {
            digitList.add(0, num % 10);
            num /= 10;
        }
    }

    public boolean isStrictlyIncreasing() {
        int prev = -1;
        
        for (int d: digitList) {
            if (d <= prev) {
                return false;
            }
            
            prev = d;
        }
        
        return true;
    }
    
    public String toString() {
        return "Digits: " + digitList;
    }
}
