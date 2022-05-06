import java.util.ArrayList;

public class ReviewAnalysis
{
   private Review[] allReviews;
   
   public ReviewAnalysis() {
       
   }
   
   public double getAverageRating() {
       double total = 0.0;
       
       for (Review r: allReviews) {
           total += r.getRating();
       }
       
       return total / allReviews.length;
   }
   
   public ArrayList<String> collectComments() {
       ArrayList<String> comments = new ArrayList<String>();
       int n = 0;
       
       for (Review r: allReviews) {
           String c = r.getComment();
           
           if (c.indexOf("!") != -1) {
               comments.add(n + "-" + c);
               n++;
           }
       }
       
       return comments;
   }
}
