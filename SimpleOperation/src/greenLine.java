import java.util.Scanner;

public class greenLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var squareMeters = Double.parseDouble(scan.nextLine());

var discount = (squareMeters*7.61)*0.18;
     var fibnalPrice =   (Math.abs(discount-squareMeters*7.61)); // Math.abs - абсолютна стойност
        System.out.printf("The final price is: %.2f lv. %n", fibnalPrice); //%n - се слага за нов ред
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
