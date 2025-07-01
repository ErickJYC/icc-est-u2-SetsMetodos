package controller;

import java.util.*;

public class Sets {

    public Sets(){

    }

    public Set<String> construirHastSet(){
        Set<String> palabras = new HashSet<String>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        return palabras;
    }

    public Set<String> construirLinkedHashSet(){
        Set<String> palabrasLinkeadas = new LinkedHashSet<String>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Laptop");
        return palabrasLinkeadas;

    }

    public Set<String> construisTreeSet(){
        Set<String> miTreeSet = new TreeSet<String>();
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        return miTreeSet;


    }

    public  Set<String> construirTreeSetConComparador(){

        // Crear un comparator
        Comparator<String> comparatorLongitud = new  Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Primero comparamos la longitud
                int resultado = Integer.compare(s1.length(), s2.length());
                // Si tienen la misma longitud, comparamos alfabeticamente
                if (resultado == 0){
                    return s1.compareTo(s2);
                }
                return resultado;
            }
        };

        Set<String> miTreeSet = new TreeSet<>(comparatorLongitud);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");
        return miTreeSet ;

    }
    public Set<String> construirTreeSetConComparadorAlfabeticamente(){
        // Crear un comparator
        Comparator<String> comparatorLongitud = new  Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Primero comparamos la longitud
                int resultado = Integer.compare(s2.length(), s1.length());
                // Si tienen la misma longitud, comparamos alfabeticamente
                if (resultado == 0){
                    return s2.compareTo(s1);
                }
                return resultado;
            }
        };

        Set<String> miTreeSet = new TreeSet<>(comparatorLongitud);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");
        return miTreeSet ;
    }
}
