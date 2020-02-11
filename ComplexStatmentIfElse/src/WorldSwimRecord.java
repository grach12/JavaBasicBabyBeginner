import java.util.Scanner;

public class WorldSwimRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var presentRecord = Double.parseDouble(scan.nextLine());
        var distanceToSwim = Double.parseDouble(scan.nextLine());
        var ivanLengh = Double.parseDouble(scan.nextLine());

        double ivanTime = distanceToSwim*ivanLengh;
        double delay = Math.floor(distanceToSwim/15)*12.5;
        double totalTime = ivanTime+delay;
       // System.out.println(delay);

        if (presentRecord<totalTime){

            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime-presentRecord);
        }
        else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
            }

    }
}
