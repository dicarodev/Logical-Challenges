import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
         * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
         * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
         * gane cada punto del juego.
         *
         * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
         * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
         *   15 - Love
         *   30 - Love
         *   30 - 15
         *   30 - 30
         *   40 - 30
         *   Deuce
         *   Ventaja P1
         *   Ha ganado el P1
         * - Si quieres, puedes controlar errores en la entrada de datos.
         * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.
         */

        final String P1 = "P1";
        final String P2 = "P2";

        Map<Integer, String > defaultGame = new HashMap<>();
        defaultGame.put(0, "Love");
        defaultGame.put(1, "15");
        defaultGame.put(2, "30");
        defaultGame.put(3, "40");
        defaultGame.put(4, "Deuce");
        defaultGame.put(5, "Advantage");
        defaultGame.put(6, "Ha ganado el");

        String [] game = {P1, P1, P2, P2, P1, P2, P1, P1, P2};

        play(game, defaultGame);
        //System.out.println(play(game, defaultGame));
    }

    public static void play(String [] game, Map<Integer, String> defaultGame){
        int player1 = 0;
        int player2 = 0;

        StringBuilder gameResult = new StringBuilder();
        String deuce = "";
        String avP1 = "";
        String avP2 = "";

        for (int i = 0; i < game.length ; i++){
            String player = game[i];
            if (player.equalsIgnoreCase("P1")){
                player1++;
            }else {
                player2++;
            }

            if (defaultGame.get(player1).equalsIgnoreCase("40") && defaultGame.get(player2).equalsIgnoreCase("40")){
                deuce = "Deuce";
                //gameResult.append("Deuce\n");
                System.out.println("Deuce");
            } else if (deuce.equalsIgnoreCase("Deuce")) {
                deuce = "";
                if (player1 - player2 == 1){
                    avP1 = "Adventage P1";
                    System.out.println("Adventage P1");
                }else if(player2 - player1 == 1){
                    avP2 = "Adventage P2";
                    System.out.println("Adventage P2");
                }
            } else if (avP1.equalsIgnoreCase("Adventage P1")) {
                avP1 = "";
                System.out.println("Win P1");
            }
            else if (avP2.equalsIgnoreCase("Adventage P2")) {
                avP2 = "";
                System.out.println("Win P2");
            }else {
                //gameResult.append(defaultGame.get(player1) + " - " + defaultGame.get(player2) + "\n");
                System.out.println(defaultGame.get(player1) + " - " + defaultGame.get(player2));
            }
        }

        //return gameResult.toString();
    }

}