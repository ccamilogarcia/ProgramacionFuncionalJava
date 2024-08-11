package org.TallerFuncional.Punto5;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class ExerciceBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<BigDecimal> division = (x,y) -> x.divide(y);

        BigDecimal divisor = new BigDecimal("16");
        BigDecimal dividendo = new BigDecimal("2");
        BigDecimal calcular = division.apply(divisor,dividendo);

        System.out.println(divisor +"/" + dividendo+" =  "+calcular);
    }
}
