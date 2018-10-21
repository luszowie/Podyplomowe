import java.sql.SQLOutput;

public class FamilyMember {
    static String surname = "Nowak";
    String name;
    int age;


    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.age = 27;
        dad.name = "Jan";
        //dad.surname = "Kowalski";
        FamilyMember.surname = "Kowalski";

        FamilyMember mum = new FamilyMember();
        mum.age = 25;
        mum.name = "Agata";

        System.out.println( "Tata " + dad.name + " " + dad.surname + FamilyMember.surname + " " + dad.age);
        System.out.println( "Mama " + mum.name + " " + mum.surname + FamilyMember.surname + " " + mum.age);






    }
}
