import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://masrawy.com");
			
	}
		
	
}
