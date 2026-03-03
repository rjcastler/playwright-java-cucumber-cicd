package step_definitions.hooks;

import browser.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

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

    @After
    public void tearDown(){
        System.out.println("Tear Down");
        browserManager.tearDown();
    }

}
