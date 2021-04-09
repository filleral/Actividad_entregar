/*
 *Este modelo es para pruebas unitarias y de testeo
 */
package models;

/**
 *@version 1.0
 * @author fille
 * @since 8 abril 2021
 * @deprecated 
 */
public class producto {

    /**
     *
     * @param cantidad
     * @param costo
     * @return
     */
    public int calcularcosto(int cantidad,int costo){
    int valor =0;
    valor = cantidad * costo;
    return valor; 
    
}
    
    /**
     *
     * @param valor
     * @param desc
     * @return
     */
    public int descuento(int valor, int desc){
    int  descuento = valor - desc;
    return descuento;    
}
    
}