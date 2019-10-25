Feature: EmptyTodoItemsNotAllowed
  This feature tests that Todo items should not be able to be empty

  Scenario Outline: Try to add an empty item todo list item
    Given I open the application in the browser
    And I enter <values> into the input box
    When I click the submit buttion
    Then I should see that no todo list item is added
    Examples:
    |values|
    |""|
    |"        "|
  Scenario Outline: Try to update a todo list item to an empty item
    Given I open the application in the browser
    And I have added one todo list item
    And I enter <values> into the update box
    When I click the update button
    Then I should see that the todo list item has not changed
    Examples:
      |values|
      |""|
      |"        "|


