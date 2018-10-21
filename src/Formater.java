import java.util.Locale;

public class Formater {
    public static void main(String[] args) {

        int i = 968555565;
        String s ="Jakiś napis";
        double d = Math.PI;





        System.out.printf("%20d",i);
        System.out.printf("%20s",s);
        System.out.printf(new Locale("us"),"%10.50f\n",d);//bez tego są ustawienia lokalne
        System.out.println(d);






    }

}
