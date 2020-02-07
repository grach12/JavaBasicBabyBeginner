import java.util.Scanner;

public class tailorCorp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var rectTable = Double.parseDouble(scan.nextLine());
        var lenghTable = Double.parseDouble(scan.nextLine());
        var widTable = Double.parseDouble(scan.nextLine());

        var area = rectTable*(lenghTable+2*0.3)*(widTable+2*0.3);
        var kare = rectTable*(lenghTable/2)*(lenghTable/2);

        var priceUSD = area*7+kare*9;
        var priceBGN = priceUSD*1.85;

        System.out.printf("%.2f USD%n",priceUSD);
        System.out.printf("%.2f BGN", priceBGN);
    }
}
