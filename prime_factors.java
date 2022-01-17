// print all the prime factors of a number
/*
We will reduce given number to odd number
After which we will start checking its divisibily from 3 to sqrt(n)
by increasing our counter by 2 as we can skip checking even nos.
At last we check for the special condition if n itself is the prime number.
 */
import java.util.*;
class prime_factors
{
    public static void primefactors(int n)
    {
        if(n%2==0)
        {
            System.out.print(2+" ");
            // converts n to odd no
            while(n%2==0)
            {
                n=n/2;
            }
        }
        int c=0;
        //we can skip one element as n is odd now
        for(int i=3;i<=Math.sqrt(n);i=i+2)
        {
            while(n%i==0)
            {
                c=i;
                n=n/i;
            }
            if(c>0)
            {
                System.out.print(c+" ");
                c=0;
            }
        }
        // handles condition when n is itself a prime no
        if(n>2)
        System.out.print(n);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        primefactors(n);
        sc.close();
    }
}