package org.TallerFuncional.Punto1;

import java.util.LinkedList;
import java.util.List;

public class MainPunto1 {
    public static void main(String[] args) {
        List<String> crisHobbies = new LinkedList<>();
        crisHobbies.add("Jugar Fifa");

        Mutable cris = new Mutable();
        cris.setHobbies(crisHobbies);
        cris.setNombre("cristian");
        cris.setPais("colombia");
        cris.setPais("USA");

        System.out.println("----------Clase Mutable----------");
        System.out.println(cris);
        infoExtra(cris);
        System.out.println(cris);
        infoExtraHobbies(cris);
        System.out.println(cris);
        System.out.println("----------------------------");

        String nombre = "Camilo";
        String pais = "Suiza";
        List<String> hobbies = new LinkedList<>();
        hobbies.add("Programar");

        Inmutable camilo = new Inmutable(nombre,24,1234567,pais,hobbies);
        System.out.println("----------Clase inmutable----------");
        System.out.println(camilo);
        modificarInmutable(camilo);
        System.out.println(camilo);
        System.out.println("----------------------------");
    }
    static void infoExtra(Mutable user){
        List<String> hobbies = new LinkedList<>();
        hobbies.add("Caminar");
        user.setHobbies(hobbies);
        user.setPais("Italia");
    }

    static void infoExtraHobbies(Mutable user){
        List<String> spamHobbies = new LinkedList<>();
        spamHobbies.add("Trotar");
        spamHobbies.add("Ir a cine");
        spamHobbies.add("Hacer ejercicio");
        user.setPais("Colombia");
        user.setHobbies(spamHobbies);

    }


    static void modificarInmutable(Inmutable user) {
        List<String> hobbies = user.getHobbies();
        hobbies.clear();
        hobbies.add("Viajar");
    }
}
