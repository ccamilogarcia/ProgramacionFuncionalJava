package org.TallerFuncional.Punto8;

public class Calculadora {

        private int resultado;

        public Calculadora(){
                this.resultado = 0;
        }


        public Calculadora multiplica ( int valor){
            this.resultado *= valor;
            System.out.println("Acumulado al multiplicar: " + resultado);
            return this;
        }

        public Calculadora suma ( int valor){
            this.resultado += valor;
            System.out.println("Acumulado al sumar: " + resultado);
            return this;
        }

        public Calculadora resta(int valor) {
            this.resultado -= valor;
            System.out.println("Acumulado al restar: " + resultado);
            return this;
        }

        public int obtenerResultado() {
            return this.resultado;
        }


    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoFinal = calculadora.suma(15)
                .resta(3)
                .multiplica(2)
                .obtenerResultado();

        System.out.println("Resultado final: " + resultadoFinal);
    }
}

