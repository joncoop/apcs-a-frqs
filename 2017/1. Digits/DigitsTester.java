public class DigitsTester {
    
    public static void main(String[] args) {
        Digits d1 = new Digits(15704);
        Digits d2 = new Digits(0);

        System.out.println(d1);
        System.out.println(d2);
        
        Digits d3 = new Digits(7);
        Digits d4 = new Digits(1356);
        Digits d5 = new Digits(1336);
        Digits d6 = new Digits(1536);
        Digits d7 = new Digits(65310);
        
        System.out.println(d3.isStrictlyIncreasing());
        System.out.println(d4.isStrictlyIncreasing());
        System.out.println(d5.isStrictlyIncreasing());
        System.out.println(d6.isStrictlyIncreasing());
        System.out.println(d7.isStrictlyIncreasing());
    }

}
