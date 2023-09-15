import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double userValue;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input price of purchase ");
        userValue = scan.nextInt();
        userValue += 0.05*userValue;
        System.out.println("Your purchase with 5% sales tax is " + userValue + ".");
    }
}