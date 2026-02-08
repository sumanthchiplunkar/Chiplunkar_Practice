@sanity1

Feature: Validate Login Functionality for Guru 99 demo application

  Scenario Outline: Validate login functionality with correct credentials
    Given user launches the Guru99 demo application
    And user enters the "<user_id>" in the UserID textbox
    And user enters the "<password>" in the password textbox
    When user will click on the LOGIN button
    Then user will be navigated to Guru99 Demo application
    Then user closes the entire browser

    Examples: 
      | user_id    | password |
      | mngr647967 | sUgYzub  |
   #   | mngr651039 | rAzegaq  |
