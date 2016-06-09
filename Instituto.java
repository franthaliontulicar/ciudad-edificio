
/**
 * Write a description of class Instituto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instituto extends Edificio implements CentroEducativo
{
    // instance variables - replace the example below with your own
    private int numAlum;
    public final static  NivelEstudios NIVEL_ESTUDIOS = NivelEstudios.SECUNDARIA;

    /**
     * Constructor for objects of class Instituto
     */
    public Instituto(float superf, int alum)
    {
        // initialise instance variables
        super(superf);
        numAlum = alum;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getAlumnos()
    {
        // put your code here
        return numAlum;
    }
    
    public NivelEstudios nivelEstudios(){
        return NIVEL_ESTUDIOS;
    }
}
