public class ArmstrongNo_2 {

    public static void main(String []args){
            int i=0,j=0,k=0,sum=0,num=0,digit=0;
            for(i=1;i<500;i++)
            {
                if(i<=9)
                {
                    j=1;
                }
                else if(i<=99)
                {
                    j=2;
                }
                else
                {
                    j=3;
                }
                sum=0;num=i;

                for(k=1;k<=j;k++)
                {
                    digit = num%10;
                    num /=10;
                    sum +=digit*digit*digit;
                }

                if(sum == i)
                {
                    System.out.println(i+" is an Armstrong Number!");
                }}}}