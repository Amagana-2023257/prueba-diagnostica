package org.amagana.Controller;

import org.amagana.Model.Empleado;

/**
 *
 * @author amagana
 */
public class EmpleadoController implements IEmpleado{

    @Override
    public void trabajar() {
        Empleado e = new Empleado();
        System.out.println(e.getNombre() + " está desarrollando código en " + ".");
    }
    
}
