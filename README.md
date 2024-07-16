## Web Form Automation Using Junit
## Overview
In this project, it demonstrates how to automate the submission of a form. The form is available on this site: https://www.digitalunite.com/practice-webform-learners. The automation process covers different kinds of input fields, such as text, date picker, file upload, and a successful submission message.
To automate this project, you need knowledge of Selenium WebDriver to interact with web elements (input fields, date picker, file upload, etc.) and the JUnit framework

## Essentials for automation
- Chromedriver
- Java
- Selenium Webdriver
- Junit Framework

## Elements of the Webform
- Name input field
- Phone numberinput Field
- Email imput field
- Date picker
- About input field
- Upload a document(less than 2MB)
- Mandatory Checkbox
- Submit Button

## Automation Process Overview
To automate the form filling, the findElements and findElement methods are used. These methods utilize locators such as id, cssSelector, tagName, and className to interact with web elements. The Thread.sleep method is also called to pause the execution for 4000 ms.
The click() method is used to click the buttons. For assertion, the getText() method is used to retrieve the text and verify if the actual text matches the expected text ("Thank you for your submission!"). The comparison is done using the assertEquals() method.

## Report:
- Need to use gradle for creating the report.
- For installation in this project Binary only file is used
- Report shows the success rate of the test
- Used the "gradle clean test" command for creating the test report.

## Screenshot of the Report:

![Junit_assignment_report](https://github.com/user-attachments/assets/61643f7f-6a3e-4f96-80eb-4f7a848ef784)



