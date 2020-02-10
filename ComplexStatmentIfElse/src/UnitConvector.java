import java.util.Scanner;

public class UnitConvector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var numberToConvert = Double.parseDouble(scan.nextLine());

        String inMetric = scan.nextLine();
        String toConvert = scan.nextLine();
        /*
        if (inMetric== "mm") {   защо не работи като "mm".equals(inMetric)
            numberToConvert = numberToConvert/1000;
        }
        */
        if ("mm".equals(inMetric)){
        numberToConvert = numberToConvert / 1000;
    }
        else if ("cm".equals(inMetric)){
numberToConvert = numberToConvert/100;
        }
        if ("mm".equals(toConvert)) {
            numberToConvert = numberToConvert * 1000;
        }
            else if ("cm".equals(toConvert)){
                    numberToConvert = numberToConvert*100;
            }
        System.out.printf("%.3f",numberToConvert);

    }
}
