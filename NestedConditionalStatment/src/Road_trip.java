import java.util.Scanner;

public class Road_trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        var camp = 0.00;
        var hotel = 0.00;

        if (season.equals("summer")) {
            if (budget <= 100) {
                camp = budget * 0.30;
                System.out.printf("Somewhere in Bulgaria\n" +
                        "Camp - %.2f\n", camp);
            } else if (budget <= 1000) {
                camp = budget * 0.4;
                System.out.printf("Somewhere in Balkans\n" +
                        "Camp - %.2f\n", camp);
            }
        } else if (season.equals("winter")) {
            if (budget <= 100) {
                hotel = budget * 0.70;
                System.out.printf("Somewhere in Bulgaria\n" +
                        "Hotel - %.2f\n",hotel);
            } else if (budget <= 1000) {
                hotel = budget * 0.8;
                System.out.printf("Somewhere in Balkans\n" +
                        "Hotel - %.2f\n",hotel);
            }
        }  if (budget > 1000) {
            hotel = budget * 0.9;
            System.out.printf("Somewhere in Europe\n" +
                    "Hotel - %.2f\n", hotel);
        }
    }
}