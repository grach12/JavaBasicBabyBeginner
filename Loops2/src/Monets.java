import java.util.Scanner;

public class Monets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
      money = Math.floor(money *100); //защо без него не работи?
        int counter = 0;

        while (money > 0) {
            if (money >= 200) {
                counter++;
                money -= 200;
            } else if (money >= 100) {
                counter++;
                money -= 100;
            } else if (money >= 50) {
                counter++;
                money -= 50;
            } else if (money >= 20) {
                counter++;
                money -= 20;
            } else if (money >= 10) {
                counter++;
                money -= 10;
            } else if (money >= 5) {
                counter++;
                money -= 5;
            } else if (money >= 2) {
                counter++;
                money -= 2;
            } else if (money >= 1) {
                counter++;
                money -= 1;
            }
        }
        System.out.println(counter);
    }
}
