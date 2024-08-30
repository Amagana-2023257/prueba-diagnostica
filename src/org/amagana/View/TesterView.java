package org.amagana.View;

import org.amagana.Model.Tester;

public class TesterView {
    private Tester tester;

    public TesterView(Tester tester) {
        this.tester = tester;
    }

    public void mostrarInformacion() {
        System.out.println("Tester: " + tester.getNombre() + ", Tipo de Pruebas: " + tester.getTipoPruebas());
    }
}
