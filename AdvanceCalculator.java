import java.util.Scanner;

public class AdvanceCalculator {

    static Scanner sc;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        double a=sc.nextDouble();
        System.out.println(Math.log(a));


        System.out.println("To find sin value enter a number : ");
        double b =sc.nextDouble();
        double c=Math.toRadians(b);
        System.out.println(Math.sin(c));
    }
}
