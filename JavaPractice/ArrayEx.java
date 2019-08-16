import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class ArrayEx {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(100);

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Integer[] boxedarr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedarr, Collections.reverseOrder());
        System.out.println(Arrays.toString(boxedarr));
    }

}