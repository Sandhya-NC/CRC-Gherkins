Feature: As a admin, I want to validate the login page of the CRC

@loginpage
  Scenario Outline: I want to login to CRC application with valid credentials
    Given Enter the <url>
    And I am on the login page
    When I enter <email> and <password>
    And I click on the login button
    Then I should login successfull and should land on the home screen

    Examples: 
      | url                              | email                          | password  |
      | https://qa.creditrepaircloud.com | debuglog@creditrepaircloud.com | Test@1234 |
