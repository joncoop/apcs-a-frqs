public class TicketTester
{
    public static void main(String[] toBeOrNotToBe)
    {
        // make a ticket of each type
        Walkup w = new Walkup();
        Advance a1 = new Advance(3);
        Advance a2 = new Advance(12);
        StudentAdvance s1 = new StudentAdvance(3);
        StudentAdvance s2 = new StudentAdvance(12);
        
        // print each ticket to make sure it works
        System.out.println(w  + "\n");
        System.out.println(a1 + "\n");
        System.out.println(a2 + "\n");
        System.out.println(s1 + "\n");
        System.out.println(s2 + "\n");
        
    }
}
