package controller;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio {
    public Ejercicio() {
        System.out.println("--------------------Ejercicio1-----------------");
        System.out.println(tieneDuplicados(new int[]{1,2,3,4,5}));
        System.out.println(tieneDuplicados(new int[]{1,2,3,4,5,4,3,2,45}));


        System.out.println("--------------------Ejercicio2-----------------");
        System.out.println("mursielago es idorgrama = " + esIsograma("murcielago"));
        System.out.println("camaleon es isograma = " + esIsograma("camaleon"));

        System.out.println("--------------------Ejercicio3-----------------");
        System.out.println("Palabra = " + contarPalabras("La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que" +
               "recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos,"+
                "sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?"+
                "Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana"+
                "personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente."+
                "En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas."));
    }
    public boolean tieneDuplicados(int[] numeros){
        Set<Integer> duplicados = new HashSet<>();
        for (int num : numeros){
            if (!duplicados.add(num))
                return true;
        }

        return false;
    }
    //Ejemplos:
    // murcielago -> true(es isograma)
    //camaleon -> false(repite 'a')

    public boolean esIsograma(String palabra){
        Set<Character> letras = new HashSet<>();
        for (char letra : palabra.toCharArray()){
            if (!letras.add(letra))
                return false;
        }
        return true;
    }

    public int contarPalabras(String frase){
        int contador = 0;
        Set<String> palabras = new HashSet<>();
        for (String palabra : frase.split(" ")){
            if (!palabras.add(palabra))
                contador++;

        }

        return contador;
    }
}
