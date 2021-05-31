class Purchase extends Item
{
	int ptot=0;	
	int purchase1(int q, Item i)
		{
		i.qty=i.qty+q;
		ptot=ptot+i.sp*q;
		System.out.println("Sold "+q+"of "+i.name);
		return ptot;
		}
}