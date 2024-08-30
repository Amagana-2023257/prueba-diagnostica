package org.amagana.Controller;

import org.amagana.Model.Desarrollador;

/**
 *
 * @author amagana
 */
public class DesarrolladorController implements IEmpleado {

    private Desarrollador desarrollador;

    public DesarrolladorController(Desarrollador desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public void trabajar() {
        desarrollador.trabajar();
    }

    public void trabajar(String proyecto) {
        desarrollador.trabajar(proyecto);
    }
}
