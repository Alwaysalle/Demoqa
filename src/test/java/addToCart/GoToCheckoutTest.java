package addToCart;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.AbstractWebTest;

public class GoToCheckoutTest extends AbstractWebTest {

	@Test
	public void goToCheckoutButton() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		WebElement addToCart = driver.findElement(By.className("input-button-buy"));
		addToCart.click();
		Thread.sleep(3000);
		WebElement goToCheckOut = driver.findElement(By.className("go_to_checkout"));
		goToCheckOut.click();
		Thread.sleep(3000);
		assertTrue(driver.getCurrentUrl().contains("/checkout"));
	}

}
