package practica5;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
class cfecha {
    private int dia;
    private int mes;
    private int año;

    public cfecha() {
    }
    
    /**
     * Constructor que recibe 3 parametros
     * @param dia tiene el día de nacimiento de nuestra persona
     * @param mes tiene el mes de nacimiento de nuestra persona
     * @param año tiene el año de nacimiento de nuestra persona
     */
    public cfecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    /**
     * metodo getDia
     * @return retorna el dia de nacimiento de nuetra persona
     */
    public int getDia() {
        return dia;
    }
    
    /**
     * metodo setDia 
     * @param dia es de tipo entero y contiene el dia de nacimiento de unestra persona
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    /**
     * metodo getMes
     * @return retorna el mes de nacimiento de nuetra persona
     */
    public int getMes() {
        return mes;
    }
    
    /**
     * metodo setMes
     * @param mes es de tipo entero y contiene el mes de nacimiento de unestra persona
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    /**
     * metodo getAño
     * @return retorna el año de nacimiento de nuetra persona
     */
    public int getAño() {
        return año;
    }
    
    /**
     * metodo setAño
     * @param año es de tipo entero y contiene el año de nacimiento de unestra persona
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Metodo toString
     * @return retorna las variables y sus respectivos valores que contienen en pantalla
     */
    @Override
    public String toString() {
        return "cfecha{" + "dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + '}';
    }
}
