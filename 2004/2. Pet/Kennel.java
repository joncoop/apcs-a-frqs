
/**
 * Write a description of class Kennel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Kennel
{
    private ArrayList<Pet> petList;
    
    public Kennel(ArrayList<Pet> petList)
    {
        this.petList = petList;
    }
    
    public void allSpeak()
    {
        for (Pet p : petList)
        {
            System.out.println(p.getName() + ": " + p.speak());
        }
        
    }
}
