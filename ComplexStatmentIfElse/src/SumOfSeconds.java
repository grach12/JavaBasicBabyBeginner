import java.util.Scanner;

public class SumOfSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var athlet1 = Integer.parseInt(scan.nextLine());
        var athlet2 = Integer.parseInt(scan.nextLine());
        var athlet3 = Integer.parseInt(scan.nextLine());

        int minutes = (athlet1+athlet2+athlet3)/60;
        int seconds = (athlet1+athlet2+athlet3)%60;//Използвайте деление с остатък (%), за да вземете остатъка при деление с 60


        if (seconds < 10) { //работи и с if (seconds>60) но дава грешка в if
            System.out.printf("%d:%02d", minutes, seconds); //шаблона %02d, чрез който можем да покажем, че искаме нашето цяло число (секундите) да се състои от две цифри:
        }
        else {
            System.out.printf("%d:%02d",minutes,seconds);  //и шаблонът за цяло число %d.
        }

    }
}
