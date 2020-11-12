package practica5;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class dCarro {
   private String color;
   private float precio;
   private String modelo;
   private String placa;
    public dCarro() {
    }
    
    /**
     * Constructor que recibe 4 parametros
     * @param color es de tipo string y contiene el color de nuestro carro
     * @param precio es de tipo float y contiene el precio de nuestro carro
     * @param modelo es de tipo string y contiene el modelo de nuestro carro
     * @param placa es de tipo string y contiene la placa de nuestro carro
     */
    public dCarro(String color, float precio, String modelo, String placa) {
        this.color = color;
        this.precio = precio;
        this.modelo = modelo;
        this.placa = placa;
    }
    
    /**
     * metodo getColor
     * @return retorna el color de nuestro carro
     */
    public String getColor() {
        return color;
    }
    
    /**
     * metodo setColor
     * @param color es de tipo string y contiene el color d enuestro carro.
     * 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * metodo getPrecio
     * @return retorna el valor del precio de nuestro carro
     */
    public float getPrecio() {
        return precio;
    }
    
    /**
     * metodo setPrecio
     * @param precio es de tipo float y contiene el valor del precio de nuestro carro
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    /**
     * metodo getModelo
     * @return retorna el valor de la variable modelo de nuestro carro
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * metodo setModelo
     * @param modelo es ed tipo string y contiene el modelo de nuestro carro
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * metodo getPlaca
     * @return retorna el valor de la variable placa de uestro carro
     */
    public String getPlaca() {
        return placa;
    }
    
    /**
     * metodo setPlava
     * @param placa es de tipo string y contiene el valor de la placa de nuestro carro
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    /**
     * toString
     * @return retorna las variables con sus respectivos valores de nuestro crro
     */
    @Override
    public String toString() {
        return "dCarro{" + "color=" + color + ", precio=" + precio + ", modelo=" + modelo + ", placa=" + placa + '}';
    }
}
