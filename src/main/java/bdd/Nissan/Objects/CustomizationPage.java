package bdd.Nissan.Objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import bdd.Nissan.Commom.CommonActions;

public class CustomizationPage {

	public CustomizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[text()='Build & Price'])[1]")
	WebElement buildElement;

	public void customization(WebDriver driver) {
		// CommonActions.click(buildElement);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(buildElement)).click();
	}

}
