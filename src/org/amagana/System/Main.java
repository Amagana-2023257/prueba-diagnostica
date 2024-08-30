package org.amagana.System;

import org.amagana.Model.Desarrollador;
import org.amagana.Model.Tester;
import org.amagana.Controller.DesarrolladorController;
import org.amagana.Controller.TesterController;
import org.amagana.Controller.EmpleadoController;
import org.amagana.Model.Empleado;

public class Main {

    public static void main(String[] args) {
        // Crear instancias
        Desarrollador dev = new Desarrollador("Java", "Alice", 30, 60000);
        Tester tester = new Tester("Funcional", "Bob", 28, 50000);
        Empleado emp = new Empleado("Charlie", 40, 70000) {
            @Override
            public void trabajar() {
                System.out.println(getNombre() + " está trabajando en tareas generales.");
            }
        };

        // Usar controladores
        DesarrolladorController devController = new DesarrolladorController(dev);
        TesterController testerController = new TesterController(tester);
        EmpleadoController empController = new EmpleadoController(emp);

        devController.trabajar();
        devController.trabajar("Proyecto X");

        testerController.trabajar();
        testerController.trabajar("Selenium", "Proyecto Y");

        empController.trabajar();

        // Polimorfismo por sustitución
        Empleado e = new Desarrollador("Python", "David", 35, 65000);
        e.trabajar();
        e.trabajar(8);
    }
}
