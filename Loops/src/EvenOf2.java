import java.util.Scanner;

public class EvenOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i=n; i<=n%2; i++){
            System.out.println(i);
        }

    }
}
