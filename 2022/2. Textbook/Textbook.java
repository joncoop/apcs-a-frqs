public class Textbook extends Book
{
    private int edition;

    public Textbook(String bookTitle, double bookPrice, int bookEdition)
    {
        super(bookTitle, bookPrice);
        edition = bookEdition;
    }

    public String getBookInfo() {
        return super.getBookInfo() + "-" + getEdition();
    }
    
    public boolean canSubstituteFor(Textbook other) {
        String t1 = this.getTitle();
        String t2 = other.getTitle();
        int e1 = this.edition;
        int e2 = other.edition;
        
        return t1.equals(t2) && e1 >= e2;
    }
}
