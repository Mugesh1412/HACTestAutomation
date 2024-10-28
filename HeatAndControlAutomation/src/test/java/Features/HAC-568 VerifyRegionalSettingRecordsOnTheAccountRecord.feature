Feature: Verify the regional setting records on the account record

  Scenario Outline: Login as Service Scheduler and verify the regional setting records on the account record
    Given HAC568 user enters "<username>" and "<password>"
    When HAC568 select the applicaton
    When HAC568 close all the open tabs
    When HAC568 close the bottom bar
    When HAC568 user is on account tab
    When HAC568 User should click on the new button and enter the necessary details to create a new account- Use Below Cretancials
      | Account Name       | Industry    | Regional Setting         | Shipping Address                                   |
      | New Account Test10 | Animal Food | United States of America | 2422 Smith Ave, Baltimore, MD 21209, United States |
    Then HAC568 verify the regional setting value on the account record

    Examples: 
      | username                       | password |
      | testservicescheduler@gmail.com | H@ctest1 |  
                  