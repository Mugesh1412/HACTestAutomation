Feature: Verify the customer account page layout fields


  Scenario Outline: Login as Service Users and Verify the account page layout fields
    Given HAC145 user enters <username> and <password>
    When HAC145 select the applicaton
    When HAC145 close all the open tabs
    When HAC145 close the bottom bar
    When HAC145 user is on account details
    Then HAC145 verify account name
    Then HAC145 verify parent account
    Then HAC145 verify type
    Then HAC145 verify industry
    Then HAC145 verify account currency
    Then HAC145 verify trade name label
    Then HAC145 verify trade name value
    Then HAC145 verify active label
    Then HAC145 verify customer portal account label
    Then HAC145 verify operating hours label
    Then HAC145 verify employees label
    Then HAC145 verify super region label
    Then HAC145 verify sales channel label
    Then HAC145 verify regional settings label
    Then HAC145 verify language label
    Then HAC145 verify website label

    Examples: 
      | username                              | password    |
      | hctestcsr@gmail.com                   | M@shaallah2 |
      | channelpartnermanagerusersarda@qa.hnc | M@shaallah1 |
      | testservicescheduler@gmail.com        | M@shaallah1 |
