package org.amagana.View;

import org.amagana.Model.Desarrollador;

public class DesarrolladorView {
    private Desarrollador dev;

    public DesarrolladorView(Desarrollador dev) {
        this.dev = dev;
    }

    public void mostrarInformacion() {
        System.out.println("Desarrollador: " + dev.getNombre() + ", Lenguaje: " + dev.getLenguajeProgramacion());
    }
}
