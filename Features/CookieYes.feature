Feature: CookieYes Login

  Scenario: Logo presence on CookieYes home page
    Given I launch chrome browser
    When I open CookieYes home page
    Then I verify the logo present on page
    And close browser