import Difficulties.Amateur;
import Difficulties.Begginer;
import Difficulties.Normal;
import Difficulties.Professional;
import Teams.*;

import java.util.Scanner;

public class Menu {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RED = "\u001B[31m";
    Scanner scanner = new Scanner(System.in);
    ManUnited manUnited = new ManUnited(ANSI_RED + "Manchester United" + "\033[39m" + "\033[49m");
    Psg psg = new Psg(ANSI_BLUE + "Paris Saint-German" + "\033[39m" + "\033[49m");
    RealMadrid realMadrid = new RealMadrid(ANSI_WHITE + "Real Madrid" + "\033[39m" + "\033[49m");
    Porto fcPorto = new Porto(ANSI_CYAN + "F.C.Porto" + "\033[39m" + "\033[49m");
    Stadium stadiumM = Stadium.STADIUM1;
    Stadium stadiumP = Stadium.STADIUM2;
    Stadium stadiumR = Stadium.STADIUM3;
    Stadium stadiumF = Stadium.STADIUM4;
    Team cpu = new Team();
    Team player1 = new Team();
    Team player2 = new Team();
    PrintTeam printTeam = new PrintTeam();
    Begginer begginer = new Begginer();
    Amateur amateur = new Amateur();
    Normal normal = new Normal();
    Professional professional = new Professional();
    Multiplayer multiplayer = new Multiplayer();
    Bets bets = new Bets();

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public Menu(String menu) throws InterruptedException {
        int menuprin = 1;
        int randomint;
        int choiceTeam1;
        int choiceTeam2;
        int gameMode;
        int player;
        int statusMenu = 0;
        int level;

        manUnited.manUnited();
        psg.psg();
        realMadrid.realMadrid();
        fcPorto.porto();

        switch (menuprin) {
            case 1:
                System.out.println();
                System.out.println(ANSI_YELLOW + "\n" +
                        "               ███╗   ███╗██╗███╗   ██╗██████╗ ███████╗██████╗  █████╗                            \n" +
                        "               ████╗ ████║██║████╗  ██║██╔══██╗██╔════╝██╔══██╗██╔══██╗                           \n" +
                        "               ██╔████╔██║██║██╔██╗ ██║██║  ██║█████╗  ██████╔╝███████║                           \n" +
                        "               ██║╚██╔╝██║██║██║╚██╗██║██║  ██║██╔══╝  ██╔══██╗██╔══██║                           \n" +
                        "               ██║ ╚═╝ ██║██║██║ ╚████║██████╔╝███████╗██║  ██║██║  ██║                           \n" +
                        "               ╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚═════╝ ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝                           \n" + "\033[39m" + "\033[49m" +
                        "                                                                                   \n" + ANSI_GREEN +
                        "                               ███████╗ ██████╗  ██████╗ ████████╗██████╗  █████╗ ██╗     ██╗     \n" +
                        "                               ██╔════╝██╔═══██╗██╔═══██╗╚══██╔══╝██╔══██╗██╔══██╗██║     ██║     \n" +
                        "                               █████╗  ██║   ██║██║   ██║   ██║   ██████╔╝███████║██║     ██║     \n" +
                        "                               ██╔══╝  ██║   ██║██║   ██║   ██║   ██╔══██╗██╔══██║██║     ██║     \n" +
                        "                               ██║     ╚██████╔╝╚██████╔╝   ██║   ██████╔╝██║  ██║███████╗███████╗\n" +
                        "                               ╚═╝      ╚═════╝  ╚═════╝    ╚═╝   ╚═════╝ ╚═╝  ╚═╝╚══════╝╚══════╝\n" +
                        "                                                                                   " + "\033[39m" + "\033[49m");


                System.out.println("\n" + ANSI_YELLOW +
                        "                                        ██████╗  ██████╗ ██████╗ ██████╗ \n" +
                        "                                        ╚════██╗██╔═████╗╚════██╗╚════██╗\n" +
                        "                                         █████╔╝██║██╔██║ █████╔╝ █████╔╝\n" +
                        "                                        ██╔═══╝ ████╔╝██║██╔═══╝ ██╔═══╝ \n" +
                        "                                        ███████╗╚██████╔╝███████╗███████╗\n" +
                        "                                        ╚══════╝ ╚═════╝ ╚══════╝╚══════╝\n" + "\033[39m" + "\033[49m" +
                        "                                 \n");
                System.out.println();
                for (int i = 0; i <= 50; i++) {
                    System.out.print("\t\t\t\t\t\t\t\t  [");
                    for (int k = 0; k < i; k++) {
                        System.out.print("#");
                    }
                    for (int j = 50; j > i; j--) {
                        System.out.print("-");
                    }
                    System.out.print("] " + (i + i) + "% ");
                    Thread.sleep(30);
                    System.out.print("\r");
                }
                Thread.sleep(500);
                System.out.print("\t\t\t\t\t\t\t\t\t\t  [PRESS ENTER ] ");
                System.out.println("\n\n\n\n");
                scanner.nextLine();
                break;
        }
        do {

            clearScreen();
            System.out.println("\n" +
                    "\t\t\t\t\t\t\t  " + ANSI_YELLOW + "  ╔╦╗╦╔╗╔╔╦╗╔═╗╦═╗╔═╗" + "\033[39m" + "\033[49m" + ANSI_GREEN + "  ╔═╗╔═╗╔═╗╔╦╗╔╗ ╔═╗╦  ╦   " + "\033[39m" + "\033[49m" + "\n" +
                    "\t\t\t\t\t\t\t  " + ANSI_YELLOW + "  ║║║║║║║ ║║║╣ ╠╦╝╠═╣" + "\033[39m" + "\033[49m" + ANSI_GREEN + "  ╠╣ ║ ║║ ║ ║ ╠╩╗╠═╣║  ║   " + "\033[39m" + "\033[49m" + "\n" +
                    "\t\t\t\t\t\t\t  " + ANSI_YELLOW + "  ╩ ╩╩╝╚╝═╩╝╚═╝╩╚═╩ ╩" + "\033[39m" + "\033[49m" + ANSI_GREEN + "  ╚  ╚═╝╚═╝ ╩ ╚═╝╩ ╩╩═╝╩═╝ " + "\033[39m" + "\033[49m");
            System.out.println("\t\t\t\t\t   <-------------------------------------------------------------->");
            System.out.println("\n\t\t\t\t\t                         +---------+---+                           ");
            System.out.println("\t\t\t\t\t                         | Play    | 1 |                           ");
            System.out.println("\t\t\t\t\t                         +---------+---+                          ");
            System.out.println("\t\t\t\t\t                         | Help    | 2 |                          ");
            System.out.println("\t\t\t\t\t           ,             +---------+---+            ,__,__        ");
            System.out.println("\t\t\t\t\t       -   \\O            | Quit    | 0 |          , |xx|XX\\       ");
            System.out.println("\t\t\t\t\t     -     /\\            +---------+---+        O/  |xx|XXX\\      ");
            System.out.println("\t\t\t\t\t    -  ,__/\\ `                                  /\\  |xx|XXXX\\     ");
            System.out.println("\t\t\t\t\t            \\_ (*)                             ` << |xx|XXXXX|    ");
            System.out.println("\t\t\t\t\t" + ANSI_GREEN + "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" + "\033[39m" + "\033[49m");
            System.out.print("\n\t\t\t\t\t" +
                    "Choose: ");
            player = scanner.nextInt();

            while (player != 1 && player != 2 && player != 0) {
                System.out.println(ANSI_RED_BACKGROUND + "ERROR!!!!" + "\033[39m" + "\033[49m");
            }
            switch (player) {
                case 1:
                    Team teamlist[] = {manUnited, psg, realMadrid, fcPorto};
                    if (player == 1) {
                        clearScreen();
                        System.out.print("\n\n\n\n");
                        System.out.println("\t\t\t\t\t   -------------------------> GAME MODE <-------------------------");
                        System.out.println("\t\t\t\t\t                         +--------------+---+");
                        System.out.println("\t\t\t\t\t                         | Singleplayer | 1 |");
                        System.out.println("\t\t\t\t\t                         +--------------+---+");
                        System.out.println("\t\t\t\t\t                         | Multiplayer  | 2 |");
                        System.out.println("\t\t\t\t\t                         +--------------+---+");
                        System.out.println("\t\t\t\t\t                         |     Bets     | 3 |");
                        System.out.println("\t\t\t\t\t                         +--------------+---+");
                        System.out.println(" ");
                    }
                    do {
                        System.out.print("\t\t\t\t\tChoose your game mode: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("\t\t\t\t\tRepeat your selection: ");
                            scanner.next();
                        }
                        gameMode = scanner.nextInt();
                    } while (gameMode != 1 && gameMode != 2 && gameMode != 3);
                    if (gameMode == 1) {
                        clearScreen();
                        System.out.print("\n\n\n\n");
                        System.out.println("\t\t\t\t\t   -------------------------> DIFFICULTY <-------------------------");
                        System.out.println("\t\t\t\t\t                         +--------------+---+");
                        System.out.println("\t\t\t\t\t                         |    Begginer  | 1 |");
                        System.out.println("\t\t\t\t\t                         +--------------+---+");
                        System.out.println("\t\t\t\t\t                         |    Amateur   | 2 |");
                        System.out.println("\t\t\t\t\t                         +--------------+---+");
                        System.out.println("\t\t\t\t\t                         |    Normal    | 3 |");
                        System.out.println("\t\t\t\t\t                         +--------------+---+");
                        System.out.println("\t\t\t\t\t                         | Professional | 4 |");
                        System.out.println("\t\t\t\t\t                         +--------------+---+");


                        do {
                            System.out.print("\n\t\t\t\t\tChoose your difficulty: ");
                            while (!scanner.hasNextInt()) {
                                System.out.print("\t\t\t\t\tRepeat your selection: ");
                                scanner.next();
                            }
                            level = scanner.nextInt();
                        } while (level < 1 || level > 5);

                        System.out.print("\n\n\n");
                        System.out.println("\t  +-----+---------------------+-------------+---------------------+");
                        System.out.println("\t  | NUM | TIME NAME           | COUNTRY     | STADIUM             |");
                        System.out.println("\t  +-----+---------------------+-------------+---------------------+");
                        System.out.println("\t  |  1  | " + manUnited.name + "   | England 🏴󠁧󠁢󠁥󠁮󠁧󠁿  | " + stadiumM.getName() + "        |");
                        System.out.println("\t  |  2  | " + psg.name + "  | France 🇫🇷   | " + stadiumP.getName() + "    |");
                        System.out.println("\t  |  3  | " + realMadrid.name + "         | Spain 🇪🇸    | " + stadiumR.getName() + "   |");
                        System.out.println("\t  |  4  | " + fcPorto.name + "           | Portugal 🇵🇹 | " + stadiumF.getName() + "              |");
                        System.out.println("\t  +-----+---------------------+-------------+---------------------+");

                        System.out.print("\n\tChoose your team: ");
                        choiceTeam1 = scanner.nextInt() - 1;
                        randomint = (int) Math.floor(Math.random() * 3);
                        while (randomint == choiceTeam1) {
                            randomint = (int) Math.floor(Math.random() * 3);
                        }
                        player1.setName(teamlist[choiceTeam1].name);
                        cpu.setName(teamlist[randomint].name);
                        System.out.print("\n\t" + ANSI_BLUE_BACKGROUND + "[Player 1]" + "\033[39m" + "\033[49m" + " -> " + player1.getName());
                        System.out.print("\n\t" + "   " + ANSI_BLACK_BACKGROUND + "[Cpu]" + "\033[39m" + "\033[49m" + "   -> " + cpu.getName());
                        player1 = teamlist[choiceTeam1];
                        cpu = teamlist[randomint];

                        System.out.println("\n\t<----------------------------->");
                        System.out.println("\n --------------------------------> XI Starters <--------------------------------");
                        System.out.println("\n            " + player1 + "                                " + cpu + "                 ");
                        printTeam.print(player1, cpu);
                        System.out.println("\n -------------------------------------------------------------------------------");
                        switch (level) {
                            case 1:
                                begginer.startGame(player1, cpu);
                            case 2:
                                amateur.startGame(player1, cpu);
                            case 3:
                                normal.startGame(player1, cpu);
                            case 4:
                                professional.startGame(player1, cpu);

                        }
                    } else if (gameMode == 2) {
                        System.out.print("\n\n\n");
                        System.out.println("\t  +-----+---------------------+-------------+---------------------+");
                        System.out.println("\t  | NUM | TIME NAME           | COUNTRY     | STADIUM             |");
                        System.out.println("\t  +-----+---------------------+-------------+---------------------+");
                        System.out.println("\t  |  1  | " + manUnited.name + "   | England 🏴󠁧󠁢󠁥󠁮󠁧󠁿  | " + stadiumM.getName() + "        |");
                        System.out.println("\t  |  2  | " + psg.name + "  | France 🇫🇷   | " + stadiumP.getName() + "    |");
                        System.out.println("\t  |  3  | " + realMadrid.name + "         | Spain 🇪🇸    | " + stadiumR.getName() + "   |");
                        System.out.println("\t  |  4  | " + fcPorto.name + "           | Portugal 🇵🇹 | " + stadiumF.getName() + "              |");
                        System.out.println("\t  +-----+---------------------+-------------+---------------------+");

                        System.out.print("\n\tChoose your team player1: ");
                        choiceTeam1 = scanner.nextInt() - 1;
                        System.out.print("\n\tChoose your team player2: ");
                        choiceTeam2 = scanner.nextInt() - 1;
                        player1.setName(teamlist[choiceTeam1].name);
                        player2.setName(teamlist[choiceTeam2].name);
                        System.out.print("\n\t" + ANSI_BLUE_BACKGROUND + "[Player 1]" + "\033[39m" + "\033[49m" + " -> " + player1.getName());
                        System.out.print("\n\t" + ANSI_YELLOW_BACKGROUND + "[Player 2]" + "\033[39m" + "\033[49m" + " -> " + player2.getName());
                        player1 = teamlist[choiceTeam1];
                        player2 = teamlist[choiceTeam2];
                        System.out.println("\n----------------------------------------------------");
                        System.out.println("\n --------------------------------> XI Starters <--------------------------------");
                        System.out.println("\n            " + player1 + "                                " + player2 + "                 ");
                        printTeam.print(player1, player2);
                        System.out.println("\n -------------------------------------------------------------------------------");
                        multiplayer.startGame(player1, player2);


                    } else if (gameMode == 3) {
                        System.out.print("\n\n\n");
                        System.out.println("\t  +-----+---------------------+-------------+---------------------+");
                        System.out.println("\t  | NUM | TIME NAME           | COUNTRY     | STADIUM             |");
                        System.out.println("\t  +-----+---------------------+-------------+---------------------+");
                        System.out.println("\t  |  1  | " + manUnited.name + "   | England 🏴󠁧󠁢󠁥󠁮󠁧󠁿  | " + stadiumM.getName() + "        |");
                        System.out.println("\t  |  2  | " + psg.name + "  | France 🇫🇷   | " + stadiumP.getName() + "    |");
                        System.out.println("\t  |  3  | " + realMadrid.name + "         | Spain 🇪🇸    | " + stadiumR.getName() + "   |");
                        System.out.println("\t  |  4  | " + fcPorto.name + "           | Portugal 🇵🇹 | " + stadiumF.getName() + "              |");
                        System.out.println("\t  +-----+---------------------+-------------+---------------------+");

                        System.out.print("\n\tChoose your team for CPU 1: ");
                        choiceTeam1 = scanner.nextInt() - 1;
                        System.out.print("\n\tChoose your team for Cpu 2: ");
                        choiceTeam2 = scanner.nextInt() - 1;
                        player1.setName(teamlist[choiceTeam1].name);
                        player2.setName(teamlist[choiceTeam2].name);
                        System.out.print("\n\t" + ANSI_BLUE_BACKGROUND + "[CPU 1]" + "\033[39m" + "\033[49m" + " -> " + player1.getName());
                        System.out.print("\n\t" + ANSI_YELLOW_BACKGROUND + "[CPU 2]" + "\033[39m" + "\033[49m" + " -> " + player2.getName());
                        player1 = teamlist[choiceTeam1];
                        player2 = teamlist[choiceTeam2];
                        System.out.println("\n----------------------------------------------------");
                        System.out.println("\n --------------------------------> XI Starters <--------------------------------");
                        System.out.println("\n            " + player1 + "                                " + player2 + "                 ");
                        printTeam.print(player1, player2);
                        System.out.println("\n -------------------------------------------------------------------------------");
                        bets.startGame(player1, player2);
                    }


                    break;

                case 2:
                    Helper helper = new Helper("Help");
                    helper.toString();
                    statusMenu = 1;
                    System.out.print("\t\t\t\t\t\t\t                         [PRESS ENTER] ");
                    System.out.println("\n\n");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 0:
                    System.exit(0);
                    statusMenu = 0;
                    break;


            }

        }
        while (statusMenu != 0);
    }
}
