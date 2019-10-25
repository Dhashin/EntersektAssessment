package Steps;

import Base.BaseUtil;
import ObjectMaps.ObjectMapQeTodoList;
import TestData.QeTodoListData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DeleteItems {

    private BaseUtil base;
    public DeleteItems(BaseUtil base){
        this.base = base;
    }

    //Create an instance of the test data
    QeTodoListData testData= new QeTodoListData();

    //Create objectMap variable
    ObjectMapQeTodoList qeTodoListMap;

    @Given("I have navigated to the application")
    public void iHaveNavigatedToTheApplication() {
        System.out.println("DEBUG----open browser with docker URL");
        base.Driver.get(testData.applicationURL);
        //Create instance of object map
        qeTodoListMap = new ObjectMapQeTodoList(base.Driver);
    }

    @And("I add a new todo list item")
    public void iAddANewTodoListItem() {
        System.out.println("TESTSTEP----Add a new todo list item");
        qeTodoListMap.submitInputbox.sendKeys("Test1");
        qeTodoListMap.submitButton.click();
    }

    @When("Click the delete link")
    public void clickTheDeleteLink() {
        System.out.println("TESTSTEP----Deleting added item");
        qeTodoListMap.deleteTodoItem1.click();
    }

    @Then("The item should no longer exist")
    public void theItemShouldNoLongerExist() {
        System.out.println("TESTSTEP----Verify that the item was deleted");
        if(base.Driver.findElements(By.xpath("//*[@id=\"edittodo-0\"]")).isEmpty()){
            System.out.println("\tSUCCESS----Verify todolist item");
        }else{
            System.out.println("\tFAILURE----Verify todolist item");
            Assert.fail();
        }
    }
}
