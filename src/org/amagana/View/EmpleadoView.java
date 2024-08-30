package org.amagana.View;

import org.amagana.Model.Empleado;

public class EmpleadoView {
    private Empleado emp;

    public EmpleadoView(Empleado emp) {
        this.emp = emp;
    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + emp.getNombre() + ", Edad: " + emp.getEdad() + ", Salario: " + emp.getSalario());
    }
}
