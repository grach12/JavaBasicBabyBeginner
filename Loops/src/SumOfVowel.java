import java.util.Scanner;

public class SumOfVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {

            char letter = text.charAt(i); //слагаме i, за да взимам всеки път следваща буква
            switch (letter) {
                case 'a':
                    sum = sum+1;
                    break;
                case 'e':
                    sum = sum+2;
                    break;
                case 'i':
                    sum=sum+3;
                    break;
                case 'o':
                    sum=sum+4;
                    break;
                case 'u':
                    sum = sum +5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
