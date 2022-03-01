/**
 * computing_power
 */
public class computing_power {
    static void power(int x, int y,long ans,int flag)
    {
        if (y == 0)
        {
            if(flag!=1)
            System.out.println(ans);
            else
            System.out.println((double)1/ans);
        }
        else if (y % 2 == 0)
        {
            x*=x;
            y=y/2;
            power(x,y,ans,flag);
        }
        else {
            ans*=x;
            y=y-1;
            power(x,y,ans,flag);
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int y = -2;
        int flag=0;
        long ans = 1;
        if(y<0)
        {flag=1;
        y=y*-1;}
        power(x,y,ans,flag);
    }
} 