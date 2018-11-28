import java.util.Scanner;
class PrimeNumber_1
{
    public static void main(String args[])
    {
        int temp=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter positive Integer:");
        int num=scan.nextInt();
        for(int i=2;i<=num-1;i++)
        {
            if (num % i == 0) ;
            {
                temp=temp+1;
            }
        }
        if (temp==0) {
            System.out.println(num + " is a Prime Number");
        }
        else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}