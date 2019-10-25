Feature: VerifyDockerDeploy
  This feature verifies that the application can deploy in docker

  Scenario: Navigate to docker URL and verify webpage
    Given I navigate to the docker URL
    Then I should see the qe todo list page
