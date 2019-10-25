Feature: AddTodoListItems
  This feature verifies that todo list items can be added

  Scenario Outline: Navigate to application, add an todo list item and verify that it exists
    Given I navigate to the qe todo list application
    When I enter a <value> into the inputbox
    And I click the submit button
    Then I should see the <value> that i have added
    Examples:
    |value|
    |Test1|
    |Test2|