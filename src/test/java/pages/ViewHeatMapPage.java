package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewHeatMapPage {
	
	private static WebElement element=null;

    public static WebElement view_HeatmapButton(WebDriver driver) {
    	
      element =driver.findElement(By.xpath("//img[@class='screenshot-thumb__img']"));
     
	    return element;
}
     
    
    public static WebElement clickOn_HeatmapButton(WebDriver driver) {
    element= driver.findElement(By.xpath("//div[contains(text(),'View heatmap')]"));

    return element;
}
    
    public static WebElement clickOn_ElementList(WebDriver driver) {
        element= driver.findElement(By.xpath("//span[@data-qa='jepucefiga"));

        return element; 
        
    }
    
    
    public static WebElement clickOn_Email(WebDriver driver) {
        element= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tr[2]/td[1]"));

        return element; 
    }
         
}