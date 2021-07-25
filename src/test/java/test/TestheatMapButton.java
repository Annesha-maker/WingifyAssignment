package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.ViewHeatMapPage;

public class TestheatMapButton {
	
	private static WebDriver driver =null;
	
	
	public static void main(String[] args) {
		
	
		viewHeatMap();
		
	}

	public static void viewHeatMap()
	{
	String projectPath=System.getProperty("user.dir");
	System.out.println("projectPath :"+projectPath);
	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chrome/chromedriver.exe");
	driver=new ChromeDriver();
		
   //Open the below URL
   driver.get("https://app.vwo.com/#/analyze/heatmap/129/reports?token=eyJhY2NvdW50X2lkIjo2LCJleHBlc%20mltZW50X2lkIjoxMjksImNyZWF0ZWRfb24iOjE1MDc3ODk0ODcsInR5cGUiOiJjYW1wYWlnbiIsI%20nZlcnNpb24iOjEsImhhc2giOiJiMzlmMTQ4MWE0ZDMyN2Q4MDllNTM1YzVlNWFjOGVlMCJ9");
	
   //Maximize current window
   driver.manage().window().maximize();   
   
   //Implicit Wait   
   driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    
    //View HeatMap Button by MouseOver 
   ViewHeatMapPage.view_HeatmapButton(driver);
   
   //Click on View HeatMap button and validate that a new window has been Opened
   ViewHeatMapPage.clickOn_HeatmapButton(driver);
   
   
  ViewHeatMapPage.clickOn_ElementList(driver);
  ViewHeatMapPage.clickOn_Email(driver);
    

	}
}
