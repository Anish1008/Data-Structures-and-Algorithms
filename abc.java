public class abc
{
	public static void main(String[] args) {
        int p=0,r=0,s=0;
		for(int n=99;n<=1000;n++)
		{
	    p=n;
        r=0;
        s=0;
	    while(p>0)
	    {
	        r=p%10;
	        p=p/10;
	        s=s+(r*r*r);
	    }
	    if(n==s)
	    System.out.println(n);
		}
	}
}