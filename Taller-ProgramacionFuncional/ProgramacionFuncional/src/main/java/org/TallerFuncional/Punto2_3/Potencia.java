package org.TallerFuncional.Punto2_3;

import org.TallerFuncional.Punto1.Inmutable;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Potencia {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> calcularPotencia = (numero, exponente) -> (int) Math.pow(numero, exponente);

        int operacionPotencia = calcularPotencia.apply(5,3);
        System.out.println("===========Segundo punto==============");
        System.out.println("El resultado es: " + operacionPotencia);
        System.out.println("=========================");
        System.out.println("===========Tercer Punto==============");

        Predicate<Integer> esPar = x -> x % 2 == 0;
        Boolean rtaEsPar = esPar.test(operacionPotencia);
        System.out.println("El resultado de la potencia es par? : " + rtaEsPar);
        System.out.println("=========================");
    }
}
