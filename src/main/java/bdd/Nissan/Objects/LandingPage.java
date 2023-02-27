package bdd.Nissan.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.Nissan.Commom.CommonActions;


public class LandingPage {

	CommonActions actions;
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions =new CommonActions(driver);
	}

	@FindBy(xpath = "(//span[text()='Vehicles'])[1]")
	WebElement vehicle;

	public void clickvehicle() throws InterruptedException {
		actions.click(vehicle);
		Thread thread = new Thread();
		thread.sleep(3000);
	}

}
