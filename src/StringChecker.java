public class StringChecker {
    public static void main(String[] args) {

        String str = "Lannister zawsze spłaca swoje długi.";
        System.out.println("Tekst to: " + str);
        System.out.println("długość tekstu: "+ str.length() +" znaków");
        System.out.println("Znak na poz. 6: " + str.charAt(6));
        System.out.println("fragment od znaku 10 do 16: " + str.substring(10, 16));
        System.out.println("Index pierwszej litery 't'" + str.indexOf('t'));
        System.out.println("index pierwszego podtekstu: \"długi\": " + str.indexOf("długi"));
        System.out.println("tekst zapisany wielkimi literami: " + str.toUpperCase() );







    }
}
