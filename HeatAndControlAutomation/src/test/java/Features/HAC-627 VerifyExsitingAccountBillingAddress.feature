Feature: Verify the Exsiting Account Billing Address

 
  Scenario Outline: Login as Service Users and Verify the exsiting account billing Address
    Given HAC627 user enters "<username>" and "<password>"
    When HAC627 select the applicaton
    When HAC627 close all the open tabs
    When HAC627 close the bottom bar
    When HAC627 user is on exsiting account details
    Then HAC627 verify the billing Address on exsiting account record
                            
    Examples:   
      | username            | password    |
      | hctestcsr@gmail.com | M@shaallah2 |
