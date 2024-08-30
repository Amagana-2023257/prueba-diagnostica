package org.amagana.Model;

/**
 *
 * @author amagana
 */
public class Desarrollador extends Empleado {
    
    private String lenguajeProgramacion;

    public Desarrollador() {
    }

    public Desarrollador(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public Desarrollador(String lenguajeProgramacion, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está desarrollando en " + lenguajeProgramacion + ".");
    }

    // Sobrecarga del método trabajar
    public void trabajar(String proyecto) {
        System.out.println(getNombre() + " está desarrollando el proyecto " + proyecto + " en " + lenguajeProgramacion + ".");
    }
}
