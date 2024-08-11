package org.TallerFuncional.Punto1;

import java.util.LinkedList;
import java.util.List;

public final class Inmutable {
    private String nombre;
    private int edad;
    private int cedula;
    private String pais;
    private final List<String> hobbies;

    public Inmutable(String nombre, int edad, int cedula, String pais, List<String> hobbies) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.pais = pais;
        this.hobbies = hobbies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public final List<String> getHobbies() {
        return new LinkedList<>(hobbies);
    }

    @Override
    public String toString() {
        return "Inmutable{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", cedula=" + cedula +
                ", pais='" + pais + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
