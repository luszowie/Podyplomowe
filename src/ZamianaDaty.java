import java.util.StringTokenizer;

public class ZamianaDaty {
    public static void main(String[] args) {

        Object o = new Object();

        StringTokenizer st1;

        String quote1 = "21/10/2018 ";
        st1 = new StringTokenizer(quote1,"/");
        System.out.println("Dzień: " + st1.nextToken());
        System.out.println("Miesiąc: "+ st1.nextToken());
        System.out.println("Rok: " + st1.nextToken());
    }


}
