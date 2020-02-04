import java.util.Scanner;

public class ArchProect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        Scanner number = new Scanner(System.in);
        int a = Integer.parseInt(number.nextLine());
        int project = a*3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s." ,name, project , a);
    }
}
