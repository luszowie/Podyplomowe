import java.awt.*;

public class PoinySetter {
    public static void main(String[] args) {

        Point location = new Point (4, 13);
        System.out.println("połozenie początkowe: ");
        System.out.println("x równe: " +location.x);
        System.out.println("y równe: "  + location.y);

        System.out.println("przejście 6,7");
        location.x =7;
        location.y = 6;
        System.out.println("połozenie początkowe: ");
        System.out.println("x równe: " +location.x);
        System.out.println("y równe: "  + location.y);



    }
}
