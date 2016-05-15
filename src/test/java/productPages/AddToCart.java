package productPages;

import static org.junit.Assert.*;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.AbstractWebTest;

public class AddToCart extends AbstractWebTest {
	@Test
	public void userCase11_ProductPageAddProductToCart() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		int value;
		int valueTwo;
		value = Integer.parseInt(driver.findElement(By.className("count")).getText());
		driver.findElement(By.name("Buy")).click();
		Thread.sleep(5000);
		valueTwo = Integer.parseInt(driver.findElement(By.className("count")).getText());
		Thread.sleep(1000);
		String productTitle = driver.findElement(By.cssSelector(".prodtitle")).getText();
		assertTrue("The item is not in the cart!", isItemInCheckoutCart(productTitle));
		Assert.assertNotEquals("The number of items are not correct.", value, valueTwo);
	}

	private boolean isItemInCheckoutCart(String itemName) {
		driver.get("http://store.demoqa.com/checkout");
		List<WebElement> aTagList = driver
				.findElements(By.cssSelector(".checkout_cart .product_row .wpsc_product_name a"));
		for (WebElement webElement : aTagList) {
			if (webElement.getText().equals(itemName)) {
				return true;
			}
		}
		return false;
	}
}
