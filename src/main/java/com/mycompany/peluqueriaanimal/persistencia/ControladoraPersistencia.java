
package com.mycompany.peluqueriaanimal.persistencia;

import com.mycompany.peluqueriaanimal.logica.Dueno;
import com.mycompany.peluqueriaanimal.logica.Mascota;


public class ControladoraPersistencia {
    DuenoJpaController duenoJpa = new DuenoJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Dueno dueno, Mascota masco) {
        //Crear en la BD dueño y mascota.
        duenoJpa.create(dueno);
        mascotaJpa.create(masco);
        
    }
}
