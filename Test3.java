import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	static WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mantr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	//checking for a text inside AI in Education
	public void link() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-hover='LINKS']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'AI in Education')]")).click();
		WebElement system=driver.findElement(By.xpath("//div[@class='single-middle']//span[contains(text(),'Use of Artificial Intelligence to Enhance Education System')]"));
		if(system.isDisplayed()) {
			System.out.println("Use of AI is found");
		}
		Thread.sleep(3000);
	}
	//checking for a text 'Links Suite'
	public void software() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),\"LINKS\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Software & App\")]")).click();
		Thread.sleep(3000);
		WebElement suite=driver.findElement(By.xpath("//h2[contains(text(),'LINKS Suite')]"));
		if(suite.isDisplayed()) {
			System.out.println("Links Suite is found");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test3 obj=new Test3();
		obj.launch();
		obj.link();
		obj.software();
		driver.close();
	}
}
