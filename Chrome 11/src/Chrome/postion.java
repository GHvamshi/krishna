package Chrome;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class postion {

	private static final postion FileUtils = null;

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver chrome = new ChromeDriver();
	chrome.get("https://www.google.com/");
	chrome.manage().window().fullscreen();
	
	
       Point passion	= chrome.manage().window().getPosition();
       System.out.println(passion.getX());
       System.out.println(passion.getY());
	
	    Point passion1 = new Point (2,4);
	    
	    chrome.manage().window().setPosition(passion1);
	    
	    chrome.manage().window();
	  File source =  chrome.findElement(By.name("passion1")).getScreenshotAs(OutputType.FILE);
	  
	  File dest = new File("path.png");
	   postion.copyFile(source,dest);
	 
       Cookie k =	  new Cookie("Siddhi","Bhongir");
        chrome.manage().addCookie(k);	  
	  
        Set<Cookie> cookies = chrome.manage().getCookies();//4
        
        for(Cookie cookie:cookies);
        
        System.out.println(cookie.getName()+"=============="+cookie.getValue());
        System.out.println(cookie.getpath());
        
        
        chrome.manage().deleteCookieNamed("Siddhi");
        
        Set<cookie> cookies1 = chrome.manage().getCookies();//4
        for(Cookie cookie:cookies1)
        
        	System.out.println(cookie.getName()+"========="cookie.getValue());
        
             System.out.println("==========================");
             
             cookie abc = chrome.manage().getCookieNamed("NID");
             System.out.println(abc);
        
        
               Thread.sleep(5000);
		       chrome.close();
	        	chrome.quit();
		

	    
	}

	private static void copyFile(File source, File dest) {
		// TODO Auto-generated method stub
		
	}

}
