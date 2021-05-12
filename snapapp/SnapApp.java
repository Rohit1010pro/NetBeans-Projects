package snapapp;
import java.net.*;
public class SnapApp
{
public static void main(String[] args)
{
try
{
URL url=new URL("http://www.facebook.com");
System.out.println("Protocal:"+url.getProtocol());
System.out.println("Host name:"+url.getHost());
System.out.println("Port number:"+url.getPort());
System.out.println("Default Port number:"+url.getDefaultPort());
}
catch(Exception e){System.out.println(e);}
}
}