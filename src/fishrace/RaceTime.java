package fishrace;
import java.util.*;

public class RaceTime{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        int d = reader.nextInt();
        int n, e, f;
        n = (c * 60 + d) - (a * 60 + b);
        e = n / 60;
        f = n % 60;
        System.out.print(e + " " + f);
    }
}
