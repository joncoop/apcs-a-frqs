import java.util.ArrayList;

public class DelimitersTester
{

    public static void main(String[] args) {

        // a
        Delimiters del1= new Delimiters("(", ")");
        String[] tokens1 =  {"(", "x + y", ")", "* 5"};
        System.out.println( del1.getDelimitersList(tokens1) );

        Delimiters del2 = new Delimiters("<q>", "</q>");
        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        System.out.println( del2.getDelimitersList(tokens2) );

        // b
        Delimiters del3 = new Delimiters("<sup>", "</sup>");

        ArrayList<String> delList1 = new ArrayList<String>();
        delList1.add("<sup>");
        delList1.add("<sup>");
        delList1.add("</sup>");
        delList1.add("<sup>");
        delList1.add("</sup>");
        delList1.add("</sup>");
        System.out.println( del3.isBalanced(delList1) );

        ArrayList<String> delList2 = new ArrayList<String>();
        delList2.add("<sup>");
        delList2.add("</sup>");
        delList2.add("</sup>");
        delList2.add("</sup>");
        System.out.println( del3.isBalanced(delList2) );

        ArrayList<String> delList3 = new ArrayList<String>();

        delList3.add("</sup>");
        System.out.println( del3.isBalanced(delList3) );

        ArrayList<String> delList4 = new ArrayList<String>();
        delList4.add("<sup>");
        delList4.add("<sup>");
        delList4.add("</sup>");
        System.out.println( del3.isBalanced(delList4) );
    }
}
