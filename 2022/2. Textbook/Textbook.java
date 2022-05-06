public class Textbook extends Book
{
    // instance variables - replace the example below with your own
    private int edition;

    public Textbook(String bookTitle, double bookPrice, int bookEdition)
    {
        super(bookTitle, bookPrice);
        edition = bookEdition;
    }
    
    public int getEdition() {
        return edition;
    }

    public String getBookInfo() {
        return super.getBookInfo() + "-" + getEdition();
    }
    
    public boolean canSubstituteFor(Textbook other) {
        String t1 = this.getTitle();
        String t2 = other.getTitle();
        int e1 = this.getEdition();
        int e2 = other.getEdition();
        
        return t1.equals(t2) && e1 >= e2;
    }
}
