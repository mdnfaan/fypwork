package fypp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	 public static void main(String[] args) {  
	        
		    // declaration and instantiation of objects/variables  
		    System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
		    WebDriver driver = new ChromeDriver();  
		      
		// Launch website  
		    driver.navigate().to("http://52.77.237.224:8090/");  
		          
		    // Click on the selection putton for city_truck 
		    driver.findElement(By.id("city_truck-raido")).click();  
		          
		    // view map 
		    driver.findElement(By.id("mapid");  
		      
		    }  
		  
		}  