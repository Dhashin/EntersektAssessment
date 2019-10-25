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

public class NoEmptyTodoListItems {

    private BaseUtil base;
    public NoEmptyTodoListItems(BaseUtil base){
        this.base = base;
    }

    //Create an instance of the test data
    QeTodoListData testData= new QeTodoListData();

    //Create objectMap variable
    ObjectMapQeTodoList qeTodoListMap;


    @Given("I open the application in the browser")
    public void iOpenTheApplicationInTheBrowser() {
        System.out.println("DEBUG----open browser with docker URL");
        base.Driver.get(testData.applicationURL);
        //Create instance of object map
        qeTodoListMap = new ObjectMapQeTodoList(base.Driver);

    }

    @When("I click the submit buttion")
    public void iClickTheSubmitButtion() {
        System.out.println("TESTSTEP----Clicking submit button");
        qeTodoListMap.submitButton.click();
    }

    @Then("I should see that no todo list item is added")
    public void iShouldSeeThatNoTodoListItemIsAdded() {
        System.out.println("TESTSTEP----Check that no todo list item is added");
        if(base.Driver.findElements(By.xpath("//*[@id=\"edittodo-0\"]")).isEmpty()){
            System.out.println("\tSUCCESS----Verify todolist item");
        }else{
            System.out.println("\tFAILURE----Verify todolist item");
            Assert.fail();
        }

    }

    @When("I click the update button")
    public void iClickTheUpdateButton() {
        System.out.println("TESTSTEP----Clicking Update button");
        qeTodoListMap.updateButton1.click();
    }

    @Then("I should see that the todo list item has not changed")
    public void iShouldSeeThatTheTodoListItemHasNotChanged() {
        System.out.println("TESTSTEP----Verify that Test1 Todo Item still exists");
        if(qeTodoListMap.todoListItem1.getText().equals("Test1")){
            System.out.println("\tSUCCESS----Verify todolist item");
        }else{
            System.out.println("\tFAILURE----Verify todolist item");
            Assert.fail();

        }
    }

    @And("I have added one todo list item")
    public void iHaveAddedOneTodoListItem() {
        System.out.println("TESTSTEP----Adding a todo list item");
        qeTodoListMap.submitInputbox.sendKeys("Test1");
        qeTodoListMap.submitButton.click();
    }

    @And("I enter (.*) into the input box")
    public void iEnterIntoTheInputBox(String value) {
        System.out.println("TESTSTEP----Entering values into submit input box");
        value=value.replaceAll("\"", "");
        qeTodoListMap.submitInputbox.sendKeys(value);
    }

    @And("I enter (.*) into the update box")
    public void iEnterValuesIntoTheUpdateBox(String value) {
        System.out.println("TESTSTEP----Entering values into update input box");
        value=value.replaceAll("\"", "");
        qeTodoListMap.updateInputBox1.sendKeys(value);

    }
}
