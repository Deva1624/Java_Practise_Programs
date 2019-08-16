import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orignal = n;
        int orignal2 = n;
        int result = 0, count = 0, rm = 0, sum = 0;
        while (n != 0) {
            n /= 10;
            ++count;
        }
        while (orignal != 0) {
            rm = orignal % 10;
            sum += Math.pow(rm, count);
            orignal /= 10;
        }
        if (sum == orignal2) {
            result = 1;
        }
        System.out.print(result);
    }
}