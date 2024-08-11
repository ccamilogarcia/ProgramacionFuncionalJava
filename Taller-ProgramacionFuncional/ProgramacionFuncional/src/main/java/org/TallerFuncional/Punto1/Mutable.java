package org.TallerFuncional.Punto1;

import java.util.List;

public class Mutable {
    private String nombre;
    private int edad;
    private int cedula;
    private String pais;
    private List<String> hobbies;

    public Mutable(){

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

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Mutable{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", cedula=" + cedula +
                ", pais='" + pais + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
