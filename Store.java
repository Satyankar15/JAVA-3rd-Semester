import java.util.*;
import java.io.*;
class Store
{
  int id, price, quant,type;
  String name, sid, sprice, squant,stype;
 Store()
  {}
  Store(int id, String name, int price, int quant, int type)
  {
    this.id=id;
    this.name=name;
    this.price=price;
    this.quant=quant;
    this.type=type;
    this.stype=Integer.toString(type);
    this.sid=Integer.toString(id);
    this.sprice=Integer.toString(price);
    this.squant=Integer.toString(quant);
  }
  void display()
  {
    System.out.println("ID: "+id+" Name: "+name+" Price: "+price+" Quantity: "+quant);
    System.out.println("\n");
  }
  int quantcheck(int x)
  {
    if((quant-x)>=0)
      return 1;
    else
      return 0;
  }
  int total(int x)
  {
    int total;
    total=this.price*x;
    return total;
  }
  void adddata(int x)
  {
    quant=quant+x;
  }
  void addfile()
  { String line;
    try
   {
     {
    if(this.type==1)
    {
      FileWriter f1=new FileWriter("Groc.txt",true);
      line=(this.sid+" "+this.name+" "+this.sprice+" "+this.squant+"\n");
      f1.write(line);
      f1.close();
    }
    else if(this.type==2)
    {
      FileWriter f2=new FileWriter("Grooming.txt",true);
    line=(this.sid+" "+this.name+" "+this.sprice+" "+this.squant+"\n");
      f2.write(line);
      f2.close();
    }
    else if(this.type==3)
    {
      FileWriter f3=new FileWriter("Beverage.txt",true);
      line=(this.sid+" "+this.name+" "+this.sprice+" "+this.squant+"\n");
      f3.write(line);
      f3.close();
    }
  }
    }catch(Exception e){System.out.println(e);}
  }
  public static void main(String args[]) throws Exception
  {
    int i,y,ch,ans,total,j,t, imax=6,Mid,Mprice,Mquant,Mtype,x;
    String line,Mname;
    Scanner sc=new Scanner(System.in);
    Store s[]=new Store[20];
    System.out.println("\n");
    s[0]=new Store(1,"Bread",25,10,1);
    s[1]=new Store(2,"Meat",200,5,1);
    s[2]=new Store(3,"Shampoo",150,15,2);
    s[3]=new Store(4,"Soap",20,20,2);
    s[4]=new Store(5,"Pepsi",40,20,3);
    s[5]=new Store(6,"Juice",25,15,3);
    for(i=0;i<imax;i++)
    {
      s[i].addfile();
}
    String sid, sprice, squant;
    for(i=1;;)
    {
    System.out.println("\n*****************************************");
    System.out.println("Welcome to Blueberry Groceries\n");
    System.out.println("Enter the number which will be used as bill ID");
    y=sc.nextInt();
    ans=1;
    total=0;
    while(ans==1)
    {
      for(i=0;i<imax;i++)
        s[i].display();
        System.out.println("0 Admin Login");
        System.out.println("\nEnter your choice and quantity(or password if admin)");
        x= sc.nextInt();
        int q= sc.nextInt();
        if(x==0)
        {
          if(q==21)
          {
            System.out.println("Hello, Admin what would you like to do today\n");
            System.out.println("1.Add new item");
            System.out.println("2.View Inventory");
            int ach=sc.nextInt();
            if(ach==1)
            {
              System.out.println("Enter name,price,quantity and type(1 for groc, 2 for grooming, 3 for beverage) you want to add");
              Mname=sc.next();
              Mprice=sc.nextInt();
              Mquant=sc.nextInt();
              Mtype=sc.nextInt();
              s[imax]=new Store((imax+1),Mname,Mprice,Mquant,Mtype);
              s[imax].addfile();
              imax=imax+1;
            }
            else if(ach==2)
            {
              FileReader r1=new FileReader("Groc.txt");
              FileReader r2=new FileReader("Grooming.txt");
              FileReader r3=new FileReader("Beverage.txt");
              System.out.println("Inventory Details\n");
              for(int u=0;u<imax;u++)
                s[u].display();
              }
          else
            System.out.println("Incorrect password");
        }
      }
        else
        {
          if((s[x-1].quantcheck(q))==1)
          {
            t=s[x-1].total(q);
            s[x-1].quant=s[x-1].quant-q;
            System.out.println("Added "+q+"x "+s[x-1].name+" costing "+t);
            total=total+t;
              try
              {
              PrintWriter writer1=new PrintWriter("Groc.txt");
              PrintWriter writer2=new PrintWriter("Grooming.txt");
              PrintWriter writer3=new PrintWriter("Beverage.txt");
              writer1.close();
              writer2.close();
              writer3.close();
              for(i=0;i<imax;i++)
                s[i].addfile();
              }catch(Exception e){System.out.println(e);}
          }
          else
            System.out.println("Out of stock");

        }
        System.out.println("Continue as current user? 1=Yes, 0=No");
        ans=sc.nextInt();
      }
       System.out.println("Your total bill is Rs."+total);
        String scounter,stotal;
        try
        {
            FileWriter fw=new FileWriter("Transaction.txt",true);
          scounter=Integer.toString(y);
          stotal=Integer.toString(total);
          String state;
          state=("Transaction ID: "+scounter+"Total Transaction= "+stotal+"\n");
          fw.write(state);
          fw.close();
        }catch(Exception e){System.out.println(e);}
      }
    }
  }
