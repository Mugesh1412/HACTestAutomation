Feature: Verify the Industry field on the customer account

 
  Scenario Outline: Login as Service Users and Verify the Industry field
    Given HAC387 user enters <username> and <password>
    When HAC387 select the applicaton
    When HAC387 close all the open tabs
    When HAC387 close the bottom bar
    When HAC387 user is on account details
    Then HAC387 verify industry name

    Examples: 
      | username                              | password    |
      | hctestcsr@gmail.com                   | M@shaallah2 |
      | channelpartnermanagerusersarda@qa.hnc | M@shaallah1 |
      | testservicescheduler@gmail.com        | M@shaallah1 |

  
