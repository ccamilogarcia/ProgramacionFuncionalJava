package org.TallerFuncional.Punto9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PuntoFinal {
    public static void main(String[] args) {
        ListaNombres();

    }
        public static void ListaNombres() {
            List<Optional<String>> listar = Arrays.asList(
                    Optional.of("cristian"),
                    Optional.empty(),
                    Optional.of("paola"),
                    Optional.empty(),
                    Optional.of("andrea"),
                    Optional.empty(),
                    Optional.of("cristian"),
                    Optional.empty(),
                    Optional.of("juan"),
                    Optional.empty(),
                    Optional.of("oscar")
            );


            listar.stream()
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .forEach(System.out::println);
        }
    }

