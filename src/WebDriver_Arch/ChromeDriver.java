package WebDriver_Arch;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		System.out.println("Launching chrome browser");
	}

	@Override
	public void get(String url) {
	System.out.println("launch url.. " +url);
	}

	@Override
	public String getTitle() {
		return "Amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("click on :" + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering element :" + element);
	}

	@Override
	public void close() {
		System.out.println("Close the browser");
	}

}
