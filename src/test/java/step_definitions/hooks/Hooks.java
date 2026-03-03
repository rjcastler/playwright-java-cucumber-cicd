package step_definitions.hooks;

import browser.BrowserManager;
import io.cucumber.java.*;

public class Hooks {
    private final BrowserManager browserManager;

    public Hooks(BrowserManager browserManager){
        this.browserManager = browserManager;
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all");
    }

    @Before
    public void setup(){
        System.out.println("Setup");
        browserManager.setUp();
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario){
        if(browserManager.page != null) {
            byte[] screenshot = browserManager.page.screenshot();
            scenario.attach(screenshot,"image/png","Step Screenshot");
        }
    }

    @After
    public void tearDown(){
        System.out.println("Tear Down");
        browserManager.tearDown();
    }

}
