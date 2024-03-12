
/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje = "";

        Map<String, String> diccionarioHacker = new HashMap<>();
        diccionarioHacker.put("a","4");
        diccionarioHacker.put("b","I3");
        diccionarioHacker.put("c","[");
        diccionarioHacker.put("d",")");
        diccionarioHacker.put("e","3");
        diccionarioHacker.put("f","|=");
        diccionarioHacker.put("g","&");
        diccionarioHacker.put("h","#");
        diccionarioHacker.put("i","1");
        diccionarioHacker.put("j",",_|");
        diccionarioHacker.put("k",">|");
        diccionarioHacker.put("l","1");
        diccionarioHacker.put("m","^^");
        diccionarioHacker.put("n","^/");
        diccionarioHacker.put("o","0");
        diccionarioHacker.put("p","|*");
        diccionarioHacker.put("q","(_,)");
        diccionarioHacker.put("r","I2");
        diccionarioHacker.put("s","5");
        diccionarioHacker.put("t","7");
        diccionarioHacker.put("u","(_)");
        diccionarioHacker.put("v","|/");
        diccionarioHacker.put("w","vv");
        diccionarioHacker.put("x","><");
        diccionarioHacker.put("y","j");
        diccionarioHacker.put("z","2");
        diccionarioHacker.put(" ","_");

        System.out.println("Introduce un texto para formatear: ");
        mensaje = sc.nextLine();
        mensaje = mensaje.toLowerCase();

        String letra;
        StringBuilder mensajeHackeado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++){
            letra = mensaje.substring(i, i+1);

            if (diccionarioHacker.containsKey(letra)){
                letra = diccionarioHacker.getOrDefault(letra, "");
                mensajeHackeado.append(letra);
            }
        }

        System.out.println(mensajeHackeado);
    }
}
