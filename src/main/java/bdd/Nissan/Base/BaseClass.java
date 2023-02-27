package bdd.Nissan.Base;

import static bdd.Nissan.Utils.IConstant.*;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import bdd.Nissan.Objects.CustomizationPage;
import bdd.Nissan.Objects.GetAQuotePage;
import bdd.Nissan.Objects.LandingPage;
import bdd.Nissan.Objects.VehiclePage;
import bdd.Nissan.Utils.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	
	public static WebDriver driver;
	public static LandingPage landingPage;
	public static VehiclePage vehiclePage;

	public static CustomizationPage customizationPage;
	public static GetAQuotePage getAQuotePage;
	
	ReadProperties config = new ReadProperties();
	protected Select select;

	
	public void setUpDriver(String browser) {
		// String browser = config.getProperty(BROWSER);
		String url = config.getProperty(URL);
		long pageLoadWait = config.getNumProperty(PAGELOAD_WAIT);
		long implicitlyWait = config.getNumProperty(IMPLECIT_WAIT);
		initDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		initClasses(driver);

	}

	public void initClasses(WebDriver driver) {
		landingPage = new LandingPage(driver);
		vehiclePage = new VehiclePage(driver);
		getAQuotePage = new GetAQuotePage(driver);
		customizationPage = new CustomizationPage(driver);
	}

	public void initDriver(String driverName) {
		switch (driverName) {

		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		}
	}

	
	//public void tearUp() {
	//	driver.quit();

	//}

	

}
