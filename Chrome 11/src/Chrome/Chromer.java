package Chrome;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Chromer {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.com/");
		chrome.manage().window().fullscreen();
		
		String title = chrome.getTitle();
		System.out.println(title);
		   
		String sourcecode =chrome.getPageSource();
		System.out.println(sourcecode);
		
		String url = chrome.getCurrentUrl();
		System.out.println(url);
		
		chrome.get("https://www.facebook.com/");
		
		chrome.navigate().back();
		chrome.navigate().forward();
		chrome.navigate().refresh();
		
		chrome.close();
		chrome.quit();
		
		WebDriverManager.chromedriver().version("95.0.4638.54" ).setup();
		WebDriver chrome1 =new ChromeDriver();
		chrome1.get(https://www.google.com/);
			
			
			
	    Dimension windowsize  =	chrome1.manage().window().getSize();
	
	    System.out.println(windowsize.getWidth());
    	System.out.println(windowsize.getHeight());	
	    Dimension dim = new Dimension(900,1000);
	    chrome1.manage().window().setSize(dim);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    try
	    {
			
            chrome1.get("https://www.google.com/");
			String sessionid  = ((org.openqa.selenium.remote.RemoteWebDriver)chrome1).getSessionId().toString();	
	         System.out.println(sessionid);
	        String browsername    =((RemoteWebDriver)chrome1).getCapabilities().getBrowserName();
	        System.out.println(browsername);
	        String version    =((RemoteWebDriver)chrome1).getCapabilities().getVersion();
	        System.out.println(version);
	        String platform    =((RemoteWebDriver)chrome1).getCapabilities().getPlatform().toString();
	        System.out.println(platform);
	        Set<String>  capNames =((RemoteWebDriver)chrome1).getCapabilities().getCapabilityNames();
	        for(String capsname:capNames)
	        {
	        	System.out.println(capsname);
	        }
	        String js =((RemoteWebDriver)chrome1).getCapabilities().getCapability("javascriptEnabled").toString();
	        System.out.println(js);   
	        String to =((RemoteWebDriver)chrome1).getCapabilities().getCapability("timeouts").toString();
	        System.out.println(to);
         } catch (Exception e)
	    {
        	 System.out.println(e.getMessage());
	    }
	    finally
	    {
	    	chrome1.close();
			chrome1.quit();	
	    }
	}
}
