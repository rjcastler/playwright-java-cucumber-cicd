package pages;

import browser.BrowserManager;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static org.testng.AssertJUnit.assertEquals;

public class FormLoginPageObject {
    public BrowserManager browserManager;

    public FormLoginPageObject(BrowserManager browserManager){
        this.browserManager = browserManager;
    }

    public void enterUname(String uname){
        System.out.println(" Username Field");
        browserManager.page.getByLabel("Username").fill(uname);
    }

    public void enterPassword(String password){
        System.out.println(" Password Field");
        browserManager.page.getByLabel("Password").fill(password);
    }

    public void clickOnLogin(){
        System.out.println("Clicked On Login");
        browserManager.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
    }

    public void validateLogin(String message){
        System.out.println("Login Validation");
        String actualSuccessMsg = browserManager.page.locator("//h4[@class='subheader']").textContent();
        assertEquals(message,actualSuccessMsg);
    }

    public void clickOnLogout(){
        System.out.println("Click on Logout");
        browserManager.page.locator("//i[contains(text(),'Logout')]").click();
    }

}
