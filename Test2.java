import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	static WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mantr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	//displaying all link's of href attribute of 'a' tag 
	public void programs() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-hover='Programs']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Workshops')]")).click();
		List<WebElement> work= driver.findElements(By.tagName("a"));
		for(WebElement allLinks : work) {
			System.out.println(allLinks.getText()+"-"+allLinks.getAttribute("href"));
		}
		Thread.sleep(3000);
	}
	//checking for text 'Setup'
	public void sos() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-hover='Programs']")).click();
		driver.findElement(By.xpath("//a[@href='/programs/student-sos-program/']")).click();
		WebElement student=driver.findElement(By.xpath("//div[@class='media-body']//h4[contains(text(),'Setup')]"));
		if(student.isDisplayed()) {
			System.out.println("Setup element is found");
		}
		Thread.sleep(5000);
	}
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Test2 obj=new Test2();
		obj.launch();
		obj.programs();
		obj.sos();
		driver.close();
		

	}

}
