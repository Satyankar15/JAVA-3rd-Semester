class Item
{
	int id,qty,price,sp;
	String name;
	Item(){}
	Item(int no, String name, int qty, int prc, int sp)
	{
		id=no;
		this.sp=sp;
		this.name=name;
		this.qty=qty;
		price=prc;
	}

	void display1()
	{
		System.out.println("-> "+this.id+" "+this.name+" "+this.qty+" "+this.price);
	}
	void display2(Item x)
	{
		System.out.println("-> "+x.id+" "+x.name+" "+x.sp);
	}
}