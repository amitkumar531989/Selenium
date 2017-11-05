package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.ExcelDataConfig;
import SuitBaseClass.BaseClass;
import mx4j.log.Log;
import PageObject.GmailLogine;
import java.io.IOException;

public class Login extends BaseClass {
	//WebDriver driver=null;
	@Test(dataProvider="Gmail")
	public void UsrLogin(String Usr,String Pass){
	
		try
		{
			
				BaseClass obj=new BaseClass();
				obj.UsrLogin();
				
				GmailLogine obj1=new GmailLogine();
				obj1.LoginId();
				obj1.NextBtn();
				obj1.Password();
				obj1.NextBtn1();
				
				
				
	}
	catch (Exception e)
	
		{
		
		}
	
	}
	
	
	@DataProvider(name="Gmail")
	public Object[][] passData()
	{
		ExcelDataConfig config=new ExcelDataConfig("F://CubictreeWorkspace//Assignment//src//ExcelFile//TestData1.xlsx");
		int row=config.getRowCount(0);
		Object[][] data=new Object[row][2];
		for(int i=0;i<row;i++)
		{
			data[i][0]=config.GetData(0, i, 0);
			data[i][1]=config.GetData(0, i, 1);
			
		}
				
		return data;
		
				
	}
	
	
	
		
				
	}
	


	
	

