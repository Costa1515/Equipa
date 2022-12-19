import Teams.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class Bets {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    Scanner scanner = new Scanner(System.in);
    int shoot;
    int save;
    boolean finishGame = true;
    boolean suddenDead = true;
    int saves;
    int choose;
    int winner;

    public void startGame(Team team1, Team team2) {
        System.out.println("Choose the team you think will win: ");
        System.out.println("  Press 1 to CPU1  | Press 2 for CPU2");
        choose = scanner.nextInt();
        while (finishGame) {
            for (int i = 0; i < 5; i++) {
                System.out.println("           +---------------------||-----------||---------------------+        ");
                System.out.println("           | " + team1.getName() + " || [" + team1.getGoals() + "] - [" + team2.getGoals() + "] || " + team2.getName() + " |");
                System.out.println("    _______|_____________________||___________||_____________________|_______ ");
                System.out.println("   |  _____________________________________________________________________  |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |    [1]                                                       [2]    | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                 [5]                                 | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |    [3]                                                       [4]    | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("");
                shoot = (int) (Math.random() * 5);
                save = (int) (Math.random() * 5);

                if (shoot != saves) {
                    team1.golo();
                    System.out.println("\n" +
                            "            ██████╗  ██████╗  █████╗ ██╗     ██╗██╗██╗\n" +
                            "           ██╔════╝ ██╔═══██╗██╔══██╗██║     ██║██║██║\n" +
                            "           ██║  ███╗██║   ██║███████║██║     ██║██║██║\n" +
                            "           ██║   ██║██║   ██║██╔══██║██║     ╚═╝╚═╝╚═╝\n" +
                            "           ╚██████╔╝╚██████╔╝██║  ██║███████╗██╗██╗██╗\n" +
                            "            ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                           \n");
                } else if (shoot == 1 && saves == 1) {
                    System.out.println("    _________________________________________________________________________ ");
                    System.out.println("   |  _____________________________________________________________________  |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |      (*)__                                                 [2]      | |");
                    System.out.println("   | |      \\    \\                                                         | |");
                    System.out.println("   | |       \\  ( )                                                        | |");
                    System.out.println("   | |        \\___\\       __                                               | |");
                    System.out.println("   | |             \\     /                                                 | |");
                    System.out.println("   | |              \\___/                                                  | |");
                    System.out.println("   | |               \\                  [5]                                | |");
                    System.out.println("   | |                \\____,                                               | |");
                    System.out.println("   | |                     '                                               | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |      [3]                                                    [4]     | |");
                    System.out.println("   | |                                                                     | |");

                    System.out.println("\n" +
                            "           ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "           ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "           ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "           ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "           ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "           ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                          \n");

                } else if (shoot == 2 && saves == 2) {
                    System.out.println("    _________________________________________________________________________ ");
                    System.out.println("   |  _____________________________________________________________________  |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |        [1]                                                  [2]     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                  [5]                                | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                  \\                                                  | |");
                    System.out.println("   | |                   \\           /\\                                    | |");
                    System.out.println("   | |                    \\         /  \\_                                  | |");
                    System.out.println("   | |        (*)  ______(:)+======+______,                        [4]     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("\n" +
                            "           ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "           ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "           ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "           ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "           ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "           ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                          \n");

                } else if (shoot == 5 && saves == 5) {
                    System.out.println("    _________________________________________________________________________ ");
                    System.out.println("   |  _____________________________________________________________________  |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |      [1]                                                    [2]     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                  _                                  | |");
                    System.out.println("   | |                                 ( )                                 | |");
                    System.out.println("   | |                                ((*))                                | |");
                    System.out.println("   | |                                 /|\\                                 | |");
                    System.out.println("   | |                                  |                                  | |");
                    System.out.println("   | |                                  A                                  | |");
                    System.out.println("   | |                                 / \\                                 | |");
                    System.out.println("   | |        [3]                     /   \\                       [4]      | |");
                    System.out.println("   | |                               /     \\                               | |");
                    System.out.println("\n" +
                            "           ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "           ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "           ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "           ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "           ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "           ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                          \n");
                } else if (shoot == 4 && saves == 4) {
                    System.out.println("    _________________________________________________________________________ ");
                    System.out.println("   |  _____________________________________________________________________  |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |     [1]                                                     [2]     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                 [5]                                 | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                 /                   | |");
                    System.out.println("   | |                                     /\\         /                    | |");
                    System.out.println("   | |                                   _/  \\       /                     | |");
                    System.out.println("   | |      [3]                        ,______+======+(:)______   (*)      | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("\n" +
                            "           ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "           ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "           ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "           ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "           ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "           ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                          \n");
                } else if (shoot == 2 && saves == 2) {
                    System.out.println("    _______|_____________________||___________||_____________________|_______ ");
                    System.out.println("   |  _____________________________________________________________________  |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |        [1]                                                __ (*)    | |");
                    System.out.println("   | |                                                         /    /      | |");
                    System.out.println("   | |                                                        ( )  /       | |");
                    System.out.println("   | |                                               __       /___/        | |");
                    System.out.println("   | |                                                 \\     /             | |");
                    System.out.println("   | |                                                  \\___/              | |");
                    System.out.println("   | |                                    [5]              /               | |");
                    System.out.println("   | |                                               ,____/                | |");
                    System.out.println("   | |                                               '                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |        [3]                                                  [4]     | |");
                    System.out.println("\n" +
                            "           ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "           ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "           ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "           ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "           ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "           ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                          \n");
                }
                System.out.println("           +---------------------||-----------||---------------------+        ");
                System.out.println("           | " + team1.getName() + " || [" + team1.getGoals() + "] - [" + team2.getGoals() + "] || " + team2.getName() + " |");
                System.out.println("    _______|_____________________||___________||_____________________|_______ ");
                System.out.println("   |  _____________________________________________________________________  |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |    [1]                                                       [2]    | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                 [5]                                 | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("   | |    [3]                                                       [4]    | |");
                System.out.println("   | |                                                                     | |");
                System.out.println("");
                save = (int) (Math.random() * 5);
                shoot = (int) (Math.random() * 5);

                if (save != shoot) {
                    team2.golo();
                    System.out.println("\n" + ANSI_RED +
                            "            ██████╗  ██████╗  █████╗ ██╗     ██╗██╗██╗\n" +
                            "           ██╔════╝ ██╔═══██╗██╔══██╗██║     ██║██║██║\n" +
                            "           ██║  ███╗██║   ██║███████║██║     ██║██║██║\n" +
                            "           ██║   ██║██║   ██║██╔══██║██║     ╚═╝╚═╝╚═╝\n" +
                            "           ╚██████╔╝╚██████╔╝██║  ██║███████╗██╗██╗██╗\n" +
                            "            ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝╚═╝╚═╝\n" + "\033[39m" + "\033[49m " +
                            "                                           \n");
                } else if (shoot == 1 && save == 1) {
                    System.out.println("    _________________________________________________________________________ ");
                    System.out.println("   |  _____________________________________________________________________  |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |      (*)__                                                 [2]      | |");
                    System.out.println("   | |      \\    \\                                                         | |");
                    System.out.println("   | |       \\  ( )                                                        | |");
                    System.out.println("   | |        \\___\\       __                                               | |");
                    System.out.println("   | |             \\     /                                                 | |");
                    System.out.println("   | |              \\___/                                                  | |");
                    System.out.println("   | |               \\                  [5]                                | |");
                    System.out.println("   | |                \\____,                                               | |");
                    System.out.println("   | |                     '                                               | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |      [3]                                                    [4]     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("\n" +
                            "           ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "           ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "           ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "           ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "           ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "           ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                          \n");

                } else if (shoot == 3 && save == 3) {
                    System.out.println("    _________________________________________________________________________ ");
                    System.out.println("   |  _____________________________________________________________________  |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |        [1]                                                  [2]     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                  [5]                                | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                  \\                                                  | |");
                    System.out.println("   | |                   \\           /\\                                    | |");
                    System.out.println("   | |                    \\         /  \\_                                  | |");
                    System.out.println("   | |        (*)  ______(:)+======+______,                        [4]     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("\n" +
                            "           ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "           ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "           ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "           ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "           ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "           ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                          \n");

                } else if (shoot == 5 && save == 5) {
                    System.out.println("    _________________________________________________________________________ ");
                    System.out.println("   |  _____________________________________________________________________  |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |      [1]                                                    [2]     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                  _                                  | |");
                    System.out.println("   | |                                 ( )                                 | |");
                    System.out.println("   | |                                ((*))                                | |");
                    System.out.println("   | |                                 /|\\                                 | |");
                    System.out.println("   | |                                  |                                  | |");
                    System.out.println("   | |                                  A                                  | |");
                    System.out.println("   | |                                 / \\                                 | |");
                    System.out.println("   | |        [3]                     /   \\                       [4]      | |");
                    System.out.println("   | |                               /     \\                               | |");
                    System.out.println("\n" +
                            "           ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "           ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "           ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "           ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "           ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "           ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                          \n");
                } else if (shoot == 4 && save == 4) {
                    System.out.println("    _________________________________________________________________________ ");
                    System.out.println("   |  _____________________________________________________________________  |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |     [1]                                                     [2]     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                 [5]                                 | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                 /                   | |");
                    System.out.println("   | |                                     /\\         /                    | |");
                    System.out.println("   | |                                   _/  \\       /                     | |");
                    System.out.println("   | |      [3]                        ,______+======+(:)______   (*)      | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("\n" +
                            "           ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "           ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "           ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "           ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "           ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "           ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                          \n");
                } else if (shoot == 2 && save == 2) {
                    System.out.println("    _______|_____________________||___________||_____________________|_______ ");
                    System.out.println("   |  _____________________________________________________________________  |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |        [1]                                                __ (*)    | |");
                    System.out.println("   | |                                                         /    /      | |");
                    System.out.println("   | |                                                        ( )  /       | |");
                    System.out.println("   | |                                               __       /___/        | |");
                    System.out.println("   | |                                                 \\     /             | |");
                    System.out.println("   | |                                                  \\___/              | |");
                    System.out.println("   | |                                    [5]              /               | |");
                    System.out.println("   | |                                               ,____/                | |");
                    System.out.println("   | |                                               '                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |                                                                     | |");
                    System.out.println("   | |        [3]                                                  [4]     | |");
                    System.out.println("\n" +
                            "           ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "           ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "           ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "           ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "           ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "           ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                          \n");
                }
            }
            if (team1.getGoals() == team2.getGoals()){
                System.out.print("\n\n\n");
                System.out.println("\t                           Full Time:");
                System.out.println("\t                           +---+---+        ");
                System.out.println("\t                           | " + team1.getGoals() + " | " + team2.getGoals() + " |");
                System.out.println("\t                           +---+---+        ");
                System.out.println("\t");
                System.out.println("\n" +
                        "           ██████╗ ██████╗  █████╗ ██╗    ██╗\n" +
                        "           ██╔══██╗██╔══██╗██╔══██╗██║    ██║\n" +
                        "           ██║  ██║██████╔╝███████║██║ █╗ ██║\n" +
                        "           ██║  ██║██╔══██╗██╔══██║██║███╗██║\n" +
                        "           ██████╔╝██║  ██║██║  ██║╚███╔███╔╝\n" +
                        "           ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚══╝╚══╝ \n" +
                        "                                             \n" +
                        "                                             \n" +
                        "                                             \n" +
                        "                                             \n" +
                        "                                  \n" +
                        "                                  \n" +
                        "                                  \n" +
                        "                                  \n");
            }else {
                System.out.print("\n\n\n");
                System.out.println("\t                           Full Time:");
                System.out.println("\t                           +---+---+        ");
                System.out.println("\t                           | " + team1.getGoals() + " | " + team2.getGoals() + " |");
                System.out.println("\t                           +---+---+        ");
                System.out.println("\t");
                System.out.println("\n" + ANSI_YELLOW +
                        "\t           ██╗    ██╗██╗███╗   ██╗███╗   ██╗███████╗██████╗ \n" +
                        "\t           ██║    ██║██║████╗  ██║████╗  ██║██╔════╝██╔══██╗\n" +
                        "\t           ██║ █╗ ██║██║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝\n" +
                        "\t           ██║███╗██║██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔══██╗\n" +
                        "\t           ╚███╔███╔╝██║██║ ╚████║██║ ╚████║███████╗██║  ██║\n" +
                        "\t            ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝\n" +
                        "                                                 \n                                                             ");
                System.out.println("\t");
                System.out.println("\t                          ___________");
                System.out.println("\t                         '._==_==_=_.'");
                System.out.println("\t                         .-\\:      /-.");
                System.out.println("\t                        | (|:.     |) |");
                System.out.println("\t                         '-|:.     |-'");
                System.out.println("\t                           \\::.    /");
                System.out.println("\t                            '::. .'");
                System.out.println("\t                              ) (");
                System.out.println("\t                            _.' '._");
                System.out.println("\t                           `\"\"\"\"\"\"\"" + "\033[39m" + "\033[49m " + "`\n");
                if (team1.getGoals() > team2.getGoals()) {
                    finishGame = false;
                    System.out.println("                           " + team1.getName());
                    winner = 1;
                } else {
                    finishGame = false;
                    System.out.println("                           " + team2.getName());
                    winner = 2;
                }
            }
            if (choose == winner) {
                System.out.println("Congrats, you Win 🏆");
            }else if (choose != winner){
                System.out.println("Noooo, you lost ❌");
            } else if (team1.getGoals() == team2.getGoals()) {
                System.out.println("Noooo, you lost ❌");

            }


        }
    }
}


