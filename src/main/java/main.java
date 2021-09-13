import java.util.Scanner;

public class main {
    public static void main(String[] args){
        final int gallon = 350;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the ceiling in feet?");
        double length = scanner.nextDouble();
        System.out.println("What is the width of the ceiling in feet?");
        double width = scanner.nextDouble();
        double sq_ft = length*width;
        double gallons_needed = sq_ft / gallon;
        double gallons_purchased = Math.ceil(gallons_needed);
        System.out.println("You will need to purchase "+gallons_purchased+" of paint to cover " +
                sq_ft+" square feet.");
    }
}
