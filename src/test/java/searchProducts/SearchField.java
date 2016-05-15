package searchProducts;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import helper.AbstractWebTest;

public class SearchField extends AbstractWebTest {

	@Test
	public void testSearchForProductThatExists() {
		String product = "apple";
		driver.findElement(By.className("search")).sendKeys(product + Keys.ENTER);
		ArrayList<String> nrOfNotValuedSearch = new ArrayList<String>();
		List<WebElement> content = driver.findElements(By.cssSelector("#content .product_grid_display"));
		if (content.size() > 0) {
			for (int i = 1; i < content.size(); i++) {
				String productName = driver
						.findElement(
								By.xpath("//*[@id='grid_view_products_page_container']/div/div[" + i + "]/div[2]/h2/a"))
						.getText();
				if (productName.contains(product) != true) {
					nrOfNotValuedSearch.add(productName);

				}
			}
		} else {
			String notFoundText = driver.findElement(By.xpath("//*[@id='content']/p")).getText();
			assertEquals(
					"Sorry, but nothing matched your search criteria. Please try again with some different keywords.",
					notFoundText);
		}
		int arraysize = nrOfNotValuedSearch.size();
		assertEquals("There where 1 or more products showing with no equal to the search, ", 0, arraysize);
	}

	@Test
	public void testSearchForProductThatNotExists() {
		String product = "kalle";
		driver.findElement(By.className("search")).sendKeys(product + Keys.ENTER);
		ArrayList<String> nrOfNotValuedSearch = new ArrayList<String>();
		List<WebElement> content = driver.findElements(By.cssSelector("#content .product_grid_display"));
		if (content.size() > 0) {
			for (int i = 1; i < content.size(); i++) {
				String productName = driver
						.findElement(
								By.xpath("//*[@id='grid_view_products_page_container']/div/div[" + i + "]/div[2]/h2/a"))
						.getText();
				if (productName.contains(product) != true) {
					nrOfNotValuedSearch.add(productName);

				}
			}
		} else {
			String notFoundText = driver.findElement(By.xpath("//*[@id='content']/p")).getText();
			assertEquals(
					"Sorry, but nothing matched your search criteria. Please try again with some different keywords.",
					notFoundText);
		}
		int arraysize = nrOfNotValuedSearch.size();
		assertEquals("There where 1 or more products showing with no equal to the search, ", 0, arraysize);
	}

}
