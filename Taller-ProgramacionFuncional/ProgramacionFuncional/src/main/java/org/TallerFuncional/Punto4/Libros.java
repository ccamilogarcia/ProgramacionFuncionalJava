package org.TallerFuncional.Punto4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Libros {
    private String nombre;
    private String autor;
    private int puntaje;

    public Libros(String nombre, String autor, int puntaje) {
        this.nombre = nombre;
        this.autor = autor;
        this.puntaje = puntaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public static void listarLibros(){
        Supplier<List<Libros>> listaLibros = () -> {
            List<Libros> libros = new ArrayList<>();
            libros.add(new Libros("El diario de ana frank","Ana frank", 5));
            libros.add(new Libros("La chica del tren","Paula Hawkins",8));
            libros.add(new Libros("El psicoanalista","John Katzenbach", 8));
            libros.add(new Libros("De mi para mi, la tormenta pasará","Chriss Braund", 9));
            libros.add(new Libros("viaje al centro e la tierra","Jules Verne", 3));
            return libros;
        };

        Consumer<List<Libros>> obtenerRecomendados = libros -> {
            Predicate<Libros>  recomendarLibro = libro -> libro.getPuntaje() >= 7;
            UnaryOperator<Libros> recomendar = libro -> {
                if (recomendarLibro.test(libro)){
                    System.out.println("Libro recomendado -> " + libro.getNombre() +
                            " | calificación: " + libro.getPuntaje());
                }
                return libro;
            };
            libros.replaceAll(recomendar);
        };
        List<Libros> libros = listaLibros.get();
        obtenerRecomendados.accept(libros);
    }
}
