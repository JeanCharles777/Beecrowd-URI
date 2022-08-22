import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int km, minutos;
        km = in.nextInt();
        minutos = (60 / 30 )* km;
        System.out.println(minutos+" minutos");
        in.close();
    }

}