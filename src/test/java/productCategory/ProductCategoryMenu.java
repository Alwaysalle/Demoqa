package productCategory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helper.AbstractWebTest;

public class ProductCategoryMenu extends AbstractWebTest {

	@Test
	public void productCategorySubMeny() throws InterruptedException {
		WebElement productCategory = driver.findElement(By.id("menu-item-33"));
		Actions action = new Actions(driver);
		action.moveToElement(productCategory).build().perform();
		Thread.sleep(1000);
		WebElement accessories = driver.findElement(By.linkText("Accessories"));
		accessories.click();
		String productCategoryName = driver.findElement(By.className("entry-title")).getText();
		assertEquals("Accessories", productCategoryName);
	}

}
