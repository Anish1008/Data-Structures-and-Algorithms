//Count the number of sets in a binary representation of an integer
//In simple words count the number of 1s in a binary representation of an integer


//Simple Method: Time Complexity: Theta(log(n))
// import java.util.*;
// public class count_no_of_set_bits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t=sc.nextInt();
//         for(int i=1;i<=t;i++)
//         {
//             int n=sc.nextInt();
//             int count=0;
//             while(n>0)
//             {
//                 if((n&1)>0)
//                 count++;
//                 n=n>>1;
//             }
//             System.out.println(count);
//         }
//         sc.close();
//     }
// }

// Recursive method: Time complexity: O(log(n))
// import java.util.*;
// public class count_no_of_set_bits {
//     public static int count_bits(int n) {

//         //base case
//         if(n==0)
//         return 0;
//         else
//         {
//             return((n&1)+count_bits(n>>1));
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t=sc.nextInt();
//         int arr[]=new int[t];
//         for(int i=0;i<t;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<t;i++)
//         {
//             System.out.println(count_bits(arr[i]));
//         }
//         sc.close();
//     }
// }

//Brian Kernighan’s Algorithm: Time Complexity: O(log(n))
//Subtracting 1 from a decimal number flips all the bits after the rightmost set bit(which is 1) including the rightmost set bit. 
// for example : 
// 10 in binary is 00001010 
// 9 in binary is 00001001 
// 8 in binary is 00001000 
// 7 in binary is 00000111 
// So if we subtract a number by 1 and do it bitwise & with itself (n & (n-1)), we unset the rightmost set bit. If we do n & (n-1) in a loop and count the number of times the loop executes, we get the set bit count. 
//Pseudo Code
//1  Initialize count: = 0
// 2  If integer n is not zero
// (a) Do bitwise & with (n-1) and assign the value back to n
//     n: = n&(n-1)
// (b) Increment count by 1
// (c) go to step 2
// 3  Else return count
import java.util.*;
public class count_no_of_set_bits {
    public static int count_bits(int n) {
        int count=0;
        while(n>0)
        {
            count++;
            n&=(n-1);
            System.out.println(n);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(count_bits(arr[i]));
        }
        sc.close();
    }
}
