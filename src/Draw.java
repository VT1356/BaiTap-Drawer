import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        rect(10);
        triagleUp(10);
        triagleDown(10);

    }

    static void rect(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println("\n");
        }

    }

    static void triagleUp(int n) {
        String printe = "";
        for (int i = 0; i < n; i++) {
            printe += "*";
            System.out.print(printe);
            System.out.println("\n");
        }
    }

    static void triagleDown(int n) {
        String printe = "";
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= (n - i); j++) {
                printe += "*";
            }
            System.out.print(printe);
            System.out.println("\n");
            printe = "";
        }

    }
}
