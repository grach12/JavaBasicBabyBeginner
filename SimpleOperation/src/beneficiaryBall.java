import java.util.Scanner;

public class beneficiaryBall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var days = Double.parseDouble(scan.nextLine());
        var workers = Double.parseDouble(scan.nextLine());
        var cakeNum = Double.parseDouble(scan.nextLine());
        var gofreeNum = Double.parseDouble(scan.nextLine());
        var paneCakeNum = Double.parseDouble(scan.nextLine());

        var cake = cakeNum*45;
        var gofree = gofreeNum*5.80;
        var paneCake = paneCakeNum*3.2;

        double totalDay = (cake+gofree+paneCake)*workers;
        double benefficiarySum = totalDay*days;
        double totalExpencess = benefficiarySum-(benefficiarySum/8);


        System.out.printf("%.2f",totalExpencess);

    }
}
