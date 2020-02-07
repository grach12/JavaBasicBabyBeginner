import java.util.Scanner;

public class danceRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var L = Double.parseDouble(scan.nextLine());
        var W = Double.parseDouble(scan.nextLine());
        var A = Double.parseDouble(scan.nextLine());

        var hall = L*100*W*100;
        var wardrobe = A*100*A*100;
        var bench = hall/10;
        var freeSpace = hall-wardrobe-bench;
        var dancers = Math.floor(freeSpace/(40+7000));

        System.out.printf("%.0f",dancers);

}
}
