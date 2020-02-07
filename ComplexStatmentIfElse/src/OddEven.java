import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var number = Double.parseDouble(scan.nextLine());

        if (number%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
