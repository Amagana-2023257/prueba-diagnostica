package org.amagana.Controller;

import org.amagana.Model.Tester;

/**
 *
 * @author amagana
 */
public class TesterController implements IEmpleado {

    private Tester tester;

    public TesterController(Tester tester) {
        this.tester = tester;
    }

    @Override
    public void trabajar() {
        tester.trabajar();
    }

    public void trabajar(String herramienta, String proyecto) {
        tester.trabajar(herramienta, proyecto);
    }
}
