import java.util.*;
public class Book_allocation {
    public static boolean Possible(int[] arr, int n, int m,int key) {
        int pageSum=0,studentCount=1;
        for(int i=0;i<n;i++)
        {
            if(pageSum<=key)
            pageSum+=arr[i];
            else
            {
                studentCount++;
                if(studentCount>m || arr[i]>key )
                return false;
                pageSum=arr[i];
            }
            
        }
        return true;
    }
    public static int allocation(int[] arr, int n, int m)
    {
        int s=0,e=0,mid=0;
        for(int i=0;i<n;i++)
        {
            e+=arr[i];
        }
        mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e)
        {
            if(Possible(arr,n,m,mid))
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(allocation(arr,n,m)); 
    }
}
