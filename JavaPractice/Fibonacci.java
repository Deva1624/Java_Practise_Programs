import java.util.Scanner; //This package for reading input

public class Fibonacci {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read an integer
        System.out.println(fib(n)); // Generate and print the n-th Fibonacci
                                    // number
    }

    static int fib(int n) {
        int sum=0;
        int num1=1,num2=0;
        for (int i = 1; i < n; i++) {
                sum = num2 + num1;
	            num2 = num1;
	            num1 = sum;
        }
        
        return num2;
    }
}