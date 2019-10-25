package Steps;

import Base.BaseUtil;
import ObjectMaps.ObjectMapQeTodoList;
import TestData.QeTodoListData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodoListVisibleToMultipleUsers {

    private BaseUtil base;
    WebDriver tempDriver;

    public TodoListVisibleToMultipleUsers(BaseUtil base){
        this.base = base;
    }

    //Create an instance of the test data
    QeTodoListData testData= new QeTodoListData();

    //Create objectMap variable
    ObjectMapQeTodoList qeTodoListMap;
    ObjectMapQeTodoList tempObjectMap;
    //Create String varaible to hold the handles of each browser window we open
    String firstBrowserWindow;
    String secondBrowserWindow;

    @Given("I navigate to the application URL")
    public void iNavigateToTheApplicationURL() {
        System.out.println("DEBUG----open browser with docker URL");
        base.Driver.get(testData.applicationURL);
        //Create instance of object map
        qeTodoListMap = new ObjectMapQeTodoList(base.Driver);
        firstBrowserWindow = base.Driver.getWindowHandle();
        System.out.println("DEBUG----FirstBrowserWindowHandle ="+firstBrowserWindow);
    }

    @And("I add a todo list item")
    public void iAddATodoListItem() throws InterruptedException {
        System.out.println("TESTSTEP----Adding todo list item");
        qeTodoListMap.submitInputbox.sendKeys("Test1");
        qeTodoListMap.submitButton.click();
        Thread.sleep(5000);

    }

    @When("I navigate to the application in a new window")
    public void iNavigateToTheApplicationInANewWindow() throws InterruptedException  {
        tempDriver = new ChromeDriver();
        tempDriver.get(testData.applicationURL);
        secondBrowserWindow = tempDriver.getWindowHandle();
        System.out.println("DEBUG----SecondBrowserWindowHandle ="+secondBrowserWindow);
    }

    @Then("I should see the todo list item i added in the first window")
    public void iShouldSeeTheTodoListItemIAddedInTheFirstWindow() {
        tempObjectMap = new ObjectMapQeTodoList(tempDriver);
        if(tempObjectMap.todoListItem1.getText().equals("Test1")){
            System.out.println("\tSUCCESS----Verify todolist item");
        }else{
            System.out.println("\tFAILURE----Verify todolist item");
        }
    }

    @And("I add another todo list item in the second window")
    public void iAddAnotherTodoListItemInTheSecondWindow() {
        tempObjectMap.submitInputbox.sendKeys("Test2");
        tempObjectMap.submitButton.click();
    }

    @When("I navigate to the first browser window")
    public void iNavigateToTheFirstBrowserWindow() {
        base.Driver.switchTo().window(firstBrowserWindow);

    }

    @And("I refresh the browser")
    public void iRefreshTheBrowser() {
        base.Driver.navigate().refresh();
    }

    @Then("I should see both todo list items")
    public void iShouldSeeBothTodoListItems() {
        if(qeTodoListMap.todoListItem1.getText().equals("Test1") && qeTodoListMap.todoListItem2.getText().equals("Test2")){
            System.out.println("\tSUCCESS----Verify todolist items");
        }else{
            System.out.println("\tFAILURE----Verify todolist items");
        }
        tempDriver.quit();
    }

}
