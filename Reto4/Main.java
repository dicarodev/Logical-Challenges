import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
         * Podrás configurar generar contraseñas con los siguientes parámetros:
         * - Longitud: Entre 8 y 16.
         * - Con o sin letras mayúsculas.
         * - Con o sin números.
         * - Con o sin símbolos.
         * (Pudiendo combinar todos estos parámetros entre ellos)
         */

        System.out.println("""
                Bienvenido al generador de contraseñas!!\s
                Vamos a generar tu contraseña (8-16 caracteres)
                """);

        Random random = new Random();
        int lenghtPass = random.nextInt(8,17);
        boolean isUperCase = false;
        boolean isNumbers = true;
        boolean isSymbols = true;

        String password = PasswordGenerator.generatePassword(lenghtPass, isUperCase, isNumbers, isSymbols);
        System.out.println("Contraseña generada -> " + password);

    }

}