package addToCart;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.AbstractWebTest;

public class AddToCartWindow extends AbstractWebTest {

	@Test
	public void addCorrectProductToCart() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		WebElement addToCart = driver.findElement(By.className("input-button-buy"));
		String productPageName = driver.findElement(By.className("prodtitle")).getText();
		addToCart.click();
		Thread.sleep(3000);
		String notificationText = driver.findElement(By.xpath("//*[@id='fancy_notification_content']/span")).getText();
		assertTrue("The correct product was not shown in pop-up", notificationText.contains(productPageName));
	}
}
