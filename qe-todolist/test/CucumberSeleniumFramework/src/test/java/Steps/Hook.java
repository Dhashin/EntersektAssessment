package Steps;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {
        //Creating an instance of webdriver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        base.Driver = new ChromeDriver();
    }

    @After
    public void TearDownTest() {
        //Closing the browser
        try {
            do {
                int counter = 0;
                WebElement todoItem = base.Driver.findElement(By.xpath(("//a[@href='/todo/delete/" + counter + "']")));
                todoItem.click();
                counter++;
            } while (1 != 2);
        } catch (Exception e) {
            System.out.println("DEBUG---- completed removing data");
        }

        base.Driver.quit();
        System.out.println("DEBUG----closing the browser");
    }
}
