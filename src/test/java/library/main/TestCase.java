package library.main;

import com.ecommerce_playwright.config.ConfigLoader;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestCase {
    @BeforeClass(description = "Launch application")
    @Parameters({"headless"})
    public void launchApplication(boolean headless){
        Set.playwright = Playwright.create();
        Set.browser = Set.playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(headless));
        Set.context = Set.browser.newContext(new Browser.NewContextOptions().setTimezoneId("Europe/Warsaw"));
        Set.page = Set.browser.newPage();
        Set.page.setViewportSize(1700, 900);
        Set.page.setDefaultNavigationTimeout(30000);
        Set.page.navigate(ConfigLoader.getProperty("baseUrl"));
    }

    @AfterClass(description = "Tear down")
    public void tearDown(){
        Set.playwright.close();
    }
}
