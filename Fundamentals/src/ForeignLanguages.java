import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String country = scan.nextLine();

        if (("USA".equals(country))||("England".equals(country))){
            System.out.println("English");
        }else  if ("Spain".equals(country)|| "Argentina".equals(country)||"Mexico".equals(country)){
            System.out.println("Spanish");
        }

        else {
            System.out.println("unknown");
        }
    }
}
