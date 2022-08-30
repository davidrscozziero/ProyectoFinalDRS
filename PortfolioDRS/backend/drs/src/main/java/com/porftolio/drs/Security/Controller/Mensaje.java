
package com.porftolio.drs.Security.Controller;

/**
 *
 * @author david
 */
public class Mensaje {
    private String mensaje;
    

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    //Getter y Setter

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}