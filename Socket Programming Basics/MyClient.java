import java.io.*;
import java.net.*;
public class MyClient
{
	public static void main (String args[])
	{
		try
		{
			Socket s= new Socket ("localhost", 6666);
			DataOutputStream donut= new DataOutputStream(s.getOutputStream());
			donut.writeUTF("Hello Server");
			donut.flush();
			donut.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}