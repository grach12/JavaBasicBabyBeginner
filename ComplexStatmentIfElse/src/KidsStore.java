import com.sun.source.doctree.SummaryTree;

import javax.swing.*;

/*Вход
Изход
Обяснения
40.8
20
25
30
50
10
Yes! 418.20 lv left.
Сума: 20 * 2.60 + 25 * 3 + 30 * 4.10 + 50 * 8.20 + 10 * 2 = 680 лв.
Брой на играчките: 20 + 25 + 30 + 50 + 10 = 135
135 > 50 => 25% отстъпка; 25% от 680 = 170 лв. отстъпка
Крайна цена: 680 – 170 = 510 лв.
Наем: 10% от 510 лв. = 51 лв.
Печалба: 510 – 51 = 459 лв.
459 > 40.8 => 459 – 40.8 = 418.20 лв. остават
Вход
Изход
Обяснения
320
8
2
5
5
1
Not enough money! 238.73 lv needed.
Сума: 90.3 лв.
Брой на играчките: 21
21 < 50 => няма отстъпка
Наем: 10% от 90.3 = 9.03 лв.
Печалба: 90.3 – 9.03 = 81.27 лв.
81.27 < 320 => 320 – 81.27 = 238.73 лв. не достигат
*/


import java.util.Scanner;

public class KidsStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var excursionPrice = Double.parseDouble(scan.nextLine());

        var puzzlesCount = Integer.parseInt(scan.nextLine());
        var dollsCount = Integer.parseInt(scan.nextLine());
        var bearsCount = Integer.parseInt(scan.nextLine());
        var minionsCount = Integer.parseInt(scan.nextLine());
        var trucksCount = Integer.parseInt(scan.nextLine());

        var priceToys = puzzlesCount*2.60+dollsCount*3+bearsCount*4.10+minionsCount*8.20+trucksCount*2;
        int toys = (puzzlesCount+dollsCount+bearsCount+minionsCount+trucksCount);

        double discount = 0;


        if (toys>=50) {
            discount = priceToys * 0.25;
        }
            var totalPrice = (priceToys - discount);
            var rent = totalPrice * 0.1;
            var profit = totalPrice - rent;
            var rest = profit - excursionPrice;

            //System.out.println(profit);
             if (profit > excursionPrice) {
                 System.out.printf("Yes! %.2f left", rest);
             }
         //   else {
                // var rest = excursionPrice - profit;
           //      System.out.printf("Not enought money! %.2f need", (excursionPrice-profit));
        else{
            // var rest = excursionPrice - profit;
             System.out.printf("Not enought money! %.2f need", (excursionPrice-profit));
        }
        //System.out.println(discount);
    }
}
