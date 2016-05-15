package home;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.AbstractWebTest;

public class Products extends AbstractWebTest {

	@Test
	public void userCase01_ProductPageByBuyNowButton() {
		String productName = driver.findElement(By.cssSelector(".product_description>h2")).getText();
		driver.findElement(By.className("buynow")).click();
		String productPageName = driver.findElement(By.className("prodtitle")).getText();
		assertEquals("The product isn't the same after link from the homepage", productName, productPageName);
	}

	@Test
	public void userCase02_ProductPageByImage() {
		String productName = driver.findElement(By.cssSelector(".product_description>h2")).getText();
		WebElement img = driver.findElement(By.xpath("//div[@class='featured_image']"));
		img.click();
		String productPageName = driver.findElement(By.className("prodtitle")).getText();
		assertEquals("The product isn't the same after link from the homepage", productName, productPageName);
	}

	@Test
	public void userCase03_ProductPageByMoreInformation() {
		String productName = driver.findElement(By.cssSelector(".product_description>h2")).getText();
		driver.findElement(By.xpath("//a[@title='More Info']")).click();
		String productPageName = driver.findElement(By.className("prodtitle")).getText();
		assertEquals("The product isn't the same after link from the homepage", productName, productPageName);
	}

	@Test
	public void userCase04_SlideAutomatic() throws InterruptedException {
		ArrayList<String> nameOfProductsInSlide = new ArrayList<String>();
		String currentSlide;
		for (int i = 0; i < 100; i++) {
			currentSlide = driver.findElement(By.cssSelector(".product_description>h2")).getText();
			if (false == nameOfProductsInSlide.contains(currentSlide)) {
				nameOfProductsInSlide.add(currentSlide);
			} else {
				break;
			}
			Thread.sleep(10000);
		}
		int x = nameOfProductsInSlide.size();
		assertEquals("The slide in Home page didn't get the correct number of slides", 3, x);
	}

	@Test
	public void userCase05_SlideManualy() throws InterruptedException {

		List<WebElement> aTagList = driver.findElements(By.cssSelector("#slide_menu a"));
		String firstProductSlide = "";
		String secondProductSlide;
		for(WebElement webElement: aTagList){
			webElement.click();
			Thread.sleep(1000);
			secondProductSlide = driver.findElement(By.cssSelector(".product_description>h2")).getText();
			assertNotEquals(firstProductSlide, secondProductSlide);
			firstProductSlide = secondProductSlide;
		}
	}
	
}
