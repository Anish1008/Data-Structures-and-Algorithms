// Java program to print all
// primes smaller than or equal to
// n using Sieve of Eratosthenes

/*pseudo code:
create an array of size n+1 consisting of all 0s
start traversing the array from index-2
if(arr[i]==0)
mark all the multiples of i starting from i*i as 1
at last print all the index whose values are still 0
*/
/*
Time Complexity:
(N/2+N/3+N/5+N/7+....)=O(nlog(log n))
*/


import java.util.*;
class sieve_of_erastosthenes
{
    public static void Sieve_erastosthenes(int n)
    {
        int prime[]=new int[n+1];
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i]==0)
            {
                for(int j=i*i;j<=n;j=j+i)
                {
                    prime[j]=1;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==0)
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Sieve_erastosthenes(n);
        sc.close();
    }
}