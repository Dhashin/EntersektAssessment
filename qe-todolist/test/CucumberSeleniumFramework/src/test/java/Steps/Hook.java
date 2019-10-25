package Steps;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    private BaseUtil base;

    public Hook(BaseUtil base){
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        //Creating an instance of webdriver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        base.Driver = new ChromeDriver();
    }

    @After
    public void TearDownTest(){
        //Closing the browser
        base.Driver.quit();
        System.out.println("DEBUG----closing the browser");
    }
}
