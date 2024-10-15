Feature: Verify the contact list views

 
  Scenario Outline: Login as Service Users and Verify the contact list views
    Given HAC1124 user enters <username> and <password>
    When HAC1124 select the applicaton
    When HAC1124 close all the open tabs
    When HAC1124 close the bottom bar
    When HAC1124 user is on contact home page
    When HAC1124 click on contact list view button
    Then HAC1124 verify the customer contact list view
    Then HAC1124 verify the heat and control billing contacts list view
    Then HAC1124 verify the heat and control sales contacts list view
    Then HAC1124 verify the vendor contacts list view
    Then HAC1124 select the customer contacts list view
    Then HAC1124 verify the name column in customer contact list view
    Then HAC1124 verify the title column in customer contact list view
    Then HAC1124 verify the account name column in customer contact list view
    Then HAC1124 verify the phone column in customer contact list view
    Then HAC1124 verify the mobile column in customer contact list view
    Then HAC1124 verify the preferred phone column in customer contact list view
    Then HAC1124 verify the email column in customer contact list view
    Then HAC1124 verify the mailing city column in customer contact list view
    Then HAC1124 verify the shift column in customer contact list view
    Then HAC1124 verify the location column in customer contact list view
  
                            
    Examples: 
      | username            | password    |
      | hctestcsr@gmail.com | M@shaallah2 |
