package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ViewHeatMapPageObjects;

public class ViewHeatMapPage_testng {
	
	private static WebDriver driver=null;
	
	@BeforeTest
	public void setUpTest()
	{
		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath :"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chrome/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public static void viewHeatMapTest()
	{
		ViewHeatMapPageObjects  HeatMapPageObj= new ViewHeatMapPageObjects(driver);
		driver.get("https://app.vwo.com/#/analyze/heatmap/129/reports?token=eyJhY2NvdW50X2lkIjo2LCJleHBlc%20mltZW50X2lkIjoxMjksImNyZWF0ZWRfb24iOjE1MDc3ODk0ODcsInR5cGUiOiJjYW1wYWlnbiIsI%20nZlcnNpb24iOjEsImhhc2giOiJiMzlmMTQ4MWE0ZDMyN2Q4MDllNTM1YzVlNWFjOGVlMCJ9");
		driver.manage().window().maximize();   
	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		HeatMapPageObj.mouseHoverOnImage();
	    HeatMapPageObj.clickOnViewHeatMapButton();
	    HeatMapPageObj.getfocusOnNewTab();
	    HeatMapPageObj.clickOnElementList();
	    HeatMapPageObj.BacktoDefaultFrame();
	    HeatMapPageObj.clickOnEmail();
		
	}
	
	@AfterClass
	
	public void checknewtab()
	{
		  String page_title =driver.getTitle();
		    System.out.println("get title" +page_title);
		    
		   String expected_title="VWO | #1 A/B Testing Tool in the World";
		   Assert.assertEquals(page_title, expected_title);
	}
	
		
	@AfterClass
		public void tearDownTest()
		{
			//close browser
			driver.close();
			driver.quit();
			System.out.println("Test is executed Successfully");
		}

	

}
