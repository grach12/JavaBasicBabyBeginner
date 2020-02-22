import java.util.Scanner;

public class NumberFromNto1reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var n = Integer.parseInt(scan.nextLine());

        for (int i = n ; i>=1; i--){
            System.out.println(i);
        }
    }
}
