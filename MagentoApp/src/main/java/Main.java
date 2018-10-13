

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main {

	WebDriver driver;

	By Myacc = By.linkText("My Account");

	public Main(WebDriver driver) {

	this.driver = driver;

	}

	public void clickOnMyAcc() {

		driver.findElement((Myacc)).click();

	}

}
