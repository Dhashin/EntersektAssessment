Feature: TodoListVisibleToMultipleUsers
  This feature tests that Multiple users can view the shared public todo list (no live updates, only on refresh)

  Scenario: Verify that todo list items are visible in different windows
    Given I navigate to the application URL
    And I add a todo list item
    When I navigate to the application in a new window
    Then I should see the todo list item i added in the first window
    And I add another todo list item in the second window
    When I navigate to the first browser window
    And I refresh the browser
    Then I should see both todo list items
