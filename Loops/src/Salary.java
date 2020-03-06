import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double salary = Double.parseDouble(scan.nextLine());

        //String a = "Facebook";
        //String b = "Instagram";
        //String c = "Reddit";

        for (int i = 1; i <=n ; i++) {
            String name = scan.nextLine();

            if (name.equals("Facebook")) {
                salary = salary - 150;
            }
            if (name.equals("Instagram")) {
                salary = salary - 100;
            }
            if (name.equals("Reddit")) {
                salary = salary - 50;
            }
            else if (salary<=0){
                System.out.println("You have lost your salary.");
            return;} // с return излизам от кода

        }
        System.out.printf("%.0f",salary);
    }
}
