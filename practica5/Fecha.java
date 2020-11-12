/**
 * Paquete Práctica 5
 */
package practica5;

/**
 *
 * @author Resendiz Cruz Rodrigo Daniel
 */
class Fecha {
    private int dia;
    private int mes;
    private int anio;
    /**
     * constructor de fecha sobrecargado con su dia, mes y año
     * @param dia
     * @param mes
     * @param anio 
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * Getter que obtiene el dia de la fecha
     * @return dia
     */
    public int getDia() {
        return dia;
    }
    /**
     * Setter que establece un dia de la fecha
     * @param dia 
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * Getter que obtiene el mes de la fecha
     * @return mes
     */
    public int getMes() {
        return mes;
    }
    /**
     * Setter que establece un mes de la fecha
     * @param mes 
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * Getter que obtiene el año de la fecha
     * @return anio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Setter que obtiene el año de la fecha
     * @param anio 
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Regresa a donde se le solicita la fecha
     * @return Fecha
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }        
}
