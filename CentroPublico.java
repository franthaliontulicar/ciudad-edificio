
/**
 * Write a description of class CentroPublico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CentroPublico implements CentroEducativo
{
    // instance variables - replace the example below with your own
    public final static  NivelEstudios NIVEL_ESTUDIOS = NivelEstudios.SECUNDARIA;

    /**
     * Constructor for objects of class CentroPublico
     */
    public CentroPublico()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public NivelEstudios nivelEstudios()
    {
        // put your code here
        return NIVEL_ESTUDIOS;
    }
}
