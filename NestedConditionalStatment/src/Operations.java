import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var N1 = Integer.parseInt(scan.nextLine());
        var N2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        switch (operator){
            case "+":
                System.out.printf("%d + %d = %d",N1, N2, N1+N2);
                break;
            case "-":
                System.out.printf("%d + %d = %d",N1, N2, N1+N2);
                break;

        }
    }
}
