Feature: To test Login Functionality

 
  Scenario: Validate login page title
    Given User is on login page
    Then Validate the page title of the loginpage is "DEMOQA"

  
  Scenario Outline: Validate the login functionality with invalid credentials
    Given User is on login page
    When User enters "<username>" in UserName field
    And User enters "<password>" in Password field
    And User clicks on Login button
    Then Validate "<expected_message>" is displayed
    
    Examples:
    | username        | password       | expected_message           |
    | invalid_user1   | invalid_pass1  | Invalid username or password! |
    | invalid_user2   | invalid_pass2  | Invalid username or password! |
    | invalid_user3		|	invalid_pass3	 | Invalid username or password! |

    
   