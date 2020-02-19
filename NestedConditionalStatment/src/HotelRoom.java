import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        var nights = Integer.parseInt(scan.nextLine());

        var studioPrice = 0.0;
        var apartmentPrice = 0.0;


        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;

                if (nights > 14) {
                    apartmentPrice = (apartmentPrice - apartmentPrice * 0.1) * nights;
                    System.out.printf("Apartment: %.2f lv.%n",apartmentPrice);
                } else {
                    System.out.printf("Apartment: %.2f lv.%n",(apartmentPrice * nights));
                }

                if ((nights > 7) && (nights < 14)) {
                    studioPrice = (studioPrice - studioPrice * 0.05) * nights;
                    System.out.printf("Studio: %.2f lv.",studioPrice);
                } else if (nights > 14) {
                    studioPrice = (studioPrice - studioPrice * 0.30) * nights;
                    System.out.printf("Studio: %.2f lv.",studioPrice);
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nights > 14) {
                    apartmentPrice = (apartmentPrice - apartmentPrice * 0.1) * nights;
                    System.out.printf("Apartment: %.2f lv.%n",apartmentPrice);
                } else {
                    System.out.printf("Apartment: %.2f lv.%n", (apartmentPrice * nights));
                }

                if (nights > 14) {
                    studioPrice = (studioPrice - studioPrice * 0.20) * nights;
                    System.out.printf("Studio: %.2f lv.", studioPrice);
                } else {
                    System.out.printf("Studio: %.2f lv.", studioPrice * nights);
                }
                break;
            case "July":
            case "August":
                studioPrice = 76.00;
                apartmentPrice = 77.00;
                if (nights > 14) {
                    apartmentPrice = (apartmentPrice - apartmentPrice * 0.1) * nights;
                    System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
                } else {
                    System.out.printf("Apartment: %.2f lv.%n",(apartmentPrice * nights));
                }

                System.out.printf("Studio: %.2f lv.", (studioPrice * nights));
                break;
        }
        }

    }

