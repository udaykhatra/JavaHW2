import java.util.Scanner;

public class DivisibleNum_12{
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the limit of Loop: ");
        int n = ob.nextInt();

        System.out.println("Numbers Divisible by 3: ");
        for (int i=0; i<=n; i++){
            if(i%3 == 0){
                System.out.print(i+" ");
            }
        }

        System.out.println("\nNumbers Divisible by 5: ");
        for (int i=0; i<=n; i++){
            if(i%5 == 0){
                System.out.print(i+" ");
            }
        }







    }}
