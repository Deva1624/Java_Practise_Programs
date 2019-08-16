import java.util.Scanner;

class WithoutExcept {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.println("Enetr Any two Numbers");
            if (inp.hasNextInt()) {
                int num1 = inp.nextInt();
                int num2 = inp.nextInt();
                System.out.println("The Sum of the " + num1 + " and " + num2 + " is: " + Math.addExact(num1, num2));
            } else {
                System.out.println("You Have Entered Non Numeric value: ");
                break;
            }
        }

    }
}