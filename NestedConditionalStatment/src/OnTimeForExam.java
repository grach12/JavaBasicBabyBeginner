
import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var hoursExam = Integer.parseInt(scan.nextLine())*60;
        var minutesExam = Integer.parseInt(scan.nextLine());
        var hoursIn = Integer.parseInt(scan.nextLine())*60;
        var minutesIn = Integer.parseInt(scan.nextLine());

        var timeOfExam = hoursExam+minutesExam;
        var arrivalTime = hoursIn+minutesIn;
        //до тук всичко е в минути

        if(arrivalTime>timeOfExam){
            System.out.println("Late");
        }
        else if ((timeOfExam==arrivalTime)||(arrivalTime>=timeOfExam-30)) {
            System.out.println("On time");
        }
        else if ((arrivalTime)<(timeOfExam-30)){
            System.out.println("Early");
        }


        if ((arrivalTime>timeOfExam-60)&&(arrivalTime< timeOfExam)){
            System.out.printf("%d minutes before the start", (timeOfExam-arrivalTime));
        }
        else if (arrivalTime<=timeOfExam-60){

            System.out.printf("%d:%02d hours before the start", ((timeOfExam-arrivalTime)/60), ((timeOfExam-arrivalTime)%60));
        }
        else if ((arrivalTime>timeOfExam)&&(arrivalTime < timeOfExam+60)){
            System.out.printf("%d minutes after the start", (arrivalTime-timeOfExam));
        }

        else if (arrivalTime>=timeOfExam+60){
            System.out.printf("%d:%02d hours after the start", ((arrivalTime-timeOfExam)/60), ((arrivalTime-timeOfExam)%60));
        }//  %02d  форматира int 2 знака след запетаята

    }
}


/*import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var hoursExam = Double.parseDouble(scan.nextLine())*60;
        var minutesExam = Double.parseDouble(scan.nextLine());
        var hoursIn = Double.parseDouble(scan.nextLine())*60;
        var minutesIn = Double.parseDouble(scan.nextLine());

        var timeOfExam = hoursExam+minutesExam;
        var arrivalTime = hoursIn+minutesIn;
        //до тук всичко е в минути, надявам се :)

        if(arrivalTime>timeOfExam){
            System.out.println("Late");
        }
else if ((timeOfExam==arrivalTime)||(arrivalTime>=timeOfExam-30)) {
    System.out.println("On time");
}
else if ((arrivalTime)<(timeOfExam-30)){
            System.out.println("Early");
        }


if ((arrivalTime>timeOfExam-60)&&(arrivalTime< timeOfExam)){
    System.out.printf("%.0f minutes before the start", (timeOfExam-arrivalTime));
}
else if (arrivalTime<=timeOfExam-60){

   System.out.printf("%.0f:%.0f hours before the start", Math.floor((timeOfExam-arrivalTime)/60), ((timeOfExam-arrivalTime)%60));
}
else if ((arrivalTime>timeOfExam)&&(arrivalTime < timeOfExam+60)){
    System.out.printf("%.0f minutes after the start", (arrivalTime-timeOfExam));
}

else if (arrivalTime>timeOfExam+60){
    System.out.printf("%.0f:%.0f hours after the start",Math.floor((arrivalTime-timeOfExam)/60), ((arrivalTime-timeOfExam)%60));
}

    }
}
*/
