import java.util.Scanner;

class ExceptionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the two number to add");
                int num = input.nextInt();
                int num2 = input.nextInt();
                if (num > 5 & num2 > 5) {
                    System.out.println("The Sum of " + num + " and " + num2 + " is: " + Math.addExact(num, num2));
                    break;
                } else {
                    System.out.println("Please Enter the number Greater Than 5");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Please Enter valid Integer Number");
                input.nextLine();
            }
        }
    }
}