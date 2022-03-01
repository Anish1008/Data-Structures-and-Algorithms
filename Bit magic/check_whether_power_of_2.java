//Check whether the number is a power of 2 or not
import java.util.*;
public class check_whether_power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
           if((int)Math.ceil(Math.log(n)/Math.log(2))==(int)Math.floor(Math.log(n)/Math.log(2)))
           System.out.println("yes");
           else
           System.out.println("No"); 
        }
        sc.close();
    }
}

//Other solutions:

// All power of two numbers has only a one-bit set. So count the no. of set bits and if you get 1 then the number is a power of 2.

// If we subtract a power of 2 numbers by 1 then all unset bits after the only set bit become set; and the set bit becomes unset.
// For example for 4 ( 100) and 16(10000), we get the following after subtracting 1 
// 3 –> 011 
// 15 –> 01111
// So, if a number n is a power of 2 then bitwise & of n and n-1 will be zero. We can say n is a power of 2 or not based on the value of n&(n-1). The expression n&(n-1) will not work when n is 0. To handle this case also, our expression will become n& (!n&(n-1))
