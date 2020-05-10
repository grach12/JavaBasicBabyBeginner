import java.util.Scanner;

public class ExamRetention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int seasons = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < seasons*2; i++) {
            n-=1.0*90/100;
            System.out.println(n);

        }

    }
}
