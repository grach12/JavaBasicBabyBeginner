import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyNeed = Double.parseDouble(scan.nextLine());
        double moneyJessy = Double.parseDouble(scan.nextLine());

        int day = 0;
        int sum = 0;

        while (moneyJessy<moneyNeed&&sum<5) {
            String command = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            day++;

            if ("save".equals(command)) {
                moneyJessy += money;
                sum = 0;
            } else if ("spend".equals(command)) {
                moneyJessy -= money;
                sum += 1;
                if (moneyJessy < 0) {
                    moneyJessy = 0;
                }
            }
        }
        if (sum==5){
            System.out.printf("You can't save the money.%n%d", day);
        }
        if (moneyJessy>=moneyNeed){
            System.out.printf("You saved the money for %d days.",day);
        }
    }
}
