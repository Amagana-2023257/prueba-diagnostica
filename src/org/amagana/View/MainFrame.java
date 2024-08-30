package org.amagana.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.amagana.Model.Desarrollador;
import org.amagana.Model.Empleado;
import org.amagana.Model.Tester;
import org.amagana.Controller.DesarrolladorController;
import org.amagana.Controller.EmpleadoController;
import org.amagana.Controller.TesterController;

public class MainFrame extends JFrame {
    private JTextField nombreField;
    private JTextField edadField;
    private JTextField salarioField;
    private JTextField lenguajeField;
    private JTextField tipoPruebasField;
    private JTextField herramientaField;
    private JTextField proyectoField;
    private JComboBox<String> tipoEmpleadoBox;
    private JButton crearButton;

    public MainFrame() {
        setTitle("Crear Empleado");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 2));

        // Crear campos de texto y etiquetas
        add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        add(nombreField);

        add(new JLabel("Edad:"));
        edadField = new JTextField();
        add(edadField);

        add(new JLabel("Salario:"));
        salarioField = new JTextField();
        add(salarioField);

        add(new JLabel("Lenguaje de Programación (Desarrollador):"));
        lenguajeField = new JTextField();
        add(lenguajeField);

        add(new JLabel("Tipo de Pruebas (Tester):"));
        tipoPruebasField = new JTextField();
        add(tipoPruebasField);

        add(new JLabel("Herramienta (Tester):"));
        herramientaField = new JTextField();
        add(herramientaField);

        add(new JLabel("Proyecto (Tester):"));
        proyectoField = new JTextField();
        add(proyectoField);

        add(new JLabel("Tipo de Empleado:"));
        tipoEmpleadoBox = new JComboBox<>(new String[]{"Desarrollador", "Tester", "Empleado"});
        add(tipoEmpleadoBox);

        // Botón para crear el empleado
        crearButton = new JButton("Crear Empleado");
        add(crearButton);

        // Acción del botón
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearEmpleado();
            }
        });
    }

    private void crearEmpleado() {
        String nombre = nombreField.getText();
        int edad = Integer.parseInt(edadField.getText());
        double salario = Double.parseDouble(salarioField.getText());
        String lenguaje = lenguajeField.getText();
        String tipoPruebas = tipoPruebasField.getText();
        String herramienta = herramientaField.getText();
        String proyecto = proyectoField.getText();
        String tipoEmpleado = (String) tipoEmpleadoBox.getSelectedItem();

        // Crear instancias y controladores
        if ("Desarrollador".equals(tipoEmpleado)) {
            Desarrollador dev = new Desarrollador(lenguaje, nombre, edad, salario);
            DesarrolladorView devView = new DesarrolladorView(dev);
            DesarrolladorController devController = new DesarrolladorController(dev);
            devController.trabajar();
            devController.trabajar("Proyecto X");
            devView.mostrarInformacion();
        } else if ("Tester".equals(tipoEmpleado)) {
            Tester tester = new Tester(tipoPruebas, nombre, edad, salario);
            TesterView testerView = new TesterView(tester);
            TesterController testerController = new TesterController(tester);
            testerController.trabajar();
            testerController.trabajar(herramienta, proyecto);
            testerView.mostrarInformacion();
        } else if ("Empleado".equals(tipoEmpleado)) {
            Empleado emp = new Empleado(nombre, edad, salario) {
                @Override
                public void trabajar() {
                    System.out.println(getNombre() + " está trabajando en tareas generales.");
                }
            };
            EmpleadoView empView = new EmpleadoView(emp);
            EmpleadoController empController = new EmpleadoController(emp);
            empController.trabajar();
            empView.mostrarInformacion();
        }
    }
}
