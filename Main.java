import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if (A + B <= C || A + C <= B || B + C <= A) {
            System.out.println("Треугольник составить нельзя");
        } else {
            if (A == B && B == C) {
                System.out.println("Равносторонний");
            } else if (A == B || A == C || B == C) {
                System.out.println("Равнобедренный");
            } else if (A * A + B * B == C * C ||
                    A * A + C * C == B * B ||
                    B * B + C * C == A * A) {
                System.out.println("Прямоугольный");
            } else {
                System.out.println("Разносторонний");
            }
        }
    }
}
