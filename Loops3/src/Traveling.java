import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();

        while (!"End".equals(destination)){
            double target = Double.parseDouble(scan.nextLine());
            double currentSum = 0;

            while (currentSum<target){
                double money = Double.parseDouble(scan.nextLine());
                currentSum+=money;
            }
            System.out.printf("Going to %s!%n", destination);
            destination= scan.nextLine();
        }

        }


}
