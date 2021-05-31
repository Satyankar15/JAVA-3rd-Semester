import java.io.*;
import java.util.*;
interface Pswd	//interface
{
	int password = 4320; //static & final variable
	public abstract int passwordcheck(int x);
}

class Admin implements Pswd	//abstract class
{	static int balance;
	Admin(){}
	public int passwordcheck(int x) //method overriding
	{
		try
		{
			if(x==password)
			{
				System.out.println("Welcome, Admin");
				return 1;
			}
			else
			{
				throw new ArithmeticException("Incorrect password, access denied");
			}
		}
		catch(ArithmeticException e){System.out.println(" Please try later");}//Exception handling
		return 0;
	}
}
class Plane extends Admin		//Inheritence
{
	int cost, id,seats;
  static int Ttickets=0;
	String airline,customer,origin,destination;
	Plane(){}
	Plane(int id, String airline, int cost)
	{
		this.id=id;		//this keyword
		this.airline=airline;
		this.cost=cost;
	}
	Plane(int id, String airline, String origin, String destination, int cost) 	//method overloading
	{	this(id,airline,cost);
		this.origin=origin;
		this.destination=destination;
	}
	void display()
	{
		System.out.println(id+" "+airline+" "+origin+" "+destination+" "+cost+" ");
	}
	int purchase(int q)
	{	int tot=0;
		System.out.println("Billed "+q+" ticket(s) from "+origin+"to "+destination);
		seats=seats-q;
		tot=q*cost;
		Ttickets=Ttickets+q;
		balance=balance+tot;
		return(tot);
	}
}
	class Customer extends Plane
	{	String name;
		int reg,pin;
		void details(String name, int reg, int pin)
		{
			this.name=name;
			this.reg=reg;
			this.pin=pin;
			System.out.println("Successfully registered, "+name);
		}
		int pincheck(int pin)
		{
		if(pin==this.pin)
			return 1;
		else
			return 0;
		}
		public static void main(String args[]) throws IOException
		{
		int ch,regid=1,y,i=0;
		Customer c[]= new Customer[10];
		Plane x= new Plane();
		for(i=0;i<10;i++)
			c[i]=new Customer();
		Plane p[]= new Plane[5];
		p[0]=new Plane(1, "Indigo",  "Jaipur", "Mumbai", 3000);
		p[1]=new Plane(2,"Vistara","Jaipur","Delhi",1200);
		p[2]=new Plane(3,"Jet Airways","Shimla","Bhopal",4000);
		p[3]=new Plane(4,"Air India","Delhi","Mumbai",3500);
		p[4]=new Plane(5,"GoAir","Kolkata","Jaipur",3000);
		int ans=1;
		while(ans==1)
		{
			System.out.println("Welcome to MUJ flight booking system, please choose the suitable option from the following");
			System.out.println("\n");
			System.out.println("1.Create New User\n2.Book Tickets(Existing User)\n3.Admin");
			Scanner sc=new Scanner(System.in);		//Inputting
			ch=sc.nextInt();
			switch(ch)			//Switching
			{
			case 1:{
				System.out.println("Enter Name ");
				String nm= sc.next();
				System.out.println("Enter pin");
				int pn= sc.nextInt();
				c[regid-1].details(nm,(regid-1),pn);
				FileWriter  writer = new FileWriter(nm+".txt");	// Filewriter
				FileWriter  writer2 = new FileWriter("username.txt", true);
				try
				{
					PrintWriter print = new PrintWriter(writer);
					PrintWriter print2 = new PrintWriter(writer2);
					print.println(nm);
					print.println(pn);
					print.println(regid);
					print2.println(nm);
					print.close();
					writer.close();
					writer2.close();
					print2.close();
				} catch(Exception e)
				{System.out.println(e);}
				System.out.println("Your regid is "+regid);
				regid=regid+1;
				break;
				}
			case 2:{
				System.out.println("Enter Registered username and id and pin ");
				String l =sc.next();
				y=sc.nextInt();
				i=sc.nextInt();
				String filepath = l+".txt";
				FileReader writer3 = new FileReader(filepath);
				boolean userExists = false;
				BufferedReader br;
				if(c[y-1].pincheck(i)==1)

				try {
					br = new BufferedReader(writer3);
					String line;
					while((line = br.readLine()) != null) {
						if(line.equals(y)) {
							userExists = true;
							break;
						}
					}
					if(!userExists) {
						System.out.println("already exists");
					} else {
						System.out.println("not present");
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
				{
					for(i=0;i<5;i++)
						p[i].display();
					System.out.println("Enter id and quantity of ticket you want to buy");
					i=sc.nextInt();
					int q=sc.nextInt();
					int tot=p[i-1].purchase(q);
					System.out.println("Your total is "+tot);
				}

				break;
			}
			case 3:
				System.out.println("Enter admin password");
				y=sc.nextInt();
				if(y == 4320)
				{
					System.out.println("*");
					try
					{
						FileInputStream fin = new FileInputStream("username.txt");
						BufferedReader r = new BufferedReader(new InputStreamReader(fin));
						String data;
						FileInputStream fin2 = null;
						while((data = r.readLine())!=null)
						{
             	fin2 = new FileInputStream(data+".txt");
							BufferedReader r2 = new BufferedReader(new InputStreamReader(fin2));
							System.out.println("Username = "+r2.readLine()+"\nPassword = "+r2.readLine()+"\n");
				    }

						System.out.println("Tickets sold in current session = "+Ttickets);
						System.out.println("Profit in current session = "+balance);
			}catch(Exception e){}


			}
			break;
			default:
			{
				System.out.println("Error, try again");
				break;
				}
			}
		System.out.println("Continue?(1/0)");
		ans=sc.nextInt();
	}
	System.out.println("Thank you for using our program. ");
}
}
