import java.util.Scanner;

class Excepts {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner inp = new Scanner(System.in);
                System.out.println("Enter Two Number to caluculate: ");
                String num1 = inp.nextLine();
                String num2 = inp.nextLine();
                System.out.println("The Addition of " + num1 + " and " + num2 + " is "
                        + Math.addExact(Integer.parseInt(num1), Integer.parseInt(num2)));
                System.out.println("The Multiplication of " + num1 + " and " + num2 + " is "
                        + Math.multiplyExact(Integer.parseInt(num1), Integer.parseInt(num2)));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("You have Enter non Numberic Number The program terminates");
                break;
            }

        }
    }
}
