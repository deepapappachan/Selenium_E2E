Feature: Login to application

  Scenario Outline: Positive test validating login.
    Given Initialize the browser with chrome
    And Navigate to  "http://www.qaclickacademy.com/" site.
    And Click on Login link in homepage to land on secure sign in page.
    When User enters <username> and <password> and logs in
    Then Verify that user closes the browser
    Examples:
      |username         |password |
      |test99@gmail.com |123456   |
      |test11@gmail.com |123456   |