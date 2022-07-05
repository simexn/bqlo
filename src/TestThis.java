import java.util.Scanner;
public class TestThis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double usd = sc.nextInt();
        sc.close();
        double bgn = (usd * 1.64549) ;
        double round = Math.round(bgn * 100.0) / 100.0;

        System.out.println(round);
    }

}
