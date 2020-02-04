import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var a = Double.parseDouble(scan.nextLine());
        var inches = a*2.54;
        System.out.println(inches);
    }
}
