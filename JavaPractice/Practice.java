import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        mark_avg = 0;
        int result;
        int i;
        int s;
        s = input.nextInt();
        int[] arr = new int[s];
        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int k = 0; k < arr.length; k++) {
            mark_avg += arr[k];
        }
        for (int l = 0; l < arr.length; l++) {
            for (int j = l; j < arr.length; j++) {
                if (arr[l] <= arr[j]) {
                    result = arr[l];
                    arr[l] = arr[j];
                    arr[j] = result;
                }
            }
        }

        mark_avg /= s;
        System.out.println("Average is: " + mark_avg);
        System.out.println("Highest number is " + arr[0]);
    }
}
