package Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\Downloads\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
					WebDriver internetExplorer = new InternetExplorerDriver();
					internetExplorer.get("https://www.google.com/");
					internetExplorer.manage().window().fullscreen();
					
					String title = internetExplorer.getTitle();
					System.out.println(title);
					   
					String sourcecode =internetExplorer.getPageSource();
					System.out.println(sourcecode);
					
					String url = internetExplorer.getCurrentUrl();
					System.out.println(url);
					
					internetExplorer.get("https://www.facebook.com/");
					
					internetExplorer.navigate().back();
					internetExplorer.navigate().forward();
					internetExplorer.navigate().refresh();
					
					internetExplorer.close();
					internetExplorer.quit();
					



	}

}
