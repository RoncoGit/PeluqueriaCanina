
package com.mycompany.peluqueriaanimal.logica;

import com.mycompany.peluqueriaanimal.persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String alergico, String atEspecial, String observaciones, String nombreDueno, String celular) {
        Dueno dueno = new Dueno();
        //Creamos el dueño y asignamos valores.
        dueno.setNombre(nombreDueno);
        dueno.setCelDueno(celular);
        
        //Creamos la mascota y asignamos valores.
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atEspecial);
        masco.setUnDueno(dueno);
        
        controlPersis.guardar(dueno, masco);
    }
}
