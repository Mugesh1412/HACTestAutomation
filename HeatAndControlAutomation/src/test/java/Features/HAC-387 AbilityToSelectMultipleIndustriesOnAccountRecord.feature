Feature: Verify the ability to select multiple Industries value on the account record

  @bug
  Scenario Outline: Login as Service Scheduler and verify the ability to select multiple Industries value on the account record
    Given HAC387Multiselect user enters "<username>" and "<password>"
    When HAC387Multiselect select the applicaton
    When HAC387Multiselect close all the open tabs
    When HAC387Multiselect close the bottom bar
    When HAC387Multiselect user is on account tab
    When HAC387Multiselect User should click on the new button and enter the necessary details to create a new account- Use Below Cretancials
      | Account Name       | Industry1   | Industry2  |
      | New Account Test10 | Animal Food | Automotive |
    Then HAC387Multiselect verify the industries value on the account record

    Examples: 
      | username                       | password    |   
      | testservicescheduler@gmail.com | M@shaallah1 |
                                                                                                                                                                                                                                                                                                                    