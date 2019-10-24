# Task 1 Test Plan

## TestCase 1
### Requirement
Application must be able to deploy in docker
### TestSteps
1. Navigate to http://localhost:8081/todo
2. Once page has loaded verify heading "QE todolist"
3. Close the browser

## TestCase 2
### Requirement
Multiple users should be able to view the shared public todo list (no live updates, only on refresh)
### TestSteps
1. Navigate to http://localhost:8081/todo (Referred to as browserWindow1)
2. Once page has loaded add a new todo list item
3. Navigate to http://localhost:8081/todo in a new browser window(Referred to as browserWindow2)
4. Verify that the todo list item added in browserWindow1 also exists in browserWindow2
5. Add a new todo list item in browserWindow2
6. Refresh browserWindow1
7. Verify that both the todo list added in browserWindow1 and the todo list item added in browserWindow2 both now exist in browserWindow1
8. Close the browser

## TestCase 3
### Requirement
Todo list items should persist after browser refresh
### TestSteps
1. Navigate to http://localhost:8081/todo
2. Once page has loaded add a new todo list item
3. Refresh the browser
4. Verify the todo list item that you added still exists
5. Close the browser

## TestCase 4
### Requirement
Todo items should not be able to be empty
### TestSteps
1. Navigate to http://localhost:8081/todo
2. Click the submit button without adding anything into the submit input box
3. Verify that no to do list item is added
4. Add a new todo list item
5. Verify the todo list item is added
6. Click the update button without entering anything into update input box
7. Verify that the todo list item did not change
8. In the submit input box enter a whitespace and then click the submit button
9. Verify that no todo list item is added
10. In the update input box enter a whitespace and then click the update button
11. Verify that the todo list item is not updated
12. Close the browser

## TestCase 5
### Requirement
Should be able to add todo items
### TestSteps
1. Navigate to http://localhost:8081/todo
2. Enter "Test1" into the input box and click submit
3. Verify the "Test1" todo list item is added
4. Enter "Test2" into the input box and click submit
5. Verify the "Test2" todo list item is added
6. Close the browser

## TestCase 6
### Requirement
Should be able to delete todo items
### TestSteps
1. Navigate to http://localhost:8081/todo
2. Enter "Test1" into the input box and click submit
3. Enter "Test2" into the input box and click submit
4. Delete the "Test1" todo list item by clicking the cross button on the left of it
5. Verify the "Test1" todo list item no longer exists and only the "Test2" todo item exists
6. Delete the "Test2" todo list item by clicking the cross button on the left of it
7. Verify that no todo list items exist
8. Close the browser

## TestCase 7
### Requirement
Should be able to edit todo items
### TestSteps
1. Navigate to http://localhost:8081/todo
2. Enter "Test1" into the input box and click submit
3. In the update input box enter "TestUpdated1" and click update 
4. Verify the "Test1" todo list item has updated to "TestUpdated1"
5. Close the browser



