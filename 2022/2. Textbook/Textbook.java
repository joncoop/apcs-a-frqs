public class Textbook extends Book
{
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
        return super.getBookInfo() + "-" + edition;
    }
    
    public boolean canSubstituteFor(Textbook other) {
        String t1 = this.getTitle();
        String t2 = other.getTitle();
        int e1 = this.getEdition();
        int e2 = other.getEdition();
        
        return t1.equals(t2) && e1 >= e2;
    }
}
