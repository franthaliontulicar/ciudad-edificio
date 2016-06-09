
/**
 * Write a description of class Colegio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Colegio extends Edificio implements CentroEducativo
{
    // instance variables - replace the example below with your own
    private int numProfe;
    public final static  NivelEstudios NIVEL_ESTUDIOS = NivelEstudios.PRIMARIA;
   
    /**
     * Constructor for objects of class Colegio
     */
    public Colegio(float superf, int profe)
    {
        // initialise instance variables
        super(superf);
        numProfe = profe;
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getNumProfesores()
    {
        // put your code here
        return numProfe;
    }
    
    public NivelEstudios nivelEstudios(){
        return NIVEL_ESTUDIOS;
    }
    
}
