package Steps;

import Base.BaseUtil;
import ObjectMaps.ObjectMapQeTodoList;
import TestData.QeTodoListData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class EditItems {

    private BaseUtil base;
    public EditItems(BaseUtil base){
        this.base = base;
    }

    //Create an instance of the test data
    QeTodoListData testData= new QeTodoListData();

    //Create objectMap variable
    ObjectMapQeTodoList qeTodoListMap;

    @Given("I navigated to the application")
    public void iNavigatedToTheApplication() {
        System.out.println("DEBUG----open browser with docker URL");
        base.Driver.get(testData.applicationURL);
        //Create instance of object map
        qeTodoListMap = new ObjectMapQeTodoList(base.Driver);
    }

    @And("I have added a new todo item")
    public void iHaveAddedANewTodoItem() {
        System.out.println("TESTSTEP----Adding new todo item");
        qeTodoListMap.submitInputbox.sendKeys("Test1");
        qeTodoListMap.submitButton.click();
    }

    @And("I have verified that the todo item was created")
    public void iHaveVerifiedThatTheTodoItemWasCreated() {
        System.out.println("TESTSTEP----verifying todo item was created");
        if(qeTodoListMap.todoListItem1.getText().equals("Test1")){
            System.out.println("\tSUCCESS----Verify todolist item");
        }else{
            System.out.println("\tFAILURE----Verify todolist item");
            Assert.fail();
        }
    }

    @When("I update the added item")
    public void iUpdateTheAddedItem() {
        System.out.println("TESTSTEP----updating value of the todo item");
        qeTodoListMap.updateInputBox1.sendKeys("TestUpdated1");
        qeTodoListMap.updateButton1.click();
    }

    @Then("I should see the item change to the updated value")
    public void iShouldSeeTheItemChangeToTheUpdatedValue() {
        System.out.println("TESTSTEP----verifying then todo item was successfully updated");
        if(qeTodoListMap.todoListItem1.getText().equals("TestUpdated1")){
            System.out.println("\tSUCCESS----Verify todolist item");
        }else{
            System.out.println("\tFAILURE----Verify todolist item");
            Assert.fail();
        }
    }
}
