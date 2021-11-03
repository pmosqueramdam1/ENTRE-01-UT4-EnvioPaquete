
/**
 *  Representa una dimensión
 *  
 *  @author - Pablo Mosquera
 */
public class Dimension  
{
    private double alto;
    private double ancho;
    private double largo;

    /**
     * constructor  
     */
    public Dimension(double alto, double ancho, double largo)    {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;

    }   

    /**
     * accesor para  el alto
     */
    public double getAlto()    {
        return alto;
    }

    /**
     * accesor para  el ancho
     */
    public double getAncho()    {
        return ancho;
    }

    /**
     * accesor para  el largo
     */
    public double getLargo()    {
        return largo;
    }

    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension obtenerCopia() {
        return new Dimension(this.alto, this.ancho, this.largo);

    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        String altura = "Alto: ";
        String anchura = "Ancho: ";
        String largura = "Largo: ";
        String resul ="";
        resul += String.format("%20s %10.2f(cm)\n", altura, alto);
        resul += String.format("%20s %10.2f(cm)\n", anchura, ancho);
        resul += String.format("%20s %10.2f(cm)\n", largura, largo);
        return resul;
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Dimension
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
