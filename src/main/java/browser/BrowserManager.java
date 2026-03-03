package browser;

import com.microsoft.playwright.*;

import java.awt.*;

public class BrowserManager {

    public Playwright playwright;
    public Page page;
    public Browser browser;
    public BrowserContext context;


    public void setUp(){
        System.out.println("Playwright setup....");
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screensize.getWidth();
        int height = (int) screensize.getHeight();

        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(width,height));
        page = context.newPage();
    }


    public void tearDown(){
        if(page != null) page.close();
        if(browser != null) browser.close();
        if(playwright != null) playwright.close();
    }

}
