class Petrol extends Thread
{
	static int mainfuel=1000;
	int limit,fuel;
	public void run()
	{
		System.out.println("Welcome "+fuel);
		
		
		
	}
	Petrol(int limit)
	{
		this.limit=limit;
		this.fuel=limit;
	}
	public static void main(String args[])
	{
		Petrol n1 = new Petrol(500);
		Petrol n2= new Petrol(200);
		Petrol n3=new Petrol(300);
		Thread t1=new Thread(n1);
		Thread t2=new Thread(n2);	
		t1.start();
		t1.join();
		t2.start();
		
		
		
	}
}	
