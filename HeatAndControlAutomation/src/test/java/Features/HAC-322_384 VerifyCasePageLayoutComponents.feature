Feature: Verify the Case Page Layout Components

  Scenario Outline: Login as Service Users and Verify the Case Page Layout Components
    Given HAC322 user enters "<username>" and "<password>"
    When HAC322 select the applicaton
    When HAC322 close all the open tabs
    When HAC322 close the bottom bar
    When HAC322 user is on exsiting case record
    #On the case details page verify below fields
    #case Information
    Then HAC322 verify case owner field
    Then HAC322 verify account name field
    Then HAC322 verify contact name field
    Then HAC322 verify status field
    Then HAC322 verify priority field
    Then HAC322 verify contact phone field
    Then HAC322 verify contact email field
    #Additional Information
    Then HAC322 verify case origin field
    Then HAC322 verify type field
    #Description Information
    Then HAC322 verify subject field
    Then HAC322 verify description field
    Then HAC322 verify internal comments field
    #System Information
    Then HAC322 verify created by field
    Then HAC322 verify last modified by field
    Then HAC322 verify web email field
    Then HAC322 verify web name field
    Then HAC322 verify web company field
    Then HAC322 verify web phone field
    Then HAC322 verify web email field
    Then HAC322 verify date/time opened field
    Then HAC322 verify date/time closed field
    #On the Related List Quick Links verify below related list items
    Then HAC322 verify contact roles
    Then HAC322 verify case team
    Then HAC322 verify case comments      
    Then HAC322 verify work orders
    Then HAC322 verify open activities
    Then HAC322 verify activitiy history
    Then HAC322 verify fiels
    Then HAC322 verify approval history
    Then HAC322 verify case history
    #On the case tab verify the Below Lightning Page Layout Components
    Then HAC322 verify Details Tab
    #Then HAC322 verify Feed Tab
    Then HAC322 verify Related List Quick Links Tab
    #Then HAC322 verify Contact Details Tab
    Then HAC322 verify Activity Panel Tab
    Then HAC322 verify Related Knowlwdge Tab
    Then HAC322 verify Edit button
    Then HAC322 verify Create Work Order button
    Then HAC322 verify clone button
    Then HAC322 verify View Case Hierarchy button
    Then HAC322 verify change Owner button
    Then HAC322 verify Merge Cases button
    Then HAC322 verify Printable View button

    Examples: 
      | username                       | password |
      | testservicescheduler@gmail.com | H@ctest1 |
