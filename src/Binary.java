public class Binary {

    public static void main(String[] args) {

        int a = 6;
        int b = 5;
        int c = calculate(a, b);
        show(a, b, c);

        System.out.printf("%10s\n", Integer.toBinaryString(5));
        System.out.printf("%10s\n", Integer.toBinaryString(5 << 3));


    }


    static void show(int a, int b, int c) {
        System.out.println("operacja " + a + "|" + b + " = " + c);
        System.out.printf("%50s\n", Integer.toBinaryString(a));
        System.out.printf("%50s\n", Integer.toBinaryString(b));
        System.out.println("----------");
        System.out.printf("%50s\n", Integer.toBinaryString(a & b));
        System.out.println(c);

    }

    static int calculate(int a, int b) {
        return a | b;
    }
       {



    }


}


















