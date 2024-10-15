Feature: Verify the Trade Name field on the customer account

 
  Scenario Outline: Login as Service Users and Verify the Trade Name field
    Given HAC622 user enters <username> and <password>
    When HAC622 select the applicaton
    When HAC622 close all the open tabs
    When HAC622 close the bottom bar
    When HAC622 user is on account details
    Then HAC622 verify trade name

    Examples: 
      | username                              | password    |
      | hctestcsr@gmail.com                   | M@shaallah2 |
      | channelpartnermanagerusersarda@qa.hnc | M@shaallah1 |
      | testservicescheduler@gmail.com        | M@shaallah1 |

  
