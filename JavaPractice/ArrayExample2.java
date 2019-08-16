import java.util.Arrays;
import java.util.Random;

class ArrayExample2 {
    public static void main(String[] args) {
        int[] numarr = new int[10];
        // int[] temp = new int[10];
        Random random = new Random();
        for (int i = 0; i < numarr.length; i++) {
            numarr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(numarr));
        for (int j = 0; j < numarr.length; j++) {
            if (j % 2 != 0) {
                System.out.println(numarr[j]);
            }

        }
    }
}