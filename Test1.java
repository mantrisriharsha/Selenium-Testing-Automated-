import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1{

	static WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mantr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	//verification of title
	public void checkName() throws InterruptedException {
		WebElement spark= driver.findElement(By.xpath("//div[@class=\"top-header-agile\"]//a[contains(text(),\"The Sparks Foundation\")]"));
		if(spark.isDisplayed()) {
			System.out.println("name is verified succesfully");
		}
		Thread.sleep(3000);
	}
	// verification of Corporate partners 
	public void corporate() throws InterruptedException {
		WebElement partner=driver.findElement(By.xpath("//div[@class='col-md-3 test-left-agileinfo']//h3[contains(text(),'Corporate Partners')]"));
		if(partner.isDisplayed()) {
			System.out.println("Element is found  successfully");
		}
		driver.findElement(By.xpath("//div[@class='owl-page active']//span[@class]")).click();
		Thread.sleep(3000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test1 obj=new Test1();
		obj.launch();
		obj.checkName();
		obj.corporate();
		driver.close();
	}

}
