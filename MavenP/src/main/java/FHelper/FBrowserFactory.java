package FHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FBrowserFactory {
	 static WebDriver driver;
     public static WebDriver startBrowser(String browserName, String urls)
     {
    	 if(browserName.equalsIgnoreCase("firefox"))
    		 {
    		 System.out.println("fireFox not installed");
    		 driver = new FirefoxDriver();
    	 }
    	 else if(browserName.equalsIgnoreCase("Chrome"))
    	 {
    		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hasan\\Desktop\\Java_Automation\\chromedriver.exe");
    		 driver= new ChromeDriver();
    	 }
    	 else if(browserName.equalsIgnoreCase("IE"))
    	 {
    		 driver= new InternetExplorerDriver();
    		 System.out.println("Sorry IE is not installed");
        }
    	 driver.manage().window().maximize();
    	 driver.get(urls);
    	 return driver;

}
}



