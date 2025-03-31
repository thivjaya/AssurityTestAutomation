# Assurity Test Automation

This project include API test for validating Get category function </br>

**Tools Used**</br>
Java(JDK) 17 </br>
Rest Assured 5.5.1 </br>

**Test Framework** </br>
TestNG 7.10.1 </br>

**Build Tool/ Dependency Management** </br>
Maven 3.9.9 </br>

## Introduction
This project include validation for three main Acceptance criteria to verify the Get Category API end point for a specific category
1. Name = "Carbon credits"
2. CanRelist = true
3. The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"

### Base URL
https://api.tmsandbox.co.nz/
### End point
**/v1/Categories/{categoryID}/Details.json**

### Test Execution
Maven test execution : **mvn clean test**

### Notes
All the dependencies related to the test execution have been added to the pom.xml. </br>
testng.xml file is added and category ID is passed through the xml.</br>
POJO classes are added to deserialize the response to validate other fields as well if necessary.


