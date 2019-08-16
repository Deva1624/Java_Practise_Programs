import java.util.Random;

class MethodArray {

    public int average(int[] data) {
        int avg = 0;
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            temp += data[i];

        }
        System.out.println("This iss temp[[[[" + temp);
        avg = temp / data.length;
        System.out.println("Thhhhhsisisis average0" + avg);
        return avg;
    }

    public double average(double[] data) {
        double avg = 0;
        double temp = 0;
        for (int i = 0; i < data.length; i++) {
            temp += data[i];
        }
        System.out.println("This iss temp[[[[" + temp);
        avg = temp / data.length;
        System.out.println("Thhhhhsisisis average0" + avg);
        return avg;
    }

    public static void main(String[] args) {
        int[] data = new int[10];
        double[] data2 = new double[10];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(20);
        }
        for (int i = 0; i < data.length; i++) {
            data2[i] = random.nextInt(20);
        }
        MethodArray ml = new MethodArray();
        MethodArray ml2 = new MethodArray();

        System.out.println(ml.average(data));
        System.out.println(ml2.average(data2));
    }
}