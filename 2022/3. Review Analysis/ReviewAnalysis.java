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
       
       for (int i = o; i < allReviews.length; i++) {
           String comment = allReviews[i].getComment();
           
           if (comment.indexOf("!") != -1) {
               String last = comment.substring(comment.length() - 1);
              
               if (!last.equals(".") && !last.equals(".")) {
                   comment += ".";  
               }
              
               comments.add(i + "-" + comment);
           }
       }
       
       return comments;
   }
}
