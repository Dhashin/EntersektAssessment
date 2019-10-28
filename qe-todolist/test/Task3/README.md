# Task 3

##Testing stategy for the Cordova ported qe-todolist

###Manual Testing

To manually test the qe-todolist app we will need the app to be deployed to an Emulator or Mobile device.
Thereafter we may perform the manual tests outlined in Task 1, with some changes and additions to the requirements  :

1. Instead of previously verifying that the app could be deployed on docker. We will now verify that the app can be deployed on the Emulator/Mobile Device
2. We would like to, additionally, verify the positioning of elements in the application. Are they aligned correctly? Do they fit on the Devices' screen
3. We would also want to test our app on different screen sizes, different Operation Systems(iOS and Android), and different versions of those operating systems.

###Automated Testing

To perform automated testing of our hybrid app, we will need to extend our Java-Selenium-Cucumber Automation Test suite :
1. We will need to include appium in our test suite as this will allow us to automate against mobile devices/emulators
2. We will need to set up a class whereby we setup all the driver requirements needed for Mobile Testing
3. We will need to alter our test scripts so that the driver can be passed as a parameter and so that we can re-use the testcases 
	NOTE : Here we are assuming that when we port the app using Cordova, that all the ID's stay the same. If the ID's have changed, we will have to write new test cases to cater for those changes.
4. We will need to extend the Test Suite to allow us to run tests against different Devices/Device Versions/Browsers/Mobile Operating Systems/Screen sizes, by allowing a parameter to be passed at the beginning of test execution

 


