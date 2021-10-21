import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte pocet cisel.");
        int x = sc.nextInt();
        int w = 0;
        int q = 0;
        int[] array = new int[x];


        for (int i = 0; i < x; i++) {
            System.out.println("Zadejte cislo.");
            int y = sc.nextInt();
            array[i] = y;
            System.out.println(Arrays.toString(array));
            w = w + array[i];
        }
        double z = (double)w / array.length;
        double avg = Math.ceil(z);
        for (int a = 0; a < array.length; a++) {
            if(array[a] >= z){
                q = q + array[a];
            }
        }
        System.out.println(q);
    }
}
