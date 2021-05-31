import java.util.Scanner;
class Menu{
	int price;
	String dish;
	public static void main(String args[])
	{
		Menu m[]= new Menu[3];
		int qty, flag=1,i,total=0;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<3;i++)
			m[i]=new Menu();
		m[0].price=100;
		m[0].dish="Pizza";
		m[1].price=150;
		m[1].dish="Burger";
		m[2].price=200;
		m[2].dish="Pasta";
		while(flag==1)
		{
			System.out.println("1. Pizza 2. Burger 3. Pasta\n");
			System.out.println("Enter your choice");
			int ans=sc.nextInt();
			System.out.println("Enter quantity\n");
			int q=sc.nextInt();
			total=total+(m[ans-1].price*q);
			System.out.println("You ordered "+q+m[ans-1].dish);
			System.out.println("Do you wish to continue?(1/0)");
			flag=sc.nextInt();
		}
		System.out.println("Your total is"+total);
	}
}
			
			
			
				
		
		
		