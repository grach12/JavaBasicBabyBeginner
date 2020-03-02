import java.util.Scanner;

public class ReadStringNewLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        for (int i = 0; i <input.length() ; i++) { //input.lenght() чете дължината , използва се вместо цифра, понеже не знаем колко ще е дълга думата
            System.out.println(input.charAt(i));
        }

    }
}
