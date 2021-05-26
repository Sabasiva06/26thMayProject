Feature: Validating Adacting Hotel page

  Background: 
    Given user is on Adacting page
    When user should enter username and password
    And User should click login button

  Scenario: Booking with Fields marked with Red asterix are mandatory
    When user on Serach page need to enter Select location , noofroom,cid,cod,adult per room
    And User need to clik search button

  Scenario: Booking with Fileds Without marked with Red asterix
    When user need to select hotels,roomtype,child per room
    And user need to proceed search button
    Then user need to validate error message
