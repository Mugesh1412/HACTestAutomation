Feature: Verify the Case Type and CaseSub Type

  
  Scenario Outline: Login as Service Users and Verify the Case Type and CaseSub Type
    Given HAC702 user enters "<username>" and "<password>"
    When HAC702 select the applicaton
    When HAC702 close all the open tabs
    When HAC702 close the bottom bar
    When HAC702 Click New Button On the case Tab
    Then HAC702 verify case Types
    Then HAC702 verify case Sub Types

    Examples: 
      | username                       | password |
      | testservicescheduler@gmail.com | H@ctest1 |
                                                               