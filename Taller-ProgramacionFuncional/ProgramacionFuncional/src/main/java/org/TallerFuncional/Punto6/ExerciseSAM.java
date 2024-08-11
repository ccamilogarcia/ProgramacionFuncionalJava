package org.TallerFuncional.Punto6;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;

public class ExerciseSAM {
    public static void main(String[] args) {
        ValidarFecha();
    }

    @FunctionalInterface
    interface Persona{
        String ValidarFecha(String nombre, int edad, LocalDate fechaDeNacimiento);
    }
    public static void ValidarFecha(){
        BiFunction<LocalDate, Integer, Boolean> validarAnios = (fechaDeNacimiento,edad) ->
                Period.between(fechaDeNacimiento,LocalDate.now()).getYears() == edad;

        Persona ValidarAniosPersona = (nombre, edad, fechaDeNacimiento) -> {
            boolean aniosValidos = validarAnios.apply(fechaDeNacimiento, edad);
            return "La fecha de nacimiento de " + nombre +
                    (aniosValidos ? " corresponde a la edad ingresada" : " no corresponde a la edad ingresada");
        };

        String persona1 = ValidarAniosPersona.ValidarFecha("cristian", 24, LocalDate.of(2000,8,1));
        String persona2 = ValidarAniosPersona.ValidarFecha("camilo", 15, LocalDate.of(2000,8,1));
        String persona3 = ValidarAniosPersona.ValidarFecha("paola", 24, LocalDate.of(2000,8,1));
        String persona4 = ValidarAniosPersona.ValidarFecha("jazmin", 14, LocalDate.of(2000,8,1));
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);
    }
}
