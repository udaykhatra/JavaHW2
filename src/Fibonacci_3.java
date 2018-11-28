public class Fibonacci_3 {

        public static void main(String[] args) {
            System.out.println();

            int n = 10, t1 = 1, t2 = 1;
            System.out.print("First " + n + " terms: ");

            for (int i = 1; i <= n; ++i)
            {
                System.out.print(t1 + " + ");

                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }
}












