package Difficulties;

import Teams.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class Amateur {
    public static ArrayList<Integer> saves() {
        ArrayList<Integer> saver = new ArrayList<>(2);
        int counter = 0;
        while (counter < 4) {
            int save = (int) (Math.random() * 5);
            if (!saver.contains(save)) {
                saver.add(save);
                counter++;
            }

        }return saver;
    }
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    Scanner scanner = new Scanner(System.in);
    int shoot;
    int save;

    boolean finishGame = true;
    int gameRep;

    public void startGame(Team team1, Team team2) {
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
                System.out.print("shoot: ");
                shoot = scanner.nextInt();
                saves();

                if (!saves().contains(shoot)) {
                    team1.golo();
                    System.out.println("\n" +
                            "              ██████╗  ██████╗  █████╗ ██╗     ██╗██╗██╗\n" +
                            "             ██╔════╝ ██╔═══██╗██╔══██╗██║     ██║██║██║\n" +
                            "             ██║  ███╗██║   ██║███████║██║     ██║██║██║\n" +
                            "             ██║   ██║██║   ██║██╔══██║██║     ╚═╝╚═╝╚═╝\n" +
                            "             ╚██████╔╝╚██████╔╝██║  ██║███████╗██╗██╗██╗\n" +
                            "              ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                             \n");
                } else if (saves().contains(shoot == 1)) {
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
                            "             ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "             ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "             ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "             ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "             ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "             ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                            \n");

                } else if (saves().contains(shoot == 2)) {
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
                            "             ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "             ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "             ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "             ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "             ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "             ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                            \n");

                } else if (saves().contains(shoot == 5)) {
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
                            "             ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "             ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "             ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "             ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "             ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "             ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                            \n");
                } else if (saves().contains(shoot == 4)) {
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
                            "             ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "             ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "             ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "             ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "             ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "             ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                            \n");
                } else if (saves().contains(shoot == 2)) {
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
                            "             ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "             ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "             ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "             ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "             ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "             ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                            \n");
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
                System.out.print("save: ");
                save = scanner.nextInt();
                saves();

                if (!saves().contains(shoot)) {
                    team2.golo();
                    System.out.println("\n" + ANSI_RED +
                            "              ██████╗  ██████╗  █████╗ ██╗     ██╗██╗██╗\n" +
                            "             ██╔════╝ ██╔═══██╗██╔══██╗██║     ██║██║██║\n" +
                            "             ██║  ███╗██║   ██║███████║██║     ██║██║██║\n" +
                            "             ██║   ██║██║   ██║██╔══██║██║     ╚═╝╚═╝╚═╝\n" +
                            "             ╚██████╔╝╚██████╔╝██║  ██║███████╗██╗██╗██╗\n" +
                            "              ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝╚═╝╚═╝\n" + "\033[39m" + "\033[49m " +
                            "                                             \n");
                } else if (saves().contains(save == 1 )) {
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
                            "             ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "             ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "             ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "             ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "             ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "             ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                            \n");

                } else if (saves().contains(save == 3)) {
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
                            "             ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "             ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "             ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "             ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "             ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "             ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                            \n");

                } else if (saves().contains(save == 5)) {
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
                            "             ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "             ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "             ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "             ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "             ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "             ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                            \n");
                } else if (saves().contains(save == 4)) {
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
                            "             ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "             ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "             ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "             ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "             ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "             ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                            \n");
                } else if (saves().contains(save == 2)) {
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
                            "             ███████╗ █████╗ ██╗   ██╗███████╗██╗██╗██╗\n" +
                            "             ██╔════╝██╔══██╗██║   ██║██╔════╝██║██║██║\n" +
                            "             ███████╗███████║██║   ██║█████╗  ██║██║██║\n" +
                            "             ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝  ╚═╝╚═╝╚═╝\n" +
                            "             ███████║██║  ██║ ╚████╔╝ ███████╗██╗██╗██╗\n" +
                            "             ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝╚═╝\n" +
                            "                                            \n");
                }
            }
            if (team1.getGoals() == team2.getGoals()) {
                System.out.println("\n" + ANSI_RED +
                        "             ███████╗██╗   ██╗██████╗ ██████╗ ███████╗███╗   ██╗██████╗ ███████╗ █████╗ ████████╗██╗  ██╗\n" +
                        "             ██╔════╝██║   ██║██╔══██╗██╔══██╗██╔════╝████╗  ██║██╔══██╗██╔════╝██╔══██╗╚══██╔══╝██║  ██║\n" +
                        "             ███████╗██║   ██║██║  ██║██║  ██║█████╗  ██╔██╗ ██║██║  ██║█████╗  ███████║   ██║   ███████║\n" +
                        "             ╚════██║██║   ██║██║  ██║██║  ██║██╔══╝  ██║╚██╗██║██║  ██║██╔══╝  ██╔══██║   ██║   ██╔══██║\n" +
                        "             ███████║╚██████╔╝██████╔╝██████╔╝███████╗██║ ╚████║██████╔╝███████╗██║  ██║   ██║   ██║  ██║\n" +
                        "             ╚══════╝ ╚═════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═══╝╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝\n" + "\033[39m" + "\033[49m" +
                        "                                                                                            \n");

                finishGame = true;

            }
            if (team1.getGoals() != team2.getGoals()) {
                finishGame = false;
            }

            System.out.print("\n\n\n");
            System.out.println("\t                           Full Time:");
            System.out.println("\t                           +---+---+        ");
            System.out.println("\t                           | " + team1.getGoals() + " | " + team2.getGoals() + " |");
            System.out.println("\t                           +---+---+        ");
            System.out.println("\t");
            System.out.println("\n" + ANSI_YELLOW +
                    "\t             ██╗    ██╗██╗███╗   ██╗███╗   ██╗███████╗██████╗ \n" +
                    "\t             ██║    ██║██║████╗  ██║████╗  ██║██╔════╝██╔══██╗\n" +
                    "\t             ██║ █╗ ██║██║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝\n" +
                    "\t             ██║███╗██║██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔══██╗\n" +
                    "\t             ╚███╔███╔╝██║██║ ╚████║██║ ╚████║███████╗██║  ██║\n" +
                    "\t              ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝\n" +
                    "                                                   \n                                                             ");
            System.out.println("\t");
            System.out.println("\t                            ___________");
            System.out.println("\t                           '._==_==_=_.'");
            System.out.println("\t                           .-\\:      /-.");
            System.out.println("\t                          | (|:.     |) |");
            System.out.println("\t                           '-|:.     |-'");
            System.out.println("\t                             \\::.    /");
            System.out.println("\t                              '::. .'");
            System.out.println("\t                                ) (");
            System.out.println("\t                              _.' '._");
            System.out.println("\t                             `\"\"\"\"\"\"\"" + "\033[39m" + "\033[49m " + "`\n");
            if (team1.getGoals() > team2.getGoals()) {
                finishGame = false;
                System.out.println("                           " + team1.getName());
            } else {
                finishGame = false;
                System.out.println("                           " + team2.getName());
            }
        }
    }
}
