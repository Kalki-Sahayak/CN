import java.io.*;
import java.net.*;
class Server
{
	public static void main (String args[])throws Exception
	{
		ServerSocket ss = new ServerSocket (6666);
		System.out.println ("Waiting for connection..... ");
		Socket s = ss.accept();
		System.out.println ("Client - server Connection Established!!");
		DataInputStream din = new DataInputStream (s.getInputStream());
		DataOutputStream dout = new DataOutputStream (s.getOutputStream());
		String str2 ="";
		String str = din.readUTF();
		System.out.println ("Client says: "+ str);
		if (str.equals(str.toUpperCase())) {
                System.out.println("Returning back the original string");
    	        str2 = str;}
		else
			str2 = str.toUpperCase();
		dout.writeUTF(str2);
		dout.close();
		s.close();
		ss.close();
	}
}