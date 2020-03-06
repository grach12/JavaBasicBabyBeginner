import java.util.Scanner;

public class SumOfNumbersTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        String readtext = scan.nextLine();

        while (!"Stop".equals(readtext)){
            int number = Integer.parseInt(readtext); //превръщаме Int в Текст
            sum = number+sum; //при въвеждане на Stop сумираме числата
            readtext = scan.nextLine(); //след въвеждане на Stop , без него ще имаме безкраен цикъл
        }
        System.out.println(sum);
    }
}
