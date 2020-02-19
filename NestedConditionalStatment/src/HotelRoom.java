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
                    System.out.println(apartmentPrice);
                } else {
                    System.out.println(apartmentPrice * nights);
                }

                if ((nights > 7) && (nights < 14)) {
                    studioPrice = (studioPrice - studioPrice * 0.05) * nights;
                    System.out.println(studioPrice);
                } else if (nights > 14) {
                    studioPrice = (studioPrice - studioPrice * 0.30) * nights;
                    System.out.println(studioPrice);
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nights > 14) {
                    apartmentPrice = (apartmentPrice - apartmentPrice * 0.1) * nights;
                    System.out.println(apartmentPrice);
                } else {
                    System.out.println(apartmentPrice * nights);
                }

                if (nights > 14) {
                    studioPrice = (studioPrice - studioPrice * 0.30) * nights;
                    System.out.println(studioPrice);
                } else {
                    System.out.println(studioPrice * nights);
                }
                break;
//надолу да се прегледа
            case "July":
            case "August":
                studioPrice = 76.00;
                apartmentPrice = 77.00;
                if (nights > 14) {
                    apartmentPrice = (apartmentPrice - apartmentPrice * 0.1) * nights;
                    System.out.println(apartmentPrice);
                } else {
                    System.out.println(apartmentPrice * nights);
                }

                System.out.println(studioPrice * nights);
                break;
        }
        }

    }

