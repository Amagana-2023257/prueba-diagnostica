package org.amagana.Model;

import org.amagana.Controller.IEmpleado;

/**
 *
 * @author amagana
 */
public class Desarollador extends Empleado{
    
    private String lenguajeProgramacion;

    public Desarollador() {
    }

    public Desarollador(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public Desarollador(String lenguajeProgramacion, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
  
    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
}
