import java.util.Scanner;

public class NumberInterval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var number = Integer.parseInt(scan.nextLine());

        if ((number>=-100)&&(number<=100)&&(number!= 0)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
