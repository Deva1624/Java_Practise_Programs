import java.util.Random;
import java.util.Scanner;

public class Game {
    int counter = 0;

    public void Gameplayer(int a) {
        counter += 1;
        int en_num = a;
        Random rm = new Random();
        int ran_num = rm.nextInt(10);
        if (en_num != ran_num) {
            System.out.println("Enter The number between 1 to 10: ");
            Scanner input1 = new Scanner(System.in);
            int entr_num2 = input1.nextInt();
            Gameplayer(entr_num2);
        } else {
            System.out.println("You Guessed it Correctly!");
            System.out.println("Total Tries: " + counter);
        }

    }
}

class Guessgame {
    public static void main(String[] args) {
        System.out.println("Enter The number between 1 to 10: ");
        Scanner input = new Scanner(System.in);
        int entr_num = input.nextInt(10);
        Game g1 = new Game();
        g1.Gameplayer(entr_num);
    }
}