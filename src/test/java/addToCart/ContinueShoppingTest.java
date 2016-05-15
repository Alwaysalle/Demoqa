package addToCart;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.AbstractWebTest;

public class ContinueShoppingTest extends AbstractWebTest {
	@Test
	public void continueShoppingButton() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		WebElement addToCart = driver.findElement(By.className("input-button-buy"));
		String productPageUrl = driver.getCurrentUrl();
		addToCart.click();
		Thread.sleep(3000);
		WebElement continueShopping = driver.findElement(By.className("continue_shopping"));
		continueShopping.click();
		Thread.sleep(3000);
		assertTrue(driver.getCurrentUrl().contains(productPageUrl));
		
	}
}
