package helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import addToCart.AddToCartWindowTest;
import addToCart.ContinueShoppingTest;
import addToCart.GoToCheckoutTest;
import home.LatestBlogPostTest;
import home.ProductsTest;
import junit.framework.TestSuite;
import productCategory.ProductCategoryMenuTest;
import productPages.AddToCartTest;
import productPages.ProductPageTest;
import searchProducts.SearchFieldTest;

@RunWith(Suite.class)
@SuiteClasses({ LatestBlogPostTest.class, ProductsTest.class, ProductCategoryMenuTest.class,  AddToCartTest.class,
	ProductPageTest.class, SearchFieldTest.class,GoToCheckoutTest.class, ContinueShoppingTest.class, AddToCartWindowTest.class})
public class AllTests {

}
