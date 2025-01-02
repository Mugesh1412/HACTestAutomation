Feature: Verify the ability to add Case Team Members on the case details tab

  Scenario Outline: Login as Service Users and Verify the ability to add Case Team Members on the case details tab
    Given HAC408 user enters "<username>" and "<password>"
    When HAC408 select the applicaton
    When HAC408 close all the open tabs
    When HAC408 close the bottom bar
    When HAC408 user is on exsiting case record
    Then HAC408 verify Case Team section on the case details Tab
    Then HAC408 verify Case Team Members Role
    Then HAC408 Add Member on the case team section
    Then HAC408 Remove Member on the case team section

    Examples: 
      | username                       | password |
      | testservicescheduler@gmail.com | H@ctest1 |
