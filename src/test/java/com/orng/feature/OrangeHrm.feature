#Author: Mangai
Feature: OrangeHRM PIM module
  @Login
  Scenario: Login Entry
    Given Login Page
    When Enter Username "Admin"
    And Enter Password "admin123"
    And Click Login
    Then Validate the home page title
    
   @PIM_Module
   Scenario: PIM module
   When Click PIM
   And Wait for some time
   #And Move to Configuration
   #And Click Optional Fields
   #And Click Edit button
   #And Wait for some time more
   #And Click CheckBox1
   #And Click CheckBox2
   #And Click CheckBox3
   #And Click CheckBox4
   #And Click Save button
   
   #asList
   @AddEmployee
   Scenario: Add Employee details as list
   Given Click Add Employee
   When Enter the Employee Name
   |Mangai|G|Rajesh|
   And Enter Employee Id "0967"
   And Click the check box
   And Enter login details
   |Mangai|rajesh|rajesh|
   And select the status "Enabled"
   And save the details
   
  