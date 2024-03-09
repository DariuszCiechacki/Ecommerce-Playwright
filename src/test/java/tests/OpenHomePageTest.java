package tests;

import library.main.TestCase;
import library.pages.HomePage;
import org.testng.annotations.Test;

public class OpenHomePageTest extends TestCase {

    @Test
    public void openHomePageTest(){
        HomePage homePage = new HomePage();
        homePage.waitForHomePageContent();
    }
}
