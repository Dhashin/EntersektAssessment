package Steps;

import Base.BaseUtil;
import ObjectMaps.ObjectMapQeTodoList;
import TestData.QeTodoListData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyDockerDeploy {

    private BaseUtil base;

    public VerifyDockerDeploy(BaseUtil base){

        this.base = base;
    }

    //Create an instance of the test data
    QeTodoListData testData= new QeTodoListData();


    @Given("I navigate to the docker URL")
    public void iNavigateToTheDockerURL(){
        System.out.println("DEBUG----open browser with docker URL");
        base.Driver.get(testData.applicationURL);
    }

    @Then("I should see the qe todo list page")
    public void iShouldSeeTheQeTodoListPage() {
        //Create instance of object map
        ObjectMapQeTodoList qeTodoListMap = new ObjectMapQeTodoList(base.Driver);

        System.out.println("TESTSTEP----Verify heading QE todolist");
        //Get text of Element
        String heading = qeTodoListMap.headingQeTodoList.getText();
        //Verify Page Heading Exists
        if(heading.contains("QE todolist")){
            System.out.println("\tSUCCESS----Verify heading QE todolist");
        }else{
            System.out.println("\tFAILURE----Verify heading QE todolist");
        }


    }
}
