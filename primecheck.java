// prime number checking efficient method
/*
check whether the number is divisibe by 2 or not
if not then run a loop from 3 to square root of n updating +2 times every time
bcoz we already eliminated multiples of 2 in the first case.
if any number from the loop divides the number which is to be checked,
we break the loop and print it as not a prime
else we return that it is a prime.
 */
/*Time complexity: O(sqrt(n)) */
import java.util.*;
class primecheck
{
    public static void prime(int n) {
        if(n%2==0)
        System.out.println("Not a prime number");
        else
        {
            for(int i=3;i<=Math.sqrt(n);i=i+2)
            {
                if(n%i==0)
                {
                    System.out.println("Not a prime");
                    n=-1;
                    break;
                }
            }
            if(n!=-1)
            System.out.println("Prime no.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
        sc.close();
    }
}