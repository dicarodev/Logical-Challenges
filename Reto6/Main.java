import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    static int player1 = 0;
    static int player2 = 0;

    public static void main(String[] args) {
        /*
         * Crea un programa que calcule quien gana más partidas al piedra,
         * papel, tijera, lagarto, spock.
         * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
         * - La función recibe un listado que contiene pares, representando cada jugada.
         * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
         *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
         * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
         * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
         */

        /*Las tijeras cortan el papel,
        el papel envuelve la piedra,
        la piedra aplasta al lagarto,
        el lagarto envenena a Spock,
        Spock aplasta las tijeras,
        las tijeras decapitan al lagarto,
        el lagarto devora el papel,
        el papel desaprueba a Spock,
        Spock desintegra la piedra y, como siempre, la piedra aplasta las tijeras.*/

        String [] posibilidades = {"piedra", "papel", "tijera", "lagarto", "spoke"};

        List<String[]> partida = generarPares(posibilidades);

        for (String[] par : partida){
            System.out.println(Arrays.toString(par));
            comprobarPlayer1(par);
            comprobarPlayer2(par);
        }

        if (player1 > player2){
            System.out.println("\n Gana Player 1");
        } else if (player1 < player2) {
            System.out.println("\n Gana Player 2");
        }else {
            System.out.println("\n Empate");
        }
    }

    private static List<String[]> generarPares(String [] posibilidades){
        Random random = new Random();
        List<String[]> listaPares = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            String [] par = {posibilidades[random.nextInt(posibilidades.length)], posibilidades[random.nextInt(posibilidades.length)]};
            listaPares.add(par);
        }

        return listaPares;
    }

    private static void comprobarPlayer1(String[] par){
        if(par[0].equalsIgnoreCase("tijera") && par[1].equalsIgnoreCase("papel")) player1++;
        if(par[0].equalsIgnoreCase("papel") && par[1].equalsIgnoreCase("piedra")) player1++;
        if(par[0].equalsIgnoreCase("piedra") && par[1].equalsIgnoreCase("lagarto")) player1++;
        if(par[0].equalsIgnoreCase("lagarto") && par[1].equalsIgnoreCase("spoke")) player1++;
        if(par[0].equalsIgnoreCase("spoke") && par[1].equalsIgnoreCase("tijeras")) player1++;
        if(par[0].equalsIgnoreCase("tijeras") && par[1].equalsIgnoreCase("lagarto")) player1++;
        if(par[0].equalsIgnoreCase("lagarto") && par[1].equalsIgnoreCase("papel")) player1++;
        if(par[0].equalsIgnoreCase("papel") && par[1].equalsIgnoreCase("spoke")) player1++;
        if(par[0].equalsIgnoreCase("spoke") && par[1].equalsIgnoreCase("piedra")) player1++;
        if(par[0].equalsIgnoreCase("piedra") && par[1].equalsIgnoreCase("tijeras")) player1++;
    }

    private static void comprobarPlayer2(String[] par){
        if(par[0].equalsIgnoreCase("papel") && par[1].equalsIgnoreCase("tijera")) player2++;
        if(par[0].equalsIgnoreCase("piedra") && par[1].equalsIgnoreCase("papel")) player2++;
        if(par[0].equalsIgnoreCase("lagarto") && par[1].equalsIgnoreCase("piedra")) player2++;
        if(par[0].equalsIgnoreCase("spoke") && par[1].equalsIgnoreCase("lagarto")) player2++;
        if(par[0].equalsIgnoreCase("tijeras") && par[1].equalsIgnoreCase("spoke")) player2++;
        if(par[0].equalsIgnoreCase("lagarto") && par[1].equalsIgnoreCase("tijeras")) player2++;
        if(par[0].equalsIgnoreCase("papel") && par[1].equalsIgnoreCase("lagarto")) player2++;
        if(par[0].equalsIgnoreCase("spoke") && par[1].equalsIgnoreCase("papel")) player2++;
        if(par[0].equalsIgnoreCase("piedra") && par[1].equalsIgnoreCase("spoke")) player2++;
        if(par[0].equalsIgnoreCase("tijeras") && par[1].equalsIgnoreCase("piedra")) player2++;
    }
}