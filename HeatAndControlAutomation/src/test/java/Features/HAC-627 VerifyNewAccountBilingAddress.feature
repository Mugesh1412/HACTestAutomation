        Feature: Verify the New Account Billing Address

  @test
  Scenario Outline: Login as Service Scheduler and Verify the new account billing Address
    Given HAC627New user enters "<username>" and "<password>"
    When HAC627New select the applicaton
    When HAC627New close all the open tabs
    When HAC627New close the bottom bar
    When HAC627New user is on account tab
    When HAC627New User should click on the new button and enter the necessary details to create a new account- Use Below Cretancials
      | Account Name       | Industry    | Shipping Address                                   |
      | New Account Test10 | Animal Food | 2422 Smith Ave, Baltimore, MD 21209, United States |
    Then HAC627New Compare the shipping Address and billing Address on the account record

    Examples: 
      | username                       | password    |
      | testservicescheduler@gmail.com | M@shaallah1 |
   