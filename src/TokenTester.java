import java.util.StringTokenizer;

public class TokenTester {
    public static void main(String[] args) {

        Object o = new Object();

        StringTokenizer st1, st2;

        String quote1 = "Google; 530,80 -9,98";
        st1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + st1.nextToken());
        System.out.println(st1.nextToken());
        System.out.println(st1.nextToken());

        String quote2 = "RHT@75,008,@22";
                st2 = new StringTokenizer(quote2, "@");
        System.out.println("Token 1: " + st2.nextToken());
        System.out.println(st2.nextToken());
        System.out.println(st2.nextToken());










    }

}
