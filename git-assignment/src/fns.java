import javax.lang.model.util.ElementScanner6;

public class fns {
    public static void main(String[] args) throws Exception {
        fibonacci(7);
        System.out.println();
        fizzbuzz(15);
    }

    public static void fibonacci(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    public static void fizzbuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("FIZZBUZZ ");
            else if (i % 3 == 0)
                System.out.print("FIZZ ");
            else if (i % 5 == 0)
                System.out.print("BUZZ ");
            else
                System.out.print(i + " ");

        }
    }
}
