package PageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.ExcelDataConfig;
import SuitBaseClass.BaseClass;


public class GmailLogine {
	WebDriver driver=null;
	//public void Test() throws Exception
	//{
	//BaseClass obj=new BaseClass();
	//obj.UsrLogin();
	
	
	
	
	//}
	
	@Test(dataProvider="Gmail")
	/*public void GmailLogine()
	{
		GmailLogine obj=new GmailLogine();
		obj.openBrowse();
		obj.LoginId();
		obj.NextBtn();
		obj.Password();
		obj.NextBtn1();
		
	}
	public void openBrowse()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/gmail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}*/
	
	
	

	public void LoginId()
	{
		//String usr=UserName;
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("Usr");
		
	}
	
	public void NextBtn()
	{
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
	}
	
	
	public void Password()
	
	{
	//String pass=Password;
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Pass");
	}
	
	public void NextBtn1()
	{
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
	}
	
	
	


	

}