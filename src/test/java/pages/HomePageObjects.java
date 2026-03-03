package pages;

import browser.BrowserManager;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePageObjects {
    public BrowserManager browserManager;

    public HomePageObjects(BrowserManager browserManager){
        this.browserManager = browserManager;
    }

    public void navigateToHome(){
        browserManager.page.navigate("https://the-internet.herokuapp.com/");
    }

    public void clickOnFormAuthenticationLink(){
        browserManager.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Form Authentication")).click();
        browserManager.page.waitForURL("**/login");
    }


}
