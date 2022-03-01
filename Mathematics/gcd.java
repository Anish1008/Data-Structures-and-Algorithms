//gcd by euclid algorithm
/*
Consider two positive integer m and n, m>n.
--> Divide m/n and let the remainder be r
--> if r=0, n is the gcd
--> if r>0, m=n, n=r(repeat the three steps again till r=0)

*/
/*
Time complexity:O(log(n))
bcoz m%n<=m/2
*/
import java.util.*;
public class gcd {
    public static void gcd_(int m,int n) {
        int r=m%n;
        if(r==0)
        System.out.println(n);
        else
        {
            gcd_(n,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n>m)
        gcd_(n,m);
        else
        gcd_(m,n);
        sc.close();
    }
}
