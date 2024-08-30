package org.amagana.Controller;

import org.amagana.Model.Desarollador;

/**
 *
 * @author amagana
 */
public class DesarolladorController implements IEmpleado {

    @Override
    public void trabajar() {
        Desarollador d =  new Desarollador();
        System.out.println(d.getNombre() + " está desarrollando en " + d.getLenguajeProgramacion() + ".");
    }
    
    public void trabajar(String herramienta, String proyecto) {
        Desarollador d =  new Desarollador();
        System.out.println(d.getNombre() + " está utilizando la herramienta " + herramienta + " para probar el proyecto " + proyecto + ".");
    }

    
}
