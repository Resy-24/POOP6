/**
 * Paquete Practica 5
 */
package practica5;

/**
 *
 * @author Resendiz Cruz Rodrigo Daniel
 */
public class Circulo {
    static double PI = Math.PI;
    private double radio;
    private String color;
    /**
     * Constructor de objeto circulo
     */
    public Circulo() {
    }
    /**
     * Constructor de objeto circulo sobrecargado con su radio
     * @param radio 
     */
    public Circulo(double radio) {
        this.radio = radio;
    }
    /**
     * Obtiene el radio del objeto circulo
     * 
     */
    public double getRadio() {
        return radio;
    }
    /**
     * Establece el radio del objeto circulo
     * @param radio 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * Regresa a donde se le solicita la informacion del circulo
     * 
     */
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + "color="+ color +'}';
    }  
    /**
     * Obtiene el perimetro del circulo
     * 
     */
    public double perimetro(){
        return 2*PI*radio;
    }
    /**
     * Obtiene el area del circulo
     * 
     */
    public double area(){
        return PI*radio*radio;
    }
}
