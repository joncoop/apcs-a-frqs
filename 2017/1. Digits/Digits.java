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
        int m, n;
        
        for (int i=0; i<digitList.size() - 1; i++) {
            m = digitList.get(i);
            n = digitList.get(i + 1);
            
            if (m >= n) {
                return false;
            }
        }
        
        return true;
    }
    
    public String toString() {
        return "Digits: " + digitList;
    }
}
