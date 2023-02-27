package bdd.Nissan.Commom;

import static bdd.Nissan.Utils.IConstant.*;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import bdd.Nissan.Reportings.Logs;
import bdd.Nissan.Utils.ReadProperties;

public class CommonActions {
	
	public  WebDriverWait wait;
	ReadProperties config = new ReadProperties();
	
	public CommonActions(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(config.getNumProperty(EXPLECIT_WAIT )));
	}
	

	public  void click(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			Logs.log(element + " ---> has been clicked");
		} catch (NullPointerException | NoSuchElementException|  TimeoutException e) {
			Logs.log(element + " ---> Element Not Found");
			Assert.fail();
		}

	}

	public  void validate(WebElement element, String expected) {
		String actual = "";
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			actual = element.getText();
			Logs.log("Validating ---> Actual : *** " + actual + " ***. Expected : *** " + expected + " ***");

		} catch (NullPointerException | NoSuchElementException e) {

			Logs.log(element + " ---> Element Not Found");

			Assert.fail();
		}
		Assert.assertEquals(actual, expected);

	}

	public  void insert(WebElement element, String value) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.sendKeys(value);
			Logs.log(value + " <--- This value has been passed into ---> " + element);

		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + " ---> Element Not Found");

			Assert.fail();

		}

	}
}
