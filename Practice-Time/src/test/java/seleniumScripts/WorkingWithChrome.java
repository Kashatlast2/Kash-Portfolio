package seleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;

	String url = "http://demo.guru99.com/v4";

	public void invokeBrowser() {

		System.setProperty("webriver.chrome.driver", "/Volumes/Kash Passport/Downloads Kash Passport/chromedriver");	

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);
	}

	public void getTitle() {
		String titleOfThePage = driver.getTitle();

		System.out.println("Title Of The Page - "+ titleOfThePage);
	}
	public void closeBrowser() {
		//driver.close();
		
		driver.quit();
		
	}
	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		
		wc.invokeBrowser();
		wc.getTitle();
		wc.closeBrowser();
		
	}
}

