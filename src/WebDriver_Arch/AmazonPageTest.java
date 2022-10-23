package WebDriver_Arch;

public class AmazonPageTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		
		String browser = "chrome";
		
		switch(browser) {
		case "chrome":
			driver = new ChromeDriver();
			return;
		case "Firefox":
			driver = new FirefoxDriver();
			return;
		case "Safari":
			driver = new SafariDriver();
			return;
		default:
			System.out.println("Please pass the right browser:" + browser);
			break;	
		
		}
		
		driver.get(browser);
		driver.getTitle();
		driver.sendKeys(browser, browser);
		
		
	}

}
