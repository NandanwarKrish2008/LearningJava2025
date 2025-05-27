import java.util.Scanner;

public class OTP_04_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number --> ");
        int a = sc.nextInt();

        System.out.print("Enter your second number --> ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("The sum is --> " + sum);
    }
}
