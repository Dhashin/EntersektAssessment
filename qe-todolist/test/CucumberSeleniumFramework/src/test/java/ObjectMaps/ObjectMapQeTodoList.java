package ObjectMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectMapQeTodoList {
    public ObjectMapQeTodoList(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }


    //QE Todolist Heading
    @FindBy(xpath="/html/body/h1")
    public WebElement headingQeTodoList;
    //Input test box
    @FindBy(xpath="//*[@id=\"newtodo\"]")
    public WebElement submitInputbox;
    //Submit button for adding new items
    @FindBy(xpath="//*[@id=\"new-submit\"]")
    public WebElement submitButton;
    //First added todolist item
    @FindBy(xpath="//*[@id=\"edittodo-0\"]")
    public WebElement todoListItem1;
    //Second added todolist item
    @FindBy(xpath="//*[@id=\"edittodo-1\"]")
    public WebElement todoListItem2;





}
