import java.util.Scanner;

public class Calculator {


    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        if (a>b) return a-b;
        if (a<b) return b-a;
        return 0;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }

    public static float per(float t, float s){
        return (t/s)*100;
    }

    static Scanner sc;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        System.out.println("Enter two numbers to perform arithmetic operations : ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(mul(a,b));
        System.out.println(div(a,b));
        System.out.println("Enter total marks and then scored marks for calculating percentage : ");
        float c=sc.nextFloat();
        float d =sc.nextFloat();
        System.out.println(per(88,100));
    }
}
