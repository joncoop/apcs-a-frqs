
public class CodeWordChecker implements StringChecker
{
    private int min = 6;
    private int max = 20;
    private String nope;
    
    public CodeWordChecker(String nope) {
        this.nope = nope;
    }
    
    public CodeWordChecker(int min, int max, String nope) {
        this.min = min;
        this.max = max;
        this.nope = nope;
    }
    
    public boolean isValid(String str) {
       int len = str.length();
       
       return len >= min && len <= max && !str.contains(nope);
    }
}
