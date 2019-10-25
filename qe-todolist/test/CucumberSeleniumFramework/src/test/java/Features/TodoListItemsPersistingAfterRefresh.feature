Feature: TodoListVisibleToMultipleUsers
  This feature tests that todo list items persist after refresh of the browser

  Scenario: Add todo list items, refresh browser and verify items exist
    Given I navigate to the application
    And I add my first todo list item
    When I proceed to refresh the browser
    Then I should see the todo list item i added still present

