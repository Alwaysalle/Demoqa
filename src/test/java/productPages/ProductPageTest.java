package productPages;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.openqa.selenium.By;

import helper.AbstractWebTest;

public class ProductPageTest extends AbstractWebTest {

	@Test
	public void userCase10_ProductPageContainsInformation() {
		driver.findElement(By.className("buynow")).click();

		if ("".equals(driver.findElement(By.className("prodtitle")))
				|| "".equals(driver.findElement(By.className("product_description")).getText())
				|| "".equals(driver.findElement(By.className("wpsc_product_price")).getText())) {
			fail("Not all information is present at page");
		}
	}

}