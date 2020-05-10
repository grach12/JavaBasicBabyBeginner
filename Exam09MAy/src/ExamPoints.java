import java.util.Scanner;

public class ExamPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int task = Integer.parseInt(scan.nextLine());
        double points = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();

switch (input){
    case "Basics" : if (task==1){points*=8*0.8;}
     else if (task==2){points*=9;}
     else if (task==3){points*=9;}
     else if (task==4){points*=10;}
     break;

    case "Fundamentals" : if (task==1){points*=11;}
    else if (task==2){points*=11;}
    else if (task==3){points*=12;}
    else if (task==4){points*=13;}
        break;

    case "Advanced" : if (task==1){points*=14*1.2;}
    else if (task==2){points*=14*1.2;}
    else if (task==3){points*=15*1.2;}
    else if (task==4){points*=16*1.2;}
        break;
}

        double result = points/100;

        System.out.printf("Total points: %.2f",result);
    }
}

