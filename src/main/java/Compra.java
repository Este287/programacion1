/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TEFYTA
 */
public class Compra {
    private String nombre;
    private String precio;
    private String franquisia;
    private String Total;

    public Compra(String nombre, String precio, String franquisia, String Total) {
        this.nombre = nombre;
        this.precio = precio;
        this.franquisia = franquisia;
        this.Total = Total;
    }
    
    Compra(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFranquisia() {
        return franquisia;
    }

    public void setFranquisia(String franquisia) {
        this.franquisia = franquisia;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }
    
    
}
