class Sale extends Item
{

	Sale()
{super();
}	
	int stot=0;
	int sale1(int q, Item i)
	{	//n is ID and q is quantity
		//int x=n-1;
		if(i.qty>=q)
		{
			stot=i.price*q+stot;
			System.out.println("Added "+q+" of "+i.name+" costs "+stot);
			i.qty=i.qty-q;
		}
		else
			System.out.println("Out of stock");		
	return stot;
	}	
	
}