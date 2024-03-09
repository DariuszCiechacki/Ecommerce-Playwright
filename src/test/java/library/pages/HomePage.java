package library.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import library.main.Set;

public class HomePage {
    public HomePage waitForHomePageContent(){
        Set.page.locator("//div[contains(@class,'shop-menu')]").waitFor(new Locator.WaitForOptions()
                .setState(WaitForSelectorState.VISIBLE));

        return this;
    }
}
