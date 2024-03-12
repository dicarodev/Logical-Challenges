public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
         * Crea un generador de números pseudoaleatorios entre 0 y 100.
         * - No puedes usar ninguna función "random" (o semejante) del lenguaje de programación seleccionado.
         *
         * Es más complicado de lo que parece...
         */

        int amountRandomNumbers = 50;

        for (int i = 0; i < amountRandomNumbers; i++) {
            int r = random();
            Thread.sleep(r);
        }
    }
    public static int random() {
        long currentTimeMillis = System.currentTimeMillis();
        int randomNumber = (int) (currentTimeMillis % 101);
        System.out.println("Número r -> " + randomNumber);
        return randomNumber;
    }
}