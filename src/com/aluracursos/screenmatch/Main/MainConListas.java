package com.aluracursos.screenmatch.Main;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.jar.JarOutputStream;

public class MainConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("zEncanto",2021);
        miPelicula.evalua(8.1);
        Pelicula otraPelicula = new Pelicula("Encanto2", 2022);
        otraPelicula.evalua(7.4);
        Pelicula peliculaDeBruno = new Pelicula("Encanto3",2023);
        peliculaDeBruno.evalua(9.0);

        Serie lost = new Serie("Lost",2000);






        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add((miPelicula));
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        for(Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Pelicula pelicula) {
                System.out.println(pelicula.getClasificacion());
            }
        }


        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Bruno Banderas");
        listaDeArtistas.add("Andrea Cruz");
        listaDeArtistas.add("Darío Darin");
        listaDeArtistas.forEach(System.out::println);
        System.out.println("lista de artista no ordenada: "+listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println(listaDeArtistas);
        System.out.println("lista de artista ordenada: "+listaDeArtistas);

        Collections.sort(lista);
        System.out.println("lista de titulos ordenada: "+lista);


        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista ordenada por fechar: "+lista);

    }
}
