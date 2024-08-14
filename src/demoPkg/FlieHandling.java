package demoPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FlieHandling
{
	
	public static void readpropfile() throws Exception
	{
		//File f = new File("./TestData/data.properties");//file connection
		
		FileReader fr = new FileReader("./TestData/data.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		System.out.println(prop.get("browser"));
		
		System.out.println(prop.get("url"));
		
		
	
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");  //file connection
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nThis is my forth line of data");
		fw.flush();
		fw.close();
	
	}
	
	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");
		
		File f = new File("./TestData/abc.txt");  //file connection
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();
		
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r = fr.read();
			
		}
		
	}
	
	public static void main(String[] args) throws Throwable {
		FlieHandling.readpropfile();
		
		
	}
	
}



