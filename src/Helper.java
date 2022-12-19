public class Helper {
    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public Helper(String Help){
        clearScreen();
        System.out.print("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t +----------+");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t |   HELP   |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t +----------+\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t   The minimum points is five, ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t but it can be less and it can be more ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t depending on the score. ");
        System.out.println("\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t   For example if it reaches the fourth kicker ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t there is a difference of two points against the opposing team, ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t then the team with the highest score ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t will automatically win the match. ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t   When it reaches the fifth singer stay on ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t a draw position will result in a 'sudden death', ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t which means every team that fails, ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t while the other team managed to enter ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t then the winner can be taken.\n");

    }

}
