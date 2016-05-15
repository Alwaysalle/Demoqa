package helper;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractWebTest {
	public static WebDriver driver;

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


}
