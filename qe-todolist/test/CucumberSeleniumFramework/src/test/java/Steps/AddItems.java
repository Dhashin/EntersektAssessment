package Steps;

import Base.BaseUtil;
import ObjectMaps.ObjectMapQeTodoList;
import TestData.QeTodoListData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddItems {

    private BaseUtil base;
    public AddItems(BaseUtil base){
        this.base = base;
    }

    //Create an instance of the test data
    QeTodoListData testData= new QeTodoListData();

    //Create objectMap variable
    ObjectMapQeTodoList qeTodoListMap;

    @Given("I navigate to the qe todo list application")
    public void iNavigateToTheQeTodoListApplication() {
        System.out.println("DEBUG----open browser with docker URL");
        base.Driver.get(testData.applicationURL);
        //Create instance of object map
        qeTodoListMap = new ObjectMapQeTodoList(base.Driver);
    }

    @When("I enter a (.*) into the inputbox")
    public void iEnterAValueIntoTheInputbox(String value) {
        System.out.println("TESTSTEP----Entering value into input box");
        qeTodoListMap.submitInputbox.sendKeys(value);
    }

    @And("I click the submit button")
    public void iClickTheSubmitButton() {
        System.out.println("TESTSTEP----Clicking submit button");
        qeTodoListMap.submitButton.click();
    }

    @Then("I should see the (.*) that i have added")
    public void iShouldSeeTheItemThatIHaveAdded(String value) {
        System.out.println("TESTSTEP----Verify that the todo list itmes were added");
        if(qeTodoListMap.todoListItem1.getText().equals(value)){
            System.out.println("\tSUCCESS----Verify todolist item");
        }else{
            System.out.println("\tFAILURE----Verify todolist item");
            Assert.fail();
        }

    }

}
