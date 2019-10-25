Feature: DeleteItem
  This feature tests that items can be deleted

  Scenario: Navigate to application, add an item, delete the item and verify that the item is deleted
    Given  I have navigated to the application
    And I add a new todo list item
    When Click the delete link
    Then The item should no longer exist