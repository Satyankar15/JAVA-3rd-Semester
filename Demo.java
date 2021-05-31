import java.util.*;
import java.util.*;

 class Demo
{
	public  static  void  main(String args[])
	{
		Item i[]=new Item[5];
		GenBill g=new GenBill();
		int j,ch,ans=1,q,stot=0,ptot=0;
		Item X=new Item();
		Purchase p=new Purchase();
		Sale s=new Sale();
		i[0]=new Item(1,"Harry Potter",5,100,40);
		i[1]=new Item(2,"Sacred Games",3,200,60);
		i[2]=new Item(3,"Who moved my cheese?",10,600,100);
		i[3]=new Item(4,"Only time will tell",2,1000,300);
		i[4]=new Item(5,"The Kite Runner",7,50,10);
		for(j=0;j<5;j++)
		{
			i[j].display1();
		}
		while(ans==1)
		{
			System.out.println("1.Purchase  2.Sell");
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			switch(a)
			{
				case 1:
				{
					System.out.println("What will you purchase? Enter the id");
					ch=sc.nextInt();
					System.out.println("Enter quantity");
					q=sc.nextInt();
					stot=s.sale1(q,i[ch-1])+stot;
					break;
				}
				case 2:
				{
					System.out.println("What would you like to sell?Enter the id");
					for(j=0;j<5;j++)
						X.display2(i[j]);
					ch=sc.nextInt();
					System.out.println("Enter quantity");
					q=sc.nextInt();
					ptot=p.purchase1(q,i[ch-1])+ptot;
					break;
				}
				default:
				{
					System.out.println("Error");
					break;
				}
			}
			System.out.println("Continue?(1/0)");
			ans=sc.nextInt();
		}
	//stot=stot-ptot;
	g.generateBill(stot-ptot);
	}

}


	
