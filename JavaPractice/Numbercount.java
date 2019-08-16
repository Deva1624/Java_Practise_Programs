import java.util.Scanner;

class Numbercount {
    public static void main(String[] args) {
        int counter = 0;
        int counter2 = 0;
        int posnum = 0;
        int negnum = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter The Number As Much you want");
            int num = input.nextInt();
            if (num > 0) {
                counter += 1;
                posnum += num;
            }
            if (num < 0) {
                counter2 += 1;
                negnum -= num;
            }
            if (num == 0) {
                System.out.println("Total Postive Number is " + counter);
                System.out.println("Sum Of Postive Number is " + posnum);
                System.out.println("Total Negative Number is " + counter2);
                System.out.println("Sum Of Negative Number is -" + negnum);
                break;
            }

        }
    }
}