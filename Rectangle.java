
/**
 * Décrivez votre classe Rectangle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Rectangle
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int width;
    private int height;

    /**
     * Constructeur d'objets de classe Rectangle
     */
    public Rectangle(int length, int high)
    {
        // initialisation des variables d'instance                
        width = length;
        height = high;
    }
    
    public void window()
    {
        System.out.println("width: " + width);
        System.out.println("height: " + height);
    }
}