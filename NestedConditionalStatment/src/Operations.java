import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var N1 = Double.parseDouble(scan.nextLine());
        var N2 = Double.parseDouble(scan.nextLine());
        var plus = N1+N2;
        var minus = N1-N2;
        var multiply = N1*N2;
        String operator = scan.nextLine();

        switch (operator){
            case "+": if (plus%2==0) {
                System.out.printf("%.0f + %.0f = %.0f - even", N1, N2, N1 + N2);
            }
            else{
                System.out.printf("%.0f + %.0f = %.0f - odd", N1, N2, N1 + N2);
            }
                break;
            case "-": if (minus%2==0) {
                System.out.printf("%.0f - %.0f = %.0f - even", N1, N2, N1 - N2);
            }
            else {
                System.out.printf("%.0f - %.0f = %.0f - odd", N1, N2, N1 - N2);
            }
            break;
            case "*": if (multiply%2==0){
                System.out.printf("%.0f * %.0f = %.0f - even",N1, N2, N1*N2);
            }
            else {
                System.out.printf("%.0f * %.0f = %.0f - odd",N1, N2, N1*N2);
            }
                break;
            case "/": if (N2!=0) {
                System.out.printf("%.0f / %.0f = %.2f", N1, N2, N1 / N2);
            }
            else {
                System.out.printf("Cannot divide %.0f by zero", N1);
            }
            break;
            case "%": if (N2!=0) {
                System.out.printf("%.0f %% %.0f = %.0f", N1, N2, N1 % N2);
            }
            else {
                System.out.printf("Cannot divide %.0f by zero", N1);
            }
            break;

           /* default: if (operator.equals("/")) {
                System.out.printf("Cannot divide %d by zero", N1);
            }
            if (operator.equals("%")) {
                System.out.printf("Cannot divide %d by zero",N1);
            }
*/

        }
    }
}
