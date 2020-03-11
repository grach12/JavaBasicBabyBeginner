import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int goal = 10000;
        int sum =0;

        while (true) {
            String goHome = scan.nextLine();
            if (goHome.equals("Going home")) {
                int num = Integer.parseInt(scan.nextLine());
                sum += num;
                break;
            }
            int num = Integer.parseInt(goHome);
            sum += num;
            if (sum>=goal){
                break;
            }
        }
        if (sum>=goal){
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.",(goal - sum) );
        }
    }
}