package practica5;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class aCirculo {
    static double PI = Math.PI;
    private double radio;
    private String color;

    public aCirculo() {
    }

    /**
     * Metodo publico circulo
     * @param radio Es de tipo double y asigna al atributo radio del circulo el valor que recive
     */
    public aCirculo(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo publico getRadio 
     * @return retorna el valor que se obtiene del radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Metodo detRadio
     * @param radio Es de tipo double y asigna al atribto radio un valor
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo publico toString
     * @return retorna los atribtos con sus valores del objeto
     */
    @Override
    public String toString() {
        return "aCirculo{" + "radio=" + radio + ", color=" + color + '}';
    }
    
    /**
     * Metodo publico perimetro
     * @return retorna el valor del perimetro del objeto circulo
     */
    public double perimetro(){
        return 2*PI*radio;
    }
    
    /**
     * Metodo publico area
     * @return retorna el valor del area del bjeto circulo
     */
    public double area(){
        return PI*radio*radio;
    }
}

