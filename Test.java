import java.util.*;
import java.io.*;
class Test
{
  public static void main(String args[])
  {
    String abc[]=new String[10];
    try
    {
      FileWriter fw=new FileWriter("Test.txt");
      for(int i=0;i<2;i++)
        fw.write("\nHello "+i);
      fw.close();
    }catch(Exception e){System.out.println(e);}
    try
    {
      FileReader fr=new FileReader("Test.txt");
      int i,j=0;
      while((i=fr.read())!=-1)
      {
        System.out.print((char)i);
      }
    }catch(Exception e){System.out.println(e);}

}
