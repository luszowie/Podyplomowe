public class zadanie {
    public static void main(String[] args) {
        int a = 14000;
        double c = a * .4;
        double d = a + c;
        double e = (d - 1500);
        double f = (e * 0.12);

        System.out.println("zysk po rokou: " + c + " zł");
        System.out.println("razem po roku: " + d+ " zł");
        System.out.println("strata po drugim roku: " + e+ " zł");
        System.out.println("zysk po trzecim roku: " + f+ " zł");

//int m = 100;
//        System.out.println("szesnastkowy:  " +  Integer.toHexString(m));
//        System.out.println("ósemkowy:  " +  Integer.toOctalString(m));
//        System.out.println("dwójkowy:  " +  Integer.toBinaryString(m));
    }

}
