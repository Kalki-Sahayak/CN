import java.io.*;
import java.net.*;
class Client
{
	public static void main (String args[])throws Exception
	{
		Socket s = new Socket("localhost", 6666);
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		DataInputStream din = new DataInputStream (s.getInputStream());
		DataOutputStream dout = new DataOutputStream (s.getOutputStream());
		String str = br.readLine();
		dout.writeUTF(str);
		String str2 = din.readUTF();
		System.out.println ("The UpperCase is: " + str2);
		dout.close();
		s.close();
	}
}