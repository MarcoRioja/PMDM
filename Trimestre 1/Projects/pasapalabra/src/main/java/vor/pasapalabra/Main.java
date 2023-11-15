package vor.pasapalabra;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<PLetter> roulette = null;

        // Ruleta de Videojuegos //
        ArrayList<PLetter> gameQuestionsRoulette = new ArrayList<PLetter>();
        gameQuestionsRoulette.add(new PLetter('a',"Multijugador online en el que hay que encontrar a un impostor","Among us"));
        gameQuestionsRoulette.add(new PLetter('b',"Enemigo típico de la Saga de Mario","Bowser"));
        gameQuestionsRoulette.add(new PLetter('c',"Compañia de Videojuegos conocida por juegos como Street Fighter","Capcom"));
        gameQuestionsRoulette.add(new PLetter('d',"Nombre del musculoso dueño de Gold Saucer en Final Fantasy VII","Dio"));
        gameQuestionsRoulette.add(new PLetter('e',"Nombre del personaje de Tekken que pelea bailando capoeira","Eddy"));
        gameQuestionsRoulette.add(new PLetter('f',"Nombre del estudio que desarrollo los Dark Souls","From Software"));
        gameQuestionsRoulette.add(new PLetter('g',"Saga de conduccion y conduccion muy conocida","Grand Theft Auto"));
        gameQuestionsRoulette.add(new PLetter('h',"Simulador de granjas que lleva ya mas de 20 años","Harvest Moon"));
        gameQuestionsRoulette.add(new PLetter('i',"Juego de PS2 en el que el protagonista nace con cuernos","ICO"));
        gameQuestionsRoulette.add(new PLetter('j',"Nombre de la evolucion de Eevee usando la piedra Trueno","Jolteon"));
        gameQuestionsRoulette.add(new PLetter('k',"Apellido del genial creador de la saga Metal Gear","Kojima"));
        gameQuestionsRoulette.add(new PLetter('l',"Nombre de la arqueologa mas audaz de los videojuegos","Lara Croft"));
        gameQuestionsRoulette.add(new PLetter('m',"Subgenero de accion y plataformas 2D con escenarios no lineales","Metroidvania"));
        gameQuestionsRoulette.add(new PLetter('n',"Serie de juegos de Nintendo DS en los que tienes que cuidar de cachorros","Nintendogs"));
        gameQuestionsRoulette.add(new PLetter('o',"Juego protagonizado por un lobo que destaca por un estilo grafico que recuerda a la pintura japonesa sumie","Okami"));
        gameQuestionsRoulette.add(new PLetter('p',"Juego para movil que hizo salir a millones de personas a la calle","Pokemon Go"));
        gameQuestionsRoulette.add(new PLetter('q',"Nombre del sucesor espiritual de Doom con graficos en verdadero 3D para escenarios y personajes","Quake"));
        gameQuestionsRoulette.add(new PLetter('r',"Empresa desarrolladora del famoso juego LoL","Riot Games"));
        gameQuestionsRoulette.add(new PLetter('s',"Empresa creadora del Erizo Sonic","Sega"));
        gameQuestionsRoulette.add(new PLetter('t',"Nombre del juego ruso mas vendido de la historia","Tetris"));
        gameQuestionsRoulette.add(new PLetter('u',"Empresa desarrolladora de la famosa saga Assasins Creed","Ubisoft"));
        gameQuestionsRoulette.add(new PLetter('v',"Unico personaje vampirico jugable de la famosa saga Final Fantasy","Vincent Valentine"));
        gameQuestionsRoulette.add(new PLetter('w',"Primer juego 3D creado por Eevee Software","Wolfenstein"));
        gameQuestionsRoulette.add(new PLetter('x',"Saga JRPG cuyo mundo se situa sobre los cuerpos de 2 titanes","Xenoblade Chronicles"));
        gameQuestionsRoulette.add(new PLetter('y',"Apellido del principal diseñador de la GameBoy","Yokoi"));
        gameQuestionsRoulette.add(new PLetter('z',"Safa de RPG que recibe su nombre de la princesa del juego","Zelda"));


        while (roulette == null) {
            System.out.println("Elige Ruleta:");
            System.out.println("1 - Ruleta de Videojuegos");

            if (sc.nextByte() == 1) {roulette = gameQuestionsRoulette;}
            else {System.out.println("\n- Ruleta no Disponible -\n");}
        }

        Game game = new Game(roulette);
        game.start();
    }

}