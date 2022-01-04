/**
 * lcm_of_2nos
 */
/**
 * let 2 numbers be m and n
 * m*n=lcm(m,n)*gcd(m,n)
 */
/**
 * Time Complexity:O(log(n))
 */
import java.util.*;
public class lcm_of_2nos {
    public static int gcd(int m,int n) {
        if(m%n==0)
        return(n);
        else
        return gcd(n,m%n);
    }
    public static void lcm(int n,int m) {
        int g=0;
        if(n>m)
        g=gcd(n,m);
        else
        g=gcd(m,n);
        System.out.println((m*n)/g);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        lcm(n,m);
        sc.close();
    }
}