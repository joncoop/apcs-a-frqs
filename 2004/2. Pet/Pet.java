
/**
 * Abstract class Pet - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Pet
{
    private String myName;
    
    public Pet(String name)
    {
       myName = name; 
    }
    
    public String getName()
    {
        return myName;
    }
    
    public abstract String speak();
}
