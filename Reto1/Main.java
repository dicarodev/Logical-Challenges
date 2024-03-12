

/*Escribe un programa que muestre por consola (con un print) los
        * números de 1 a 100 (ambos incluidos y con un salto de línea entre
        * cada impresión), sustituyendo los siguientes:
        * - Múltiplos de 3 por la palabra "fizz".
        * - Múltiplos de 5 por la palabra "buzz".
        * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz"*/

public class Main {
    public static void main(String[] args) {
        final int FIN = 100;

        for (int i = 1; i <= FIN; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0 ) {
                System.out.println("BUZZ");
            }else{
                System.out.println(i);
            }
        }
    }
}
