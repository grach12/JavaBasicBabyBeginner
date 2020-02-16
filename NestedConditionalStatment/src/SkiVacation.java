import java.util.Scanner;

public class SkiVacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var days = Integer.parseInt(scan.nextLine());
        String roomType = scan.nextLine();
        String feedback = scan.nextLine();

        double price;
        var totalPrice = 0.00;
        var finalPrice = 0.00;


        if ("room for one person".equals(roomType)) {
            price = 18.00;
            if (feedback.equals("positive")){
                totalPrice=price*(days-1);
                finalPrice=totalPrice+(totalPrice*0.25);
                System.out.printf("%.2f",finalPrice);
            }
            else if (feedback.equals("negative")){
                totalPrice=price*(days-1);
                finalPrice=totalPrice-(totalPrice*0.10);
                System.out.printf("%.2f",finalPrice);
            }
        }
        else if ("apartment".equals(roomType)&&(days<10)){
            price = 25.00;
            if (feedback.equals("positive")){
                totalPrice= (price - price * 0.30)*(days-1);
                finalPrice=totalPrice+(totalPrice*0.25);
                System.out.printf("%.2f",finalPrice);
            }
            else if (feedback.equals("negative")){
                totalPrice= (price - price * 0.30)*(days-1);
                finalPrice=totalPrice-(totalPrice*0.10);
                System.out.printf("%.2f",finalPrice);
            }

        }
        else if ("apartment".equals(roomType)&&((days>10)&&(days<15))){
            price = 25.00;
            if (feedback.equals("positive")){
                totalPrice= (price - price * 0.35)*(days-1);
                finalPrice=totalPrice+(totalPrice*0.25);
                System.out.printf("%.2f",finalPrice);
            }
            else if (feedback.equals("negative")) {
                totalPrice = (price - price * 0.35) * (days - 1);
                finalPrice = totalPrice - (totalPrice * 0.10);
                System.out.printf("%.2f", finalPrice);
            }
        }
        else if ("apartment".equals(roomType)&&((days>15))){
            price = 25.00;
            if (feedback.equals("positive")){
                totalPrice= (price - price * 0.50)*(days-1);
                finalPrice=totalPrice+(totalPrice*0.25);
                System.out.printf("%.2f",finalPrice);
            }
            else if (feedback.equals("negative")) {
                totalPrice = (price - price * 0.50) * (days - 1);
                finalPrice = totalPrice - (totalPrice * 0.10);
                System.out.printf("%.2f", finalPrice);
            }
        }
        else if ("president apartment".equals(roomType)&&(days<10)){
            price = 35.00;
            if (feedback.equals("positive")){
                totalPrice= (price - price * 0.10)*(days-1);
                finalPrice=totalPrice+(totalPrice*0.25);
                System.out.printf("%.2f",finalPrice);
            }
            else if (feedback.equals("negative")){
                totalPrice= (price - price * 0.10)*(days-1);
                finalPrice=totalPrice-(totalPrice*0.10);
                System.out.printf("%.2f",finalPrice);
            }

        }
        else if ("president apartment".equals(roomType)&&((days>10)&&(days<15))){
            price = 35.00;
            if (feedback.equals("positive")){
                totalPrice= (price - price * 0.15)*(days-1);
                finalPrice=totalPrice+(totalPrice*0.25);
                System.out.printf("%.2f",finalPrice);
            }
            else if (feedback.equals("negative")) {
                totalPrice = (price - price * 0.15) * (days - 1);
                finalPrice = totalPrice - (totalPrice * 0.10);
                System.out.printf("%.2f", finalPrice);
            }
        }
        else if ("president apartment".equals(roomType)&&((days>15))){
            price = 35.00;
            if (feedback.equals("positive")){
                totalPrice= (price - price * 0.20)*(days-1);
                finalPrice=totalPrice+(totalPrice*0.25);
                System.out.printf("%.2f",finalPrice);
            }
            else if (feedback.equals("negative")) {
                totalPrice = (price - price * 0.20) * (days - 1);
                finalPrice = totalPrice - (totalPrice * 0.10);
                System.out.printf("%.2f", finalPrice);
            }
        }

    }
}
      /*  } else if ("apartment".equals(roomType)) {
            price = 25.00;
        } else if ("president apartment".equals(roomType)) {
            price = 35.00;
        } else {
            System.out.printf("%.2f", totalPrice + (totalPrice * 0.25));
        }
        if (feedback.equals("positive")){

        if ((days < 10) && (roomType.equals("apartment"))) {
            totalPrice = (price - price * 0.30) * (days - 1);
            System.out.printf("%.2f",totalPrice+(totalPrice*0.25));

        } else if ((days>10) &&(days < 15) && (roomType.equals("apartment")))
        {
            totalPrice = (price - price * 0.35) * (days - 1);
            System.out.printf("%.2f",totalPrice+(totalPrice*0.25));

        } else if ((days > 15) && (roomType.equals("apartment")))
        {
            totalPrice = (price - price * 0.50)*(days-1);
            System.out.printf("%.2f",totalPrice+(totalPrice*0.25));
        }
        else if (roomType.equals("room for one person")){
            totalPrice=price*(days-1);
            System.out.printf("%.2f",totalPrice);
        }
        if ((days >= 0 && days < 10) && (roomType.equals("president apartment"))) {
            totalPrice = (price - price * 0.10) * (days - 1);
            System.out.printf("%.2f", totalPrice + (totalPrice * 0.25));
        }
        } else if ((days < 10) && (roomType.equals("president apartment"))) {
            totalPrice = (price - price * 0.15) * (days - 1);
            System.out.printf("%.2f",totalPrice+(totalPrice*0.25));

        } else if ((days > 15)&& (roomType.equals("president apartment"))) {
            totalPrice = (price - price * 0.20) * (days - 1);
            System.out.printf("%.2f",totalPrice+(totalPrice*0.25));
        }

        }
}



      else {

        }
        //System.out.println(totalPrice);


*/

