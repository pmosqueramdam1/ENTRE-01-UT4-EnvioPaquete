
/**
 *  Un objeto de esta clase representa un envío de varios paquetes,
 *  máximo tres
 *  
 * 
 * @author - Pablo Mosquera  
 *  
 */
public class Envio
{
    private final double PRECIO_KILO = 2.2;  // precio coste envío Kg. en euros
    private Paquete paquete1;
    private Paquete paquete2;
    private Paquete paquete3;

    /**
     * Constructor  
     * Inicializa los paquetes a null (inicialmente
     * el envío no tiene paquetes)
     */
    public Envio()    {
        this.paquete1 = null;
        this.paquete2 = null;
        this.paquete3 = null;

    }

    /**
     * accesor para el paquete1
     */
    public Paquete getPaquete1() {
        return paquete1;

    }

    /**
     * accesor para el paquete2
     */
    public Paquete getPaquete2() {
        return paquete2;

    }

    /**
     * accesor para el paquete3
     */
    public Paquete getPaquete3() {
        return paquete3;

    }

    /**
     * Devuelve el nº de paquetes en el envío
     * (dependerá de cuántos paquetes estén a null)
     */
    public int getNumeroPaquetes() {
        int numeroPaquetes = 0;
        if (paquete1 != null) {
            numeroPaquetes++;
        }

        if (paquete2 != null) {
            numeroPaquetes++;
        }

        if (paquete3 != null) {
            numeroPaquetes++;
        }
        return numeroPaquetes;

    }

    /**
     * Devuelve true si el envío está completo, false en otro caso
     * (tiene exactamente 3 paquetes)
     */
    public boolean envioCompleto() {
        return getNumeroPaquetes() == 3;

    }

    /**
     * Se añade un nuevo paquete al envío
     * Si el envío está completo se muestra
     * el mensaje "No se admiten más paquetes en el envío"
     * Si no está completo se añade el paquete al envío teniendo en cuenta
     * si se añade como primero, segundo o tercero (no han de quedar huecos)
     */
    public void addPaquete(Paquete paquete) {
        if (paquete1 == null) {
            paquete1 = new Paquete();
        }
        else if(paquete2 == null) {
            paquete2 = new Paquete();
        }
        else {
            paquete3 = new Paquete();
        }
        
        if (paquete1 != null && paquete2 != null && paquete3 != null) {
            System.out.println("No se admiten más paquetes en el envío");
        }
        
    }
    
    /**
     * Calcula y devuelve el coste total del envío
     * 
     * Para calcular el coste:
     *      - se obtiene el peso facturable de cada paquete 
     *      - se suman los pesos facturables de todos los paquetes del envío
     *      - se calcula el coste en euros según el precio del Kg 
     *      (cada Kg. no completo se cobra entero, 5.8 Kg. se cobran como 6, 5.3 Kg. se cobran como 6)
     *     
     *  
     */
    public double calcularCosteTotalEnvio() {
        double peso1 = paquete1.calcularPesoFacturable();
        double peso2 = paquete2.calcularPesoFacturable();
        double peso3 = paquete3.calcularPesoFacturable();
        double pesoTotal = peso1 + peso2 + peso3;
        double coste = PRECIO_KILO * Math.ceil(pesoTotal);
        return coste;

    }

    /**
     * Representación textual del envío
     * con el formato exacto indicado
     * (leer enunciado)
     */
    public String toString() {
        String precio = "Coste total envío:";
        String numPaquetes = "Nº de paquetes:";
        String resul = "Nº de paquetes:" + getNumeroPaquetes() + "\n";
        resul += String.format("Descripción del paquete\n");
        resul += paquete1.toString();
        resul += String.format("Descripción del paquete\n");
        resul += paquete2.toString();
        resul += String.format("Descripción del paquete\n");
        resul += paquete3.toString();
        resul += String.format("     ");
        resul += String.format("%20s %10.2f\n", precio, calcularCosteTotalEnvio());
        return resul;
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Envio
     */
    public void print() {
        System.out.println(this.toString());
    }

}
