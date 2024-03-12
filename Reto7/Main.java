import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Crea un programa que simule el comportamiento del sombrero seleccionador del
         * universo mágico de Harry Potter.
         * - De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
         * - Cada pregunta tendrá 4 respuestas posibles (también a selecciona una a través de terminal).
         * - En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que
         *   coloque al alumno en una de las 4 casas de Hogwarts (Gryffindor, Slytherin , Hufflepuff y Ravenclaw)
         * - Ten en cuenta los rasgos de cada casa para hacer las preguntas y crear el algoritmo seleccionador.
         *   Por ejemplo, en Slytherin se premia la ambición y la astucia.
         */

        Pregunta pregunta1 = new Pregunta("¿Cuál de estas cualidades valoras más en un amigo?",
                "1 - Valentia", "2 - Ambición", "3 - Lealtad", "4 - Inteligencia");

        Pregunta pregunta2 = new Pregunta("¿Qué tipo de animal te gustaría tener como mascota?",
                "1 - León", "2 - Serpiente", "3 - Tejón", "4 - Águila");

        Pregunta pregunta3 = new Pregunta("¿Qué lugar prefieres para pasar tus momentos de reflexión?",
                "1 - Un campo abierto", "2 - Una cueva oscura", "3 - Un jardín acogedor", "4 - Una biblioteca tranquila");

        Pregunta pregunta4 = new Pregunta("¿Qué tipo de desafío prefieres enfrentar?",
                "1 - Uno físico y emocionante", "2 - Uno estratégico y astuto",
                "3 - Uno que requiera paciencia y perseverancia", "4 - Uno que ponga a prueba tu intelecto y conocimiento");

        Pregunta pregunta5 = new Pregunta("¿Cuál es tu mayor objetivo en la vida?",
                "1 - Alcanzar la fama y el reconocimiento", "2 - Obtener poder y influencia",
                "3 - Construir relaciones sólidas y duraderas", "4 - Ampliar tus conocimientos y descubrir nuevas ideas");

        List<Pregunta> listaPreguntas = new ArrayList<>();
        listaPreguntas.add(pregunta1);
        listaPreguntas.add(pregunta2);
        listaPreguntas.add(pregunta3);
        listaPreguntas.add(pregunta4);
        listaPreguntas.add(pregunta5);

        Scanner input = new Scanner(System.in);
        String respuestaUser;
        List<Respuesta> respuestasUser = new ArrayList<>();

        int griffindor = 0;
        int slytherin  = 0;
        int hufflepuff  = 0;
        int ravenclaw  = 0;

        for (Pregunta pregunta : listaPreguntas){
            System.out.println("Reponde a la pregunta con el numero de la respuesta: \n");
            System.out.println(pregunta.getEnunciado());
            System.out.println(pregunta.getRespuesta1());
            System.out.println(pregunta.getRespuesta2());
            System.out.println(pregunta.getRespuesta3());
            System.out.println(pregunta.getRespuesta4());

            respuestaUser = input.nextLine();
            Respuesta respuesta;

            if (respuestaUser.equals("1")){
                respuesta = new Respuesta(pregunta.getRespuesta1(), "Griffindor");
                respuestasUser.add(respuesta);
            }

            if (respuestaUser.equals("2")){
                respuesta = new Respuesta(pregunta.getRespuesta2(), "Slytherin");
                respuestasUser.add(respuesta);
            }

            if (respuestaUser.equals("3")){
                respuesta = new Respuesta(pregunta.getRespuesta3(), "Hufflepuff");
                respuestasUser.add(respuesta);
            }

            if (respuestaUser.equals("4")){
                respuesta = new Respuesta(pregunta.getRespuesta4(), "Ravenclaw ");
                respuestasUser.add(respuesta);
            }
        }

        griffindor = checkGriffindor(respuestasUser, griffindor);
        slytherin = checkSlytherin(respuestasUser, slytherin);
        hufflepuff = checkHufflepuff(respuestasUser, hufflepuff);
        ravenclaw = checkRavenclaw(respuestasUser, ravenclaw);

        if (griffindor >= slytherin && griffindor >= hufflepuff && griffindor >= ravenclaw) System.out.println("Has sido seleccionado para la casa Griffindor");
        if (slytherin >= griffindor && slytherin >= hufflepuff && slytherin >= ravenclaw) System.out.println("Has sido seleccionado para la casa slytherin");
        if (hufflepuff >= griffindor && hufflepuff >= slytherin && hufflepuff >= ravenclaw) System.out.println("Has sido seleccionado para la casa hufflepuff");
        if (ravenclaw >= griffindor && ravenclaw >= slytherin && ravenclaw >= hufflepuff) System.out.println("Has sido seleccionado para la casa ravenclaw");
    }

    private static int checkSlytherin(List<Respuesta> respuestaUser, int slytherin){
        for (Respuesta respuesta : respuestaUser){
            if (respuesta.getCasa().equalsIgnoreCase("slytherin")) slytherin++;
        }
        return slytherin;
    }

    private static int checkGriffindor(List<Respuesta> respuestaUser, int griffindor){
        for (Respuesta respuesta : respuestaUser){
            if (respuesta.getCasa().equalsIgnoreCase("griffindor")) griffindor++;
        }
        return griffindor;
    }

    private static int checkHufflepuff(List<Respuesta> respuestaUser, int hufflepuff){
        for (Respuesta respuesta : respuestaUser){
            if (respuesta.getCasa().equalsIgnoreCase("hufflepuff")) hufflepuff++;
        }
        return hufflepuff;
    }

    private static int checkRavenclaw(List<Respuesta> respuestaUser, int ravenclaw){
        for (Respuesta respuesta : respuestaUser){
            if (respuesta.getCasa().equalsIgnoreCase("ravenclaw")) ravenclaw++;
        }
        return ravenclaw;
    }
}