import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var lenght = Double.parseDouble(scan.nextLine());
        var width = Double.parseDouble(scan.nextLine());
        var hight = Double.parseDouble(scan.nextLine());
        var percent = Double.parseDouble(scan.nextLine());

        var volume = lenght*width*hight;
        var totalVolume = volume*0.001;
        var percent1 = percent*0.01;
        var totalLiters = totalVolume*(1-percent1);

        System.out.printf("%.3f", totalLiters);

    }
}
