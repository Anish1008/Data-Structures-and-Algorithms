/**
 * kthbit_is_set
 */
//Check whether kth bit is set or not
//a bit is said to be a set if its value is 1
//Example: n=4 and k=1
//Binary representation of 4 is 100 and the 2nd number from the end(or the 1st index from the LSB) is not a set. Therefore the program will return false.

//Inorder to solve this:
//left shift 1 by kth position or right shift n by kth position
//Then perform the and operation
//If the operation return value >0 return true else return false
import java.util.*;
public class kthbit_is_set {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            if((n&(1<<k))>0)    //or if(((n>>k)&1)>0)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
        sc.close();
    }
}