import java.io.*;
class Files69
{
	public static void main(String args[])
	{
		//File file=new File("C:\\JAVA Stuff\\abc.txt");
		try
		{
			FileOutputStream fout=new FileOutputStream("abc.txt");
			String s="Hello";
			byte b[]=s.getBytes();
			fout.writeBytes(b);
			fout.close();
			FileInputStream fin=new FileInputStream("abc.txt");
			int i=0;
			while((i=fin.read())!=-1){
			System.out.println((char)i);}
		}catch(Exception e){ System.out.println(e);}
	}
}