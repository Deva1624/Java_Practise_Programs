import java.util.Random;
import java.util.Scanner;

abstract class GameEngine {
    abstract void gameassets(String x);
}

class Guessor extends GameEngine {
    Random rm = new Random();
    int rm_num = rm.nextInt(10);
    int counter = 0;

    void gameassets(String x) {
        while ("yes".equals(x)) {
            counter += 1;
            System.out.println("Guess The Number Between 0 to 10");
            Scanner input = new Scanner(System.in);
            int en_num = input.nextInt();
            if (rm_num == en_num) {
                System.out.println("You guessed The Number");
                System.out.println("Total Tries:" + counter);
                break;
            } else {
                continue;
            }
        }

    }
}

public class Guessorgame {
    public static void main(String[] args) {
        System.out.println("Do yo Want to Play Guess Game Enter yes/no: ");
        Scanner inp = new Scanner(System.in);
        String answer = inp.nextLine();
        Guessor gs = new Guessor();
        if ("yes".equals(answer)) {
            gs.gameassets(answer);
        } else {
            System.out.println("Good Bye!");
        }
    }
}