import java.util.Scanner;

public class ExamCategories {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hard = Integer.parseInt(scan.nextLine());
        int round = Integer.parseInt(scan.nextLine());
        int page = Integer.parseInt(scan.nextLine());


        if ((hard >= 80) && (round >= 80) && (page >= 8)) {
            System.out.println("Legacy");
        } else if ((hard >= 80) && (round <= 10)) {
            System.out.println("Master");
        } else if ((hard <= 10)) {
            System.out.println("Elementary");
        } else if ((hard <= 30) && (page <= 1)) {
            System.out.println("Easy");
        } else if ((round >= 50) && (page >= 2)) {
            System.out.println("Hard");
        } else {
            System.out.println("Regular");
        }
    }
}
