import java.util.*;
class Stud
{	
	void setdata(int a, String b, int c)
	{
		int x=a;
		String y=b;
		int z=c;
	}
	public static void main(String args[])
	{
		int x=0,a,i,c;
		String b;
		int l=args.length;
		l=l-(l%3);
		int count=l/3;
		Stud s[]=new Stud[count];
		for(i=0;i<count;i++)
			s[i]=new Stud();
		for(i=0;i<count;i++)
		{
			a=Integer.parseInt(args[x]);
			b=args[x+1];
			c=Integer.parseInt(args[x+2]);
			s[i].setdata(a,b,c);
			x=x+3;
		}
		
	}
}

		