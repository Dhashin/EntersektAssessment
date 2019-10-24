# Task 1 Test Plan

##TestCase 1
###Requirement
Application must be able to deploy in docker
###TestSteps
1. Navigate to http://localhost:8081/todo
2. Once page has loaded verify heading "QE todolist"
3. Close the browser

##TestCase 2
###Requirement
Multiple users should be able to view the shared public todo list (no live updates, only on refresh)
###TestSteps
1. Navigate to http://localhost:8081/todo (Referred to as browserWindow1)
2. Once page has loaded add a new todo list item
3. Navigate to http://localhost:8081/todo in a new browser window(Referred to as browserWindow2)
4. Verify that the todo list item added in browserWindow1 also exists in browserWindow2
5. Add a new todo list item in browserWindow2
6. Refresh browserWindow1
7. Verify that both the todo list added in browserWindow1 and the todo list item added in browserWindow2 both now exist in browserWindow1
8. Close the browser

##TestCase 3
###Requirement
Todo list items should persist after browser refresh
###TestSteps

