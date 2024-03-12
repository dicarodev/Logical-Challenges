import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Crea 3 funciones, cada una encargada de detectar si una cadena de
         * texto es un heterograma, un isograma o un pangrama.
         * - Debes buscar la definición de cada uno de estos términos.
         * Heterograma -> Un heterograma es una palabra o frase que no contiene ninguna letra repetida
         * Isograma -> es una palabra o frase en la que cada letra aparece el mismo número de veces
         * Pangrama -> es una frase en la que aparecen todas las letras del abecedario
         */

        System.out.println("Introduce el texto a comprobar");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        if (isHeterograma(texto)) {
            System.out.println(texto + ". Es un Heterograma.");
        } else {
            System.out.println(texto + ". No es un Heterograma.");
        }

        if (isIsograma(texto)) {
            System.out.println(texto + ". Es un Isograma.");
        } else {
            System.out.println(texto + ". No es un Isograma.");
        }
    }

    public static boolean isHeterograma(String texto){
        Set<Character> letras  = new HashSet<>();

        for(int i = 0; i < texto.length(); i ++){
            if (!letras.add(texto.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean isIsograma(String texto){
        Map<Character, Integer> letras = new HashMap();
        int order = 0;

        for(int i = 0; i < texto.length(); i ++){
            letras.put(texto.charAt(i), letras.getOrDefault(texto.charAt(i), 0)+1);
        }

        for(Integer valor : letras.values()){
            if (order == 0){
                order = valor;
            }
            if (order != valor) return false;
        }

        return true;
    }

    public static boolean isHeterograma(StringBuilder texto) {

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);
            texto.deleteCharAt(i);

            for (int j = 0; j < texto.length(); j++) {
                if (letra == texto.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

}