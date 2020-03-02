import java.util.Scanner;

public class SmartLili {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        var liilyAge = Integer.parseInt(scan.nextLine());
        double priceWashing = Double.parseDouble(scan.nextLine());
        int priceToy = Integer.parseInt(scan.nextLine());
int toyCount=0;
double liliMoney = 0.0;
int moneyForBDay = 10;
        for (int i = 1; i <=liilyAge ; i++) {
            if (i %2==0){ // проверяваме дали възрастта на Лили(i) е четна
             liliMoney=moneyForBDay+liliMoney-1; // искам да разбера не може и по този начин  liliMoney = liliMoney+(i+10); и вадим 1 лев , който взима брат и
                moneyForBDay= moneyForBDay+10;  // подготваме парите за рожден ден за следваща стъпка
            }
            else {
                toyCount++; // това е същото като toyCount = toyCount+1;
            }
        }
        double moneyFromTOys = toyCount*priceToy; // можем ли да го инициализираме в началото ?
        liliMoney = liliMoney+moneyFromTOys;
        if (liliMoney>=priceWashing){
            double moneyLeft = liliMoney-priceWashing;
            System.out.printf("Yes! %.2f", moneyLeft);
        }
        else {
            double moneyNeed = priceWashing-liliMoney;
            System.out.printf("No! %.2f", moneyNeed);
        }
    }
}

