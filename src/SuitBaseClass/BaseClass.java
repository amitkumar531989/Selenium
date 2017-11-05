package SuitBaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class BaseClass {
	
	WebDriver driver=null;
	@Test
	public void UsrLogin() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream Fis=new FileInputStream("F:\\CubictreeWorkspace\\Assignment\\src\\Properties\\OpenBrowser.properties");
		//FileInputStream Fis1=new FileInputStream("F:\\CubictreeWorkspace\\Framework\\src\\Properties\\Admin.properties");
		prop.load(Fis);
		//prop.load(Fis1);
		//System.out.println(prop.getProperty("CT_Login_Username"));
		
		if(prop.getProperty("BrowserName").equals("Firefox"))
		{
			driver=new FirefoxDriver();
			
			
		}
		else if(prop.getProperty("BrowserName").equals("Chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else 
		{
		
			driver=new InternetExplorerDriver();
			
	}
	driver.get(prop.getProperty("Url"))	;
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	
	
	
	}}
