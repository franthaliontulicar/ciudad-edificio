
/**
 * Write a description of class CentroPrivado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CentroPrivado  implements CentroEducativo
{
    // instance variables - replace the example below with your own
        public final static  NivelEstudios NIVEL_ESTUDIOS = NivelEstudios.PRIMARIA;

    /**
     * Constructor for objects of class CentroPrivado
     */
    public CentroPrivado()
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
