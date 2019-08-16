import java.util.Random;
import java.util.Scanner;

class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[10];
        String[] fruits = { "mango", "orange", "banana", "pinapple", "guvava", "grape" };
        Random rand = new Random();
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = i + 1;
        // }
        // for (int i = 0; i < arr.length; i++) {
        // int index = rand.nextInt(arr.length);
        // int temp = arr[i];
        // arr[temp] = arr[index];
        // arr[index] = temp;
        // }
        int temp = 0;
        System.out.println("Enter Fruit You Want to Search");
        Scanner inp = new Scanner(System.in);
        String fruitname = inp.nextLine();
        while (true) {
            for (String fruit : fruits) {
                temp += 1;
                if (fruit.equals(fruitname)) {
                    System.out.println("yes the " + fruitname + " Present in the array At Position of " + temp);
                    break;
                } else {
                    continue;
                }
            }
        }

    }
}