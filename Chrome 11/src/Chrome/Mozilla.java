package Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe\\");
		WebDriver gecko = new FirefoxDriver();
		gecko.get("https://www.google.com/");
		gecko.manage().window().fullscreen();
		
		String title = gecko.getTitle();
		System.out.println(title);
		   
		String sourcecode =gecko.getPageSource();
		System.out.println(sourcecode);
		
		String url = gecko.getCurrentUrl();
		System.out.println(url);
		
		gecko.get("https://www.facebook.com/");
		
		gecko.navigate().back();
		gecko.navigate().forward();
		gecko.navigate().refresh();
		
		gecko.close();
		gecko.quit();
		



	}

}
