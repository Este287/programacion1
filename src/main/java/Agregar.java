/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TEFYTA
 */
public class Agregar {
    private String Nombre;
    private String Descripcion;
    private String Precio;
    private String Existencia;
    private String Franquisia;

    public Agregar(String Nombre, String Descripcion, String Precio, String Existencia, String Franquisia) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Existencia = Existencia;
        this.Franquisia = Franquisia;
    }
    
   Agregar(){
   
   }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getExistencia() {
        return Existencia;
    }

    public void setExistencia(String Existencia) {
        this.Existencia = Existencia;
    }

    public String getFranquisia() {
        return Franquisia;
    }

    public void setFranquisia(String Franquisia) {
        this.Franquisia = Franquisia;
    }
   
}
