import java.util.Scanner;
public class SumofSeries_4 {
    public static void main(String[] args)
    {
        double sum = 0;
        int n;
        System.out.println("2! + 1/2 + 1/3 + 1/4+1/5! + ....1/N!");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of terms in series:");
        n = s.nextInt();
        SumofSeries_4 obj = new SumofSeries_4();
        for(int i = 1; i <= n; i++)
        {
            sum = sum + (double)i / (obj.fact(i));
        }
        System.out.println("Sum of series:"+sum);
    }
    int fact(int x)
    {
        int mul = 1;
        while(x > 0)
        {
            mul = mul * x;
            x--;
        }
        return mul;
    }
}