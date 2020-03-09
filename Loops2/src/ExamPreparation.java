import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int failedTreshold = Integer.parseInt(scan.nextLine());

        int failedTimes = 0;
        String nameTask = "";
        int successTask = 0;
        double sumAll = 0.0;
        boolean failed = true;

while (failedTimes<failedTreshold){
    String problemName = scan.nextLine();
    if ("Enough".equals(problemName)){
        failed=false;
        break;
    }
int grade = Integer.parseInt(scan.nextLine());
    if (grade<=4){
        failedTimes++;
    }
    sumAll=grade+sumAll;
    successTask++;
    nameTask=problemName;

}
if (failed){
    System.out.printf("You need a break, %d poor grades." , failedTreshold );
}else{
    System.out.printf("Average score: %.2f%n", sumAll/successTask);
    System.out.printf("Number of problems: %d%n", successTask);
    System.out.printf("Last problem: %s", nameTask);
}

    }
}
