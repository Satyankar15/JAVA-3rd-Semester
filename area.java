class Area
{
	public static void main(String args[])
	{
		int x,y,l,z;
		float result=0;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		z=Integer.parseInt(args[2]);
		l=args.length;
		if(l==0)
			result=22*4/7;
		else if(l==1)
			result=x*x;
		else if(l==2)
			result=x*y;
		else if(l==3)
			result=2*(x*y+y*z+z*x);
		System.out.println(result);
	}
}