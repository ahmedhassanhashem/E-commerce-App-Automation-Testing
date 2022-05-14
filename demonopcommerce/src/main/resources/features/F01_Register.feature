@SmokeTesting
Feature: User could register with valid data

  Background: User navigates to demo.nopcommerce website


  Scenario: User register with valid data

    Given Click on Register tab
    #Your Personal Details
    When Click on any radio button to chose gender
    And User enter First name and Last name
    And User Select Date of Birth: Select [Day, Month, Year]
    And User enter email: "testing@automation.com"
    #Company Details
    And Fill Company name
    #Your Password
    And User enter Password and Confirm it: "P@ssw0rd"
    And Click on REGISTER button

    Then User could register successfully
    And Click on CONTINUE button