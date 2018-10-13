package money;
import java.util.*;

public class Money {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int n;
        n = (a*10 + b)/(1*10 + 9);
        System.out.print(n);
    }
}
