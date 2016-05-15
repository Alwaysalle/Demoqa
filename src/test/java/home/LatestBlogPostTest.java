package home;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.AbstractWebTest;

public class LatestBlogPostTest extends AbstractWebTest {

	@Test
	public void userCase06_LatestBlogPostContainsProducts() {
		assertNotNull("There is no products under 'Latest Blog Post'",
				driver.findElement(By.className("footer_featured")).getSize());
	}

	@Test
	public void userCase07_LatestBlogPostProductsToProductPage() {
		for (int j = 1; j < 5; j++) {
			WebElement productLink = driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[" + j + "]/a[1]"));
			String productName = productLink.getText().substring(0, 7);
			productLink.click();
			String productPageName = driver.findElement(By.className("prodtitle")).getText().substring(0, 7);
			assertEquals(
					"Product under Latest Post Blog nr" + j + ", " + productName + " did not get correct productpage ",
					productName, productPageName);
		}
	}

	@Test
	public void userCase08_LatestBlogPostProductsImageToProductPage() {
		for (int j = 1; j < 5; j++) {
			WebElement productImg = driver
					.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[" + j + "]/a[2]/img"));
			String productName = productImg.getAttribute("title").substring(0, 7);
			productImg.click();
			String productPageName = driver.findElement(By.className("prodtitle")).getText().substring(0, 7);
			assertEquals(
					"Product under Latest Post Blog nr" + j + ", " + productName + " did not get correct productpage ",
					productName, productPageName);
		}
	}

	@Test
	public void userCase09_LatestBlogPostProductsMoreDetailsToProductPage() {
		for (int j = 1; j < 5; j++) {
			WebElement productMoreDetails = driver
					.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[" + j + "]/a[3]"));
			String productName = driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[" + j + "]/a[1]"))
					.getText().substring(0, 7);
			productMoreDetails.click();
			String productPageName = driver.findElement(By.className("prodtitle")).getText().substring(0, 7);
			assertEquals(
					"Product under Latest Post Blog nr" + j + ", " + productName + " did not get correct productpage ",
					productName, productPageName);
		}
	}
}
