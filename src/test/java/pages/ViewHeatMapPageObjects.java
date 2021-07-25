package pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewHeatMapPageObjects {
	WebDriver driver=null;
	
	By viewHeatmapButtonsearch=By.xpath("//img[@class='screenshot-thumb__img']");
	By clickOnHeatMap=By.xpath("//div[contains(text(),'View heatmap')]");
	By clickOnElementList=By.xpath("//span[@data-qa='jepucefiga']");
	By clickOnemailButton=By.xpath("/html/body/div[1]/div[2]/table/tr[2]/td[1]");
	
	public ViewHeatMapPageObjects(WebDriver driver) {
    	
    	this.driver=driver;
    }
	
	public void mouseHoverOnImage() {
		
		WebElement element=driver.findElement(By.xpath("//img[@class='screenshot-thumb__img']"));
		
		 //Creating object of an Actions class
        Actions action = new Actions(driver);
        
        
      //Performing the mouse hover action on the target element.
        action.moveToElement(element).build().perform();
		
	}
	
	public void clickOnViewHeatMapButton() {
		driver.findElement(By.xpath("//div[contains(text(),'View heatmap')]")).click();
		
	}

     public void getfocusOnNewTab() {
	    
	    Set<String> windowhandles= driver.getWindowHandles();
	    System.out.println(windowhandles);
	   Iterator<String> iterator=windowhandles.iterator();
	   String parent=iterator.next();
	   String child= iterator.next();
	   driver.switchTo().window(child);
	   
     }
     
     public void clickOnElementList() {
	   new WebDriverWait(driver, 200).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"heatmap-iframe\"]")));
	  
	   driver.findElement(By.xpath("//span[@data-qa='jepucefiga']")).click();
     }
     
     public void BacktoDefaultFrame() {
     //Back to default frame
	   driver.switchTo().defaultContent();
     }
     
     public void clickOnEmail() {
	   new WebDriverWait(driver, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"element-list-iframe\"]")));
	 
	   driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tr[2]/td[1]")).click(); 
	
}
     
}
