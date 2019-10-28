# EntersektAssessment

## Summary

This repo serves as my answers to the EntersektAssessment. As requested the answers are written in Markdown and placed in the test folder. 
In the test folder I have created folders for each of the Tasks and placed the markdown files for each task in the respected folders

Note : I did not attempt Task 4 

### Details about the Task 1 Automation Test Suite

For Task 1 I have created both a manual and automated test suite.
For the Automated Test suite I have used a Java-Selenium-Cucumber framework with Maven to manage my packages.
The Framework is in the test folder of the qe-todoist app and is named "CucumberSeleniumFramework"
I used IntelliJ to develop the Framework and this would be the preferred IDE thats used to open the project.
The project was also developed on windows with Java 1.8. I have tested that the Framework also runs on linux but a few changes will be required to be made to the code which will be highlighted in the steps below.

Note : 	I tried to set up a CucumberJS Framework for automation as I was aware that this is what the company is using and also what would have been ideal for 
		for this NodeJS app but ran into trouble with the available information for this Framework. Hence i was unable to get the "boiler plate" code running
		in a manner that was satisfactory. Therefore I switched to Java as I'm more familiar with this.
		
##Windows
###Steps to open the Framework

1. Download and install IntelliJ (If you don't have an Ultimate license you can use the community version) : https://www.jetbrains.com/idea/download/#section=windows
2. Download and install Java 8. Preferably add it to your PATH variables aswell : https://www.java.com/en/download/win10.jsp
3. Open IntelliJ and set the project SDK as Java 1.8 : https://www.jetbrains.com/help/idea/sdk.html
4. Import the project :
	File -> Open -> Select CucumbeSeleniumFramework folder from the "test" folder 
5. Wait for IntelliJ to resolve the maven dependencies and Index all files (May take a while depending on your PC)
6. Download and install Google chrome if you dont have it : https://www.google.com/chrome/
7. I've used a chrome driver thats setup to automate tests against Version 77.0.3865.120 of Google Chrome
		If you have a different version of Chrome, you will need to download the driver for your version and place it in the CucumberSeleniumFramework folder, replacing the current chrome driver : https://chromedriver.chromium.org/downloads



##Linux
###Steps to open the Framework

1. Download and install IntelliJ (If you don't have an Ultimate license you can use the community version) : https://www.jetbrains.com/idea/download/#section=linux
2. Download and install Java 8. Preferably add it to your PATH variables aswell : https://java.com/en/download/help/linux_x64_install.xml
3. Open IntelliJ and set the project SDK as Java 1.8 : https://www.jetbrains.com/help/idea/sdk.html
4. Import the project :
	File -> Open -> Select CucumbeSeleniumFramework folder from the "test" folder 
5. Wait for IntelliJ to resolve the maven dependencies and Index all files (May take a while depending on your PC)
6. Download and install Google chrome if you dont have it : https://www.google.com/chrome/
7. I've used a chrome driver thats setup to automate tests against Version 78 of Google Chrome
		If you have a different version of Chrome, you will need to download the driver for your version and place it in the CucumberSeleniumFramework folder, replacing the current chrome driver : https://chromedriver.chromium.org/downloads
8. The framework is set up to run on windows, so for linux you will have to edit the code :
	-In IntelliJ Project Sidebar, open Hook Class which is in the test/java/Steps/ folder
	-On line 21 replace "chromedriver.exe" with "chromedriver"
	
	
##Steps to run the tests
###From IntelliJ

1. In the project explorer sidebar of IntelliJ, go to src/test/ and Left Click on "Features" folder
2. Click "Run 'All Features in:Features'"
3. You will note some errors about undefined scenarios
	On the top click the dropdown named  'All Features in:Features' and then click "Edit Configurations..."
4. In the "Glue:" input box type in "Steps" and the click "OK"	
	This tells Cucumber were to find the Step Definitions for the feature files
5. Thereafter repeat steps 1 and 2 (Left click Features and Run all features)
6. All tests should run now. 




