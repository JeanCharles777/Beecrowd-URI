import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double R;
        double pi = 3.14159, VOLUME;
        R = in.nextInt();
        VOLUME = (4.0/3) * pi * (R * R * R);
        System.out.printf("VOLUME = %.3f%n", VOLUME);
        in.close();
    }

}