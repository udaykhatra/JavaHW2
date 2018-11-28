public class NestedLoop_11 {
    public static void main(String[] args) {

        int a, b, c = 5;
        for (a = 0; a < c; a++) {


            for (b = 0; b <= a; b++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

