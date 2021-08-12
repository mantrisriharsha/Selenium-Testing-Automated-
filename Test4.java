import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	static WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mantr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	//checking for a text 'Be Your Own Boss'
	public void join() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Join Us')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Why Join Us')]")).click();
		WebElement own=driver.findElement(By.xpath("//span[contains(text(),'Be Your Own Boss')]"));
		if(own.isDisplayed()) {
			System.out.println(" Text is found");
		}
		Thread.sleep(5000);
	}
	//checking for a text 'Graduate Rotational Internship Program'
	public void grip() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Join Us')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Internship Positions')]")).click();
		Thread.sleep(3000);
		WebElement internship=driver.findElement(By.xpath("//span[contains(text(),'Graduate Rotational Internship Program')]"));
		if(internship.isDisplayed()) {
			System.out.println(" grip is found");
		}	
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test4 obj=new Test4();
		obj.launch();
		obj.join();
		obj.grip();
		driver.close();
	}

}
