Feature: EditTodoItems
  This feature tests that a todo item can be edited

  Scenario: Navigate to application, add an item, update an item, and verify that the item has been updated
    Given I navigated to the application
    And I have added a new todo item
    And I have verified that the todo item was created
    When I update the added item
    Then I should see the item change to the updated value