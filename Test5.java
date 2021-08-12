import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	static WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mantr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	//checking for map-marker icon
	public void contact() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),\"Contact Us\")]")).click();
		WebElement mark=driver.findElement(By.xpath("//i[@class='fa fa-map-marker']"));
		if(mark.isDisplayed()) {
			System.out.println("mark is found");
		}
		Thread.sleep(5000);
	}
	//checking for mobile icon
	public void mobile() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),\"Contact Us\")]")).click();
		WebElement us=driver.findElement(By.xpath("//i[@class='fa fa-mobile']"));
		if(us.isDisplayed()) {
			System.out.println("mobile is found");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test5 obj=new Test5();
		obj.launch();
		obj.contact();
		obj.mobile();
		driver.close();
		

	}

}
