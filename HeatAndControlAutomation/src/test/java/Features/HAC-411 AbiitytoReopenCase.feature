Feature: Verify the abiity to reopen the case

 
  Scenario Outline: Login as Service Users and Verify the ability t reopen the case
    Given HAC411 user enters <username> and <password>
    When HAC411 select the applicaton
    When HAC411 close all the open tabs
    When HAC411 close the bottom bar
    When HAC411 user is on case details
    When HAC411 edit the case status
    When HAC411 update case status to new
    When HAC411 click save
    Then HAC411 verify validation message

    Examples: 
      | username                              | password    |
      | hctestcsr@gmail.com                   | M@shaallah2 |
      | channelpartnermanagerusersarda@qa.hnc | M@shaallah1 |
      | testservicescheduler@gmail.com        | M@shaallah1 |

  
