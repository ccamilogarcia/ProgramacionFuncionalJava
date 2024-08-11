package org.TallerFuncional.Punto7;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Operator {
    public static void main(String[] args) {
        List<LocalDate> fecha = Arrays.asList(
                LocalDate.of(2000,8,1),
                LocalDate.of(2000,9,9),
                LocalDate.of(2024,8,7),
                LocalDate.of(2018,7,18)
        );

        fecha.forEach(Operator::imprimirFecha);
    }

    public static void imprimirFecha(LocalDate fecha){
        System.out.println("La fecha es:" +
                fecha.getDayOfMonth() +
                " de " + fecha.getMonth() +
                " del " + fecha.getYear());
    }
}
