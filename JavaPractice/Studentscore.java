import java.util.Scanner;

class Studentscore {
    public static void main(String[] args) {
        String stuname = "";
        String stu2 = "";
        int highscore = 0;
        int sechigh = 0;
        System.out.println("Enter the Number Of Students: ");
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        for (int i = 1; i <= s; i++) {
            System.out.println("Enter Student Name :");
            Scanner nameinp = new Scanner(System.in);
            String name = nameinp.nextLine();
            System.out.println("Enter " + name + "'s Score: ");
            Scanner scoreinp = new Scanner(System.in);
            int score = scoreinp.nextInt();

            if (score > highscore) {
                sechigh = highscore;
                stu2 = stuname;
                highscore = score;
                stuname = name;
            } else if (score > sechigh) {
                stu2 = name;
                sechigh = score;
            }
        }

        System.out.println("Congrates " + stuname + " Your are Top Scorer!!");
        System.out.println("Your Score is: " + highscore);

        System.out.println("Congrates " + stu2 + " Your are Second Top Scorer!!");
        System.out.println("Your Score is: " + sechigh);
    }
}