import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
         * Ejemplos:
         * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
         * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
         */

        System.out.println("Introduce un número para comprobar si es par, primo y fibonacci: ");
        Scanner entrada = new Scanner(System.in);

        int numEntrada = entrada.nextInt();


        if(isEven(numEntrada)){
            System.out.print("Es par, ");
        }else {
            System.out.print("No es par, ");
        }
        if(isPrime(numEntrada)){
            System.out.print("es primo, ");
        }else {
            System.out.print("no es primo, ");
        }
        if(isFibonacci(numEntrada)){
            System.out.print("y fibonacci.");
        }else {
            System.out.print("y no es fibonacci.");
        }

    }

    public static boolean isEven(int numero){
        return numero % 2 == 0;
    }

    public static boolean isPrime(int numero){
        for(int i = 2; i < numero - 1; i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    // Cada numero en la secuencia es igual a la suma de los anteriores
    public static boolean isFibonacci(int numero){
        int a = 0;
        int b = 1;

        if(numero == 0) return true;

        while(b <= numero){
            int temp = a + b;

            if(temp == numero)return true;

            a = b;
            b = temp;
        }
        return false;
    }
}