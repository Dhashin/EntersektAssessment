# Task 2

## Bug 1

###Requirement: No todo Item should be blank

### Expected Behaviour 	: When I add a new todo list with a whitespace in the input box, no todo item should be added
### Actual Behaviour 	: When i had a new todo list with a whitespace in the input box, a blank todo item is added

### Steps to reproduce :

1. Navigate to http://localhost:8081/todo
2. Enter a whitespace(By clicking the spacebar) into the input box
3. Click the submit button
4. Note the blank todo item that is added were none should be added

## Bug 2

###Requirement: No todo Item should be blank

### Expected Behaviour 	: When I update a todo item with a an empty value, the todo item should not be added
### Actual Behaviour 	: When I update a todo item with a an empty value, the todo item is updated to a blank todo item

### Steps to reproduce :

1. Navigate to http://localhost:8081/todo
2. Enter "TestBug" into the submit input box
3. Click the submit button
4. Verify the todo list item was added
5. Click the update button on the todo list item that was created
6. Note that the todo list item was updated to be blank, were it should not have changed

## Bug 3

###Requirement: No todo Item should be blank

### Expected Behaviour 	: When I update a todo item with a an whitespace value(By clicking the spacebar), the todo item should not be added
### Actual Behaviour 	: When I update a todo item with a an whitespace value(By clicking the spacebar), the todo item is updated to a blank todo item

### Steps to reproduce :

1. Navigate to http://localhost:8081/todo
2. Enter "TestBug" into the submit input box
3. Click the submit button
4. Verify the todo list item was added
5. Enter a whitespace into the update input box of the todo item you just added
6. Click the update button on the todo list item that was created
7. Note that the todo list item was updated to be blank, were it should not have changed


