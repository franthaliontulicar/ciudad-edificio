
/**
 * Write a description of class EdificioOficinas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EdificioOficinas extends Edificio
{
    // instance variables - replace the example below with your own
    private int nOficinas;

    /**
     * Constructor for objects of class EdificioOficinas
     */
    public EdificioOficinas(float superf, int oficinas)
    {
        // initialise instance variables
        super(superf);
        nOficinas= oficinas;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getOficinas()
    {
        // put your code here
        return nOficinas;
    }
}
