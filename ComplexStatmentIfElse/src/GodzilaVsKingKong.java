import java.util.Scanner;

public class GodzilaVsKingKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var budgetMovie = Double.parseDouble(scan.nextLine());
        var statistCount = Integer.parseInt(scan.nextLine());
        var priceCloth = Double.parseDouble(scan.nextLine());

        var decorPrice = budgetMovie*0.1;
        priceCloth = priceCloth*statistCount;

        if (statistCount>150){
priceCloth= priceCloth-priceCloth*0.1;
        }

        var totalMoney = decorPrice+priceCloth;
        System.out.println(totalMoney);
        var needMore= budgetMovie-totalMoney;

                if (totalMoney<budgetMovie) {
                    System.out.println("Action!");
                    System.out.printf("Wingard starts filming with %.2f leva left", Math.abs(needMore));
                }
                else {
                    System.out.println("Not enough money!");
                    System.out.printf("Wingard needs %.2f leva more.", Math.abs(needMore));
                }
    }
}
