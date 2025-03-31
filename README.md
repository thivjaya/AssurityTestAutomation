# Assurity Test Automation

This project includes API test designed to validate the "Get category" function . </br>

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
All necessary dependencies for test execution are specified in the pom.xml file. </br>
The testng.xml file is configured to pass the categoryID parameter. To validate multiple category IDs, the test suite can be extended using TestNG data providers.</br>
POJO classes are included to deserialize the API response, facilitating validation of additional fields as needed.

