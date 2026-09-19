import java.util.Scanner;
public class sum {
    int a, b, sum;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }
    void calculate() {
        System.out.println("Sum is : " + (a + b));
    }
}
