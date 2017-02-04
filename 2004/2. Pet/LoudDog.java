
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoudDog extends Dog
{
    public LoudDog(String name)
    {
        super(name);
    }
    
    public String speak()
    {
        return super.speak() + " " + super.speak();
    }
}
