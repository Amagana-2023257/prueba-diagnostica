package org.amagana.View;

import javax.swing.JOptionPane;
import org.amagana.Controller.*;
import org.amagana.Model.*;

/**
 *
 * @author amagana
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        edadField = new javax.swing.JTextField();
        salarioField = new javax.swing.JTextField();
        lenguajeField = new javax.swing.JTextField();
        tipoPruebasField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        herramientaField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        proyectoField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tipoEmpleadoBox = new javax.swing.JComboBox<>();
        crearButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jLabel3.setText("Salario");

        jLabel4.setText("Lenguaje de Programacion");

        jLabel5.setText("Tipo de Pruebas (Tester):");

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        salarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Herramienta (Tester):");

        herramientaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                herramientaFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Proyecto (Tester):");

        proyectoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proyectoFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de Empleado:");

        tipoEmpleadoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desarrollador", "Tester", "Empleado" }));
        tipoEmpleadoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoEmpleadoBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proyectoField)
                    .addComponent(edadField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nombreField)
                    .addComponent(salarioField)
                    .addComponent(lenguajeField)
                    .addComponent(tipoPruebasField)
                    .addComponent(herramientaField)
                    .addComponent(tipoEmpleadoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lenguajeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoPruebasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(herramientaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proyectoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoEmpleadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        crearButton.setBackground(new java.awt.Color(153, 255, 255));
        crearButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        crearButton.setText("Crear Empleado");
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Prueba Diagnostiva POO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(crearButton)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void salarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioFieldActionPerformed

    private void herramientaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_herramientaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_herramientaFieldActionPerformed

    private void proyectoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proyectoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proyectoFieldActionPerformed

    private void tipoEmpleadoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoEmpleadoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoEmpleadoBoxActionPerformed

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed
        crearEmpleado();
    }//GEN-LAST:event_crearButtonActionPerformed


    private void crearEmpleado() {
        try {
            // Recoger datos del formulario
            String nombre = nombreField.getText();
            int edad = Integer.parseInt(edadField.getText());
            double salario = Double.parseDouble(salarioField.getText());
            String lenguaje = lenguajeField.getText();
            String tipoPruebas = tipoPruebasField.getText();
            String herramienta = herramientaField.getText();
            String proyecto = proyectoField.getText();
            String tipoEmpleado = (String) tipoEmpleadoBox.getSelectedItem();

            // Validar que los campos obligatorios no estén vacíos
            if (nombre.isEmpty() || tipoEmpleado == null) {
                throw new IllegalArgumentException("Todos los campos deben estar completos.");
            }

            // Crear instancias y controladores basados en el tipo de empleado
            if ("Desarrollador".equals(tipoEmpleado)) {
                if (lenguaje.isEmpty()) {
                    throw new IllegalArgumentException("El campo Lenguaje de Programación no puede estar vacío.");
                }
                Desarrollador dev = new Desarrollador(lenguaje, nombre, edad, salario);
                DesarrolladorView devView = new DesarrolladorView(dev);
         
                DesarrolladorController devController = new DesarrolladorController(dev);
                devController.trabajar();
                
                devController.trabajar("Proyecto X");
                devView.mostrarInformacion();
            } else if ("Tester".equals(tipoEmpleado)) {
                if (tipoPruebas.isEmpty() || herramienta.isEmpty() || proyecto.isEmpty()) {
                    throw new IllegalArgumentException("Todos los campos del Tester deben estar completos.");
                }
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
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos para edad y salario.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearButton;
    private javax.swing.JTextField edadField;
    private javax.swing.JTextField herramientaField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lenguajeField;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField proyectoField;
    private javax.swing.JTextField salarioField;
    private javax.swing.JComboBox<String> tipoEmpleadoBox;
    private javax.swing.JTextField tipoPruebasField;
    // End of variables declaration//GEN-END:variables
}
