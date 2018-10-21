public class Casting {

    public static void main(String[] args) {

        double d = 4.54;
        int i;
        short s = 8;
        i = s;// można i = (int)s;


        i = (int) d;

        System.out.println(i);
        Employee emp = new Employee();
        VicePresident veep = new VicePresident();

        emp = veep;
        veep = (VicePresident) emp;

        Float f1 = 4.23F;
        Float f2 = 6.34F;

        Integer object = null;// można przypisać wartość null do obiektu

        System.out.println(Math.min(f1, f2));

        Short se = 3;

        Integer ii = 3;











    }

    }

class Employee{}

class VicePresident extends Employee{}




