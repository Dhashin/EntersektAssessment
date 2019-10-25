package Steps;

import Base.BaseUtil;
import ObjectMaps.ObjectMapQeTodoList;
import TestData.QeTodoListData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class TodoListItemsPersistingAfterRefresh {

    private BaseUtil base;
    public TodoListItemsPersistingAfterRefresh(BaseUtil base){
        this.base = base;
    }

    //Create an instance of the test data
    QeTodoListData testData= new QeTodoListData();

    //Create objectMap variable
    ObjectMapQeTodoList qeTodoListMap;

    @Given("I navigate to the application")
    public void iNavigateToTheApplicationURL() {
        System.out.println("DEBUG----open browser with docker URL");
        base.Driver.get(testData.applicationURL);
        //Create instance of object map
        qeTodoListMap = new ObjectMapQeTodoList(base.Driver);

    }

    @And("I add my first todo list item")
    public void iAddATodoListItem() {
        System.out.println("TESTSTEP----Adding todo list item");
        qeTodoListMap.submitInputbox.sendKeys("Test1");
        qeTodoListMap.submitButton.click();
    }

    @When("I proceed to refresh the browser")
    public void iRefreshTheBrowser() {
        System.out.println("TESTSTEP----Refreshing browser");
        base.Driver.navigate().refresh();
    }

    @Then("I should see the todo list item i added still present")
    public void iShouldSeeTheTodoListItemIAddedStillPresent() {
        System.out.println("TESTSTEP----Verifying Todo List Item");
        if(qeTodoListMap.todoListItem1.getText().equals("Test1")){
            System.out.println("\tSUCCESS----Verify todolist item");
        }else{
            System.out.println("\tFAILURE----Verify todolist item");
            Assert.fail();
        }
    }
}
