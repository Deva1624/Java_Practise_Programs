import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class UserArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList();
        for (int i = 1; i > 0; i++) {
            System.out.println("Enter The Number");
            int inp_num = inp.nextInt();

            if (inp_num == 0) {
                System.out.println(num);
                break;
            }
            num.add(inp_num);
        }
        Collections.sort(num);
        System.out.println("The Biggest Number is " + num.get(num.size() - 1));
        System.out.println("The Smallest Number is " + num.get(0));

    }
}