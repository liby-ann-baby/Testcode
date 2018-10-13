
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.annotations.VisibleForTesting;

public class MagentoTest {
	
	

	public void posCredentials() throws Exception {
		String url = "http://www.magento.com";

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(url);

		Main m = new Main(driver);
		m.clickOnMyAcc();

		Thread.sleep(3000);

		Login l1 = new Login(driver);
		l1.typeEmail("subramanyaraj87@gmail.com");
		Thread.sleep(2000);

		l1.typePwd("Welcome123");
		Thread.sleep(2000);

		l1.login();
		Thread.sleep(2000);

		Logout l2 = new Logout(driver);

		l2.clickOnLogout();
		Thread.sleep(2000);
		driver.quit();

	}
}
