class Shape
{

	void area()
	{
		double result=3.14*4;
		System.out.println(result);
	}
	void area(int a)
	{
		int result=a*a;
		System.out.println(result);
	}
	void area(int a, int b)
	{
		int result=a*b;
		System.out.println(result);
	}
	void area(int a, int b, int c)
	{
		int result=2*(a*b+b*c+c*a);
		System.out.println(result);
	}
	public static void main(String args[])
	{	int dat[]=new int[args.length];
		Shape circle=new Shape();
		Shape rectangle=new Shape();
		Shape square=new Shape();
		Shape cuboid=new Shape();
		int i,x=args.length;
		if(x==0)
			circle.area();
		else
		{
			for(i=0;i<x;i++)
				dat[i]=Integer.parseInt(args[i]);
			switch(x)
			{
				case 1:
				{
					square.area(dat[0]);
					break;
				}
				case 2:
				{
					rectangle.area(dat[0],dat[1]);
					break;
				}
				case 3:
				{
					cuboid.area(dat[0],dat[1],dat[2]);
					break;
				}
				default:
				{
					System.out.println("Error");
					break;
				}
			}
		}
	}
}	
		
		
		
