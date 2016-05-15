package checkout_YourCart;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyCart {
	private static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String setProperties = "/Users/Alicia/Documents/workspace/chromedriver";
		System.setProperty("webdriver.chrome.driver", setProperties);
	}

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("http://store.demoqa.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void goToCheckoutWithEmptyCart() throws InterruptedException {
		// driver.findElement(By.className("cart_icon")).click();
		/*
		 * driver.findElement(By.className("buynow")).click(); WebElement
		 * addToCart = driver.findElement(By.className("input-button-buy"));
		 * String productPageName =
		 * driver.findElement(By.className("prodtitle")).getText();
		 * addToCart.click(); Thread.sleep(3000); WebElement goToCheckOut =
		 * driver.findElement(By.className("go_to_checkout"));
		 * goToCheckOut.click(); Thread.sleep(3000); String title =
		 * driver.findElement(By.className("entry-title")).getText(); String
		 * productInCheckOut = driver.findElement(By.xpath(
		 * "//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[2]/a"
		 * )).getText();
		 * assertTrue(driver.getCurrentUrl().contains("/checkout"));
		 * 
		 * 
		 * }
		 */

	}

}
