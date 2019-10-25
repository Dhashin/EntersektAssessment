package Steps;

import Base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyDockerDeploy {

    private BaseUtil base;

    public VerifyDockerDeploy(BaseUtil base){

        this.base = base;
    }

    @Given("I navigate to the docker URL")
    public void iNavigateToTheDockerURL() {
    }

    @Then("I should see the qe todo list page")
    public void iShouldSeeTheQeTodoListPage() {
    }
}
