import java.net.*;
class IP
{
	public static void main (String args[])throws Exception
	{	
		
		
		InetAddress localhost = InetAddress.getLocalHost();
		System.out.println ("Local m/c: "+ localhost.getHostAddress());
		
		String host = "www.facebook.com";
		InetAddress remotehost = InetAddress.getByName(host);
		System.out.println ("Remote m/c: "+ remotehost.getHostAddress());

		String ip = remotehost.getHostAddress();
		String regex = "\\.";
		String parts[] = ip.split(regex);
		System.out.println (identifyClass(parts[0]));
			
	}

	public static String identifyClass(String first)
	{
		int FirstOctet = Integer.parseInt(first);
		if (FirstOctet>=0 && FirstOctet<=127)
			return "A";
		if (FirstOctet>=128 && FirstOctet<=191)
			return "B";
		if (FirstOctet>=192 && FirstOctet<=223)
			return "C";
		if (FirstOctet>=224 && FirstOctet<=239)
			return "D";
		else
			return "E";
	}

}