package com.cdkglobal.tryout;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{


    public String display(String name)
    {
	String res_str = "I'm "+name+" working in CDK Global";
	return res_str;
    }
    public static void main( String[] args ) throws IOException
    {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	App app = new App();
	System.out.println(app.display(String.valueOf(br.readLine())));
    }
}
