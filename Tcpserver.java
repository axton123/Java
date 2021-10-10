import java.io.*;
import java.net.*;
class Tcpserver
	{
	public static void main(String []args) throws IOException
		{
		String s1,ms1;		
		ServerSocket serversocket = new ServerSocket(5000);
		while(true)
			{
			Socket clientsocket = serversocket.accept();
			System.out.println("Connected");
			BufferedReader infromclient = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));	
			s1=infromclient.readLine();		
			ms1=s1.toUpperCase()+'\n';
			DataOutputStream outtoclient= new DataOutputStream(clientsocket.getOutputStream());
			outtoclient.writeBytes(ms1);
			}
		}
	}