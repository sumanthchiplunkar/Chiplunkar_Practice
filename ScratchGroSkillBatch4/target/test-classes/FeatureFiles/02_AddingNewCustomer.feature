@sanity

Feature: Validate Login Functionality for Guru 99 demo application

  Scenario Outline: Validate login functionality with correct credentials
    Given user launches the Guru99 demo application
    And user enters the "<user_id>" in the UserID textbox
    And user enters the "<password>" in the password textbox
    When user will click on the LOGIN button
    Then user will be navigated to Guru99 Demo application
    And user clicks on new customer link
    And user enters the "<cust_name>" in  customer name field
    And user selects the "<gender>" in gender field
    And user enters the "<dob>" in the date of birth field
    And user enters the "<address>" in the address field
    And user enters the "<city>" in the city field
    And user enters the "<Sate>" in the state field
    And user enters the "<PIN>" in the PIN field
    And user enters the "<Mobile>" in the mobile field
    And user enters the "<Email>" in the Email field
    And user enters the "<Password>" in the Password field
    Then user closes the entire browser

    Examples: 
      | user_id    | password | cust_name | dob        | address    | gender | city    | State     | Pin    | Mobile    | Email          | Password   |
      | mngr647967 | sUgYzub  | harry     | 24-11-1999 | karol bagh | male   | Karkala | Karnataka | 574122 | 7676765432| test@gmail.com | Test@123   |
