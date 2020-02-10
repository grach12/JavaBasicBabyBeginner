import java.util.Scanner;

public class TimePlus15min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var startHours = Integer.parseInt(scan.nextLine());
        var startMinutes = Integer.parseInt(scan.nextLine());

var minutes = startHours*60+startMinutes;
var timePlus15 = minutes+15;

int finalHour = timePlus15 / 60;
int finalMinutes = timePlus15 % 60;

if (finalHour>=24){
    finalHour = finalHour-24;
}
if (finalMinutes<10){
    System.out.printf("%d:0%d",finalHour,finalMinutes );
}
else {
    System.out.printf("%d:%d", finalHour, finalMinutes);
}


    }
}
