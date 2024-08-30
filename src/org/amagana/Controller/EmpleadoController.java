package org.amagana.Controller;

import org.amagana.Model.Empleado;

/**
 *
 * @author amagana
 */
public class EmpleadoController implements IEmpleado {

    private Empleado empleado;

    public EmpleadoController(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public void trabajar() {
        empleado.trabajar();
    }
}
